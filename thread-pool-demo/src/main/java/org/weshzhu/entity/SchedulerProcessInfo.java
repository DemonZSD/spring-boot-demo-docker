package org.weshzhu.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author zsd
 * 任务执行信息
 */
@Getter
@Setter
@ToString
public class SchedulerProcessInfo {

    /**
     * taskId
     */
    private String taskId;

    /**
     * 任务名称
     */
    private String taskName;
    /**
     * 任务执行耗时 单位s
     */
    private int taskTimeConsuming;
    /**
     * 执行结果描述
     */
    private String resultDesc;
    /**
     * 任务启动时间
     */
    private String startTime;
    /**
     * 任务完成时间
     */
    private String endTime;
}
