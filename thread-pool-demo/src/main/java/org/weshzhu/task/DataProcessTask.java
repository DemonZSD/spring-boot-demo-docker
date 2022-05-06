package org.weshzhu.task;

import org.springframework.stereotype.Component;

/**
 * @author zsd
 * 任务处理业务逻辑类，主要编写run方法里的执行过程
 */
@Component
public class DataProcessTask implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            // throw new IllegalArgumentException("测试异常情况");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
