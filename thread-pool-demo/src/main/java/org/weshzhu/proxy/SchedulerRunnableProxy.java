package org.weshzhu.proxy;

import org.demonzsd.common.utils.DateTimeUnits;
import org.demonzsd.common.utils.DateTimeUtils;
import org.springframework.stereotype.Component;
import org.weshzhu.entity.SchedulerProcessInfo;
import org.weshzhu.service.DataProcessService;

import javax.annotation.Resource;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.UUID;

/**
 * @author zsd
 * 代理类，用于代理 {@code Runnable} 接口类，代理类用于记录任务执行结果： {@link SchedulerProcessInfo}，并写入到
 * 记录中。
 */
@Component
public class SchedulerRunnableProxy implements InvocationHandler{

    private final String dateTimePattern = "yyyy-MM-dd HH:mm:ss";

    @Resource
    private DataProcessService dataProcessService;

    /**
     * 被代理对象
     */
    private final Runnable target;
    /**
     * 任务名称
     */
    private final String taskName;


    public SchedulerRunnableProxy(Runnable target, String taskName) {
        this.target = target;
        this.taskName = taskName;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        SchedulerProcessInfo prcInfo = this.addProcessInfo(this.taskName);
        // 调用 target 的 method 方法
        Object result = null;
        if(lock(this.taskName)){
            try{
                dataProcessService.test();
                result = method.invoke(target, args);
                prcInfo.setResultDesc("Execute task success.");
            }catch (InvocationTargetException exception){
                prcInfo.setResultDesc(exception.getCause().toString());
            }
        }else {
            prcInfo.setResultDesc("do noting with task, because of getting lock failed.");
        }        updateProcessInfo(prcInfo);
        return result;
    }

    /**
     * 任务开始时，进行记录信息
     * @param taskName 任务名称
     * @return 返回任务信息
     */
    private SchedulerProcessInfo addProcessInfo(String taskName){
        SchedulerProcessInfo info = new SchedulerProcessInfo();
        info.setTaskId(UUID.randomUUID().toString());
        info.setStartTime(DateTimeUtils.getNowDT(dateTimePattern));
        info.setResultDesc("开始执行");
        info.setTaskName(taskName);
        System.out.println("Saved the process info : [" + info + "]");
        return info;
    }

    /**
     * 任务执行完成后，对任务信息进行更新
     * @param info
     */
    private void updateProcessInfo(SchedulerProcessInfo info){
        info.setEndTime(DateTimeUtils.getNowDT(dateTimePattern));
        try {
            info.setTaskTimeConsuming(DateTimeUtils.getDateDiff(info.getEndTime(), info.getStartTime(), DateTimeUnits.SECONDS));
        } catch (Exception e) {
            info.setTaskTimeConsuming(0);
            info.setResultDesc("时间转换失败");
        }finally {
            info.setEndTime(DateTimeUtils.getNowDT(dateTimePattern));
            System.out.println("Updated the process info : [" + info + "]");
        }
    }

    private boolean lock(String lockName){
        return true;
    }

    private boolean unlock(String lockName){
        return true;
    }

}
