package org.demonzsd.springbootdemo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author weshzhu
 * 切面类，用于分析 方法耗时
 */
@Aspect
public class TimeConsumingStatisticAspect {

    Logger logger = LoggerFactory.getLogger(TimeConsumingStatisticAspect.class);

    @Around("execution(* org.demonzsd.springbootdemo.service.*.*(..))")
    public Object methodTimeConsumingStatistic(ProceedingJoinPoint pjp) throws Throwable{
        long time = System.currentTimeMillis();
        Object ret = pjp.proceed();
        long useTime = System.currentTimeMillis() - time;
        logger.warn("记录: " + pjp.getTarget() + "." + pjp.getSignature() + "耗时：" + useTime/1000 + "秒");
        return ret;
    }

}
