package com.newxton.nxtframework.controller.api.front.ucenter;

import com.alibaba.fastjson.JSONObject;
import com.newxton.nxtframework.entity.NxtUser;
import com.newxton.nxtframework.exception.NxtException;
import com.newxton.nxtframework.process.NxtProcessVerifyCode;
import com.newxton.nxtframework.service.NxtUserService;
import com.newxton.nxtframework.struct.NxtStructApiResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author soyojo.earth@gmail.com
 * @time 2020/11/28
 * @address Shenzhen, China
 * @copyright NxtFramework
 */
@RestController
public class NxtApiUserPhoneRemoveVerifyCodeController {

    @Resource
    private NxtUserService nxtUserService;

    @Resource
    private NxtProcessVerifyCode nxtProcessVerifyCode;

    @RequestMapping(value = "/api/user/phone/remove/verify_code", method = RequestMethod.POST)
    public NxtStructApiResult index(@RequestHeader(value = "user_id", required = true) Long userId, @RequestBody JSONObject jsonParam) {

        NxtUser user = nxtUserService.queryById(userId);

        String phone = user.getPhone();

        if (phone == null || phone.isEmpty()){
            return new NxtStructApiResult(54,"您未绑定手机号");
        }

        //-1：解除绑定 1：绑定账户 2：找回密码 3：提现验证

        try {
            //发送手机号验证码
            Long code = nxtProcessVerifyCode.createAndSendPhoneOrEmailVerifyCode(phone,-1);
            return new NxtStructApiResult(53,"验证码【"+code+"】。本开源系统不提供验证码发送功能，请自行开发或联系我们进行二次开发。");
        }
        catch (NxtException e){
            return new NxtStructApiResult(54,e.getNxtExecptionMessage());
        }

    }

}
