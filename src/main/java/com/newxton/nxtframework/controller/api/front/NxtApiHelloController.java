package com.newxton.nxtframework.controller.api.front;

import com.newxton.nxtframework.entity.NxtUser;
import com.newxton.nxtframework.service.NxtUserService;
import com.newxton.nxtframework.struct.NxtStructApiResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author soyojo.earth@gmail.com
 * @time 2020/7/21
 * @address Shenzhen, China
 * @copyright NxtFramework
 */
@RestController
public class NxtApiHelloController {

    @Resource
    private NxtUserService nxtUserService;

    @RequestMapping("/api/hello")
    public NxtStructApiResult exec() {

        //心跳检查
        NxtUser user = nxtUserService.queryById(1L);

        return new NxtStructApiResult();

    }

}
