package org.demonzsd.springbootdemo.service.impl;

import org.demonzsd.springbootdemo.service.TimeConsumingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author weshzhu
 * 耗时实现类
 */
@Service
public class TimeConsumingServiceImpl implements TimeConsumingService {

    Logger logger = LoggerFactory.getLogger(TimeConsumingServiceImpl.class);

    @Override
    public void mockTimeConsuming(Object object) {

        logger.info("this is the long time consuming method... ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            logger.error("execute the method occurs an error :", e);
            e.printStackTrace();
        }
    }
}
