package org.weshzhu.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;
import org.weshzhu.proxy.SchedulerRunnableProxy;
import org.weshzhu.task.DataProcessTask;

import java.lang.reflect.Proxy;

/**
 * 数据处理任务，任务调度配置类
 */
@Component
@EnableScheduling
public class DataProcessScheduler implements SchedulingConfigurer {

    @Autowired
    private DataProcessTask task;

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        Trigger trigger = triggerContext -> {
            CronTrigger cronTrigger = new CronTrigger("0 0/1 * * * ?");
            System.out.println("------------------------" + cronTrigger.getExpression());
            return cronTrigger.nextExecutionTime(triggerContext);
        };
        ClassLoader classLoader = task.getClass().getClassLoader();
        Class[] interfaces = task.getClass().getInterfaces();
        // 通过反射进行获取 runnable 实现类对象
        Runnable proxy = (Runnable) Proxy.newProxyInstance(classLoader, interfaces, new SchedulerRunnableProxy(task, "data-process"));
        taskRegistrar.addTriggerTask(proxy, trigger);

    }
}
