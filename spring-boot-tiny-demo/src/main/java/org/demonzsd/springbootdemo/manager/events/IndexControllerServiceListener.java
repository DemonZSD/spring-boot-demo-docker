package org.demonzsd.springbootdemo.manager.events;

import org.demonzsd.springbootdemo.manager.events.entity.EventSource;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationListenerMethodAdapter;
import org.springframework.stereotype.Service;

/**
 * 监听器，用于监听 {@code IndexControllerEvent} 事件
 * @author weshzhu
 */
@Service
public class IndexControllerServiceListener implements ApplicationListener<IndexControllerEvent> {
    @Override
    public void onApplicationEvent(IndexControllerEvent event) {
        // TODO  监听事件发生后，要做的事情
        Object source = event.getSource();
        if (source instanceof EventSource) {
            System.out.println(source.toString());
        }

        System.out.println("the eve nt happened!");
    }
}
