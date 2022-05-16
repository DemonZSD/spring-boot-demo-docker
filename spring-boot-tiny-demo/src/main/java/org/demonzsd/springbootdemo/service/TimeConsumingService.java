package org.demonzsd.springbootdemo.service;

/**
 * @author weshzhu
 * 耗时记录
 */
public interface TimeConsumingService {

    /**
     * 模拟耗时的方法
     * @param object
     */
    void mockTimeConsuming(Object object);

}
