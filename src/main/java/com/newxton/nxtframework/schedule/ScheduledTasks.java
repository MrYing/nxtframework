package com.newxton.nxtframework.schedule;

import com.newxton.nxtframework.component.NxtAclComponent;
import com.newxton.nxtframework.component.NxtGlobalSettingComponent;
import com.newxton.nxtframework.entity.NxtCronjob;
import com.newxton.nxtframework.service.NxtCronjobService;
import com.newxton.nxtframework.schedule.task.NxtTaskMoveImage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author soyojo.earth@gmail.com
 * @time 2020/10/8
 * @address Shenzhen, China
 * Cronjob 任务分发
 */
@Component
public class ScheduledTasks {

    private Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);

    private Map<String,Long> lastJobStatusDatelineMap = new HashMap<>();

    @Resource
    private NxtCronjobService nxtCronjobService;

    @Resource
    private NxtTaskMoveImage nxtTaskMoveImage;

    @Resource
    private NxtGlobalSettingComponent nxtGlobalSettingComponent;

    @Resource
    private NxtAclComponent nxtAclComponent;

    @Scheduled(fixedDelay = 5000)
    public void checkCronJob() {
        //仅查询10分钟之内更新过status的任务
        NxtCronjob nxtCronjobCondition = new NxtCronjob();
        nxtCronjobCondition.setJobStatusDateline(System.currentTimeMillis()-600000);
        List<NxtCronjob> list = nxtCronjobService.queryAllGreaterThanStatusDateline(nxtCronjobCondition);
        for (NxtCronjob nxtCronjob : list) {
            //检查、执行Job(阻塞式)
            this.checkAndRunTask(nxtCronjob);
        }
    }

    /**
     * 检查、执行Job(阻塞式)
     * @param nxtCronjob
     */
    private void checkAndRunTask(NxtCronjob nxtCronjob){
        String jobKey = nxtCronjob.getJobKey();
        Integer jobStatus = nxtCronjob.getJobStatus();
        Long jobStatusDateline = nxtCronjob.getJobStatusDateline();
        if (jobKey == null){
            return;
        }
        else {
            //分发任务
            if (jobKey.equals("moveLocalImageToQiniu") && jobStatus.equals(1)){
                //把本地图片移动到七牛云
                nxtTaskMoveImage.moveLocalImageToQiniu();
            }
            else if (jobKey.equals("moveQiniuImageToLocal") && jobStatus.equals(1)){
                //把七牛云图片搬到本地
                nxtTaskMoveImage.moveQiniuImageToLocal();
            }
        }
    }

    @Scheduled(fixedDelay = 15000)
    public void cleanSettingCache() {
        //15秒清理一次Setting缓存
        nxtGlobalSettingComponent.cleanCache();
    }

    @Scheduled(fixedDelay = 15000)
    public void cleanAclCache() {
        //15秒清理一次ACL缓存
        nxtAclComponent.cleanCache();
    }

}
