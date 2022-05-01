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

@Component
@EnableScheduling
public class DataProcessScheduler implements SchedulingConfigurer {

    @Autowired
    private DataProcessTask task;

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        Trigger trigger = triggerContext -> {
            CronTrigger cronTrigger = new CronTrigger("0 0/1 * * * ?");
            return cronTrigger.nextExecutionTime(triggerContext);
        };
        ClassLoader classLoader = task.getClass().getClassLoader();
        Class[] interfaces = task.getClass().getInterfaces();
        Runnable proxy = (Runnable) Proxy.newProxyInstance(classLoader, interfaces, new SchedulerRunnableProxy(task, "data-process"));
        taskRegistrar.addTriggerTask(proxy, trigger);
    }
}
