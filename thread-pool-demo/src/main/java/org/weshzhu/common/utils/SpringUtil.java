package org.weshzhu.common.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringUtil implements ApplicationContextAware{

    public static ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext arg0) throws BeansException {
        if(SpringUtil.applicationContext == null){
            SpringUtil.applicationContext = arg0;
        }
        System.out.println("---------------");
    }

    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }

    /**
     * 根据 application 容器中bean实例的名称获取对象
     * @param beanName application 容器中bean实例的名称
     * @return
     */
    public static Object getBean(String beanName){
        return getApplicationContext().getBean(beanName);
    }

    /**
     * 根据容器中bean对应的类获取对象
     * @param <T> 返回指定类型的对象
     * @param clazz 
     * @return
     */
    public static <T> T getBean(Class<T> clazz){
        return getApplicationContext().getBean(clazz);
    }
    
    /**
     * 根据 application 容器中bean实例的名称和指定的类，获取对象
     * @param <T> 对象类型
     * @param name application 容器中bean实例的名称
     * @param clazz 容器中bean对应的类
     * @return
     */
    public static <T> T getBean(String name, Class<T> clazz){
        return getApplicationContext().getBean(name, clazz);
    }

}
