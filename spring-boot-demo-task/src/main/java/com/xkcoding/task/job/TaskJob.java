package com.xkcoding.task.job;

import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * <p>
 * 定时任务
 * </p>
 *
 * @package: com.xkcoding.task.job
 * @description: 定时任务
 * @author: yangkai.shen
 * @date: Created in 2018/11/22 19:09
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Component
@Slf4j
public class TaskJob {

    /**
     * 按照标准时间来算，每隔 10s 执行一次
     * (cron = "0/2 17 14 25 8 ? 2005") 秒 分 时 天 月 周(1~7 1为SUN-依次为SUN，MON，TUE，WED，THU，FRI，SAT) 年
     * 也可以使用区间标识 25-26 就说25号到26号之间
     */
    @Scheduled(cron = "0/2 17 14 25 8 ?")
    public void job1() {
        log.info("【job1】开始执行：{}", DateUtil.formatDateTime(new Date()));
    }

    /**
     * 从启动时间开始，间隔 2s 执行
     * 固定间隔时间
     */
    /*@Scheduled(fixedRate = 2000)
    public void job2() {
        log.info("【job2】开始执行：{}", DateUtil.formatDateTime(new Date()));
    }*/

    /**
     * 从启动时间开始，延迟 5s 后间隔 4s 执行
     * 固定等待时间
     */
   /* @Scheduled(fixedDelay = 4000, initialDelay = 5000)
    public void job3() {
        log.info("【job3】开始执行：{}", DateUtil.formatDateTime(new Date()));
    }*/
}