package cn.my.spring.context.support;

import cn.my.spring.beans.factory.config.SingletonBeanRegistry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author gengweiweng
 * @time 2021/11/27
 * @desc
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {


    private final Map<String, Object> singletonObjects = new ConcurrentHashMap<>();
    @Override
    public Object getSingleton(String beanName) {

        return singletonObjects.get(beanName);
    }


    protected void addSingleton(String beanName, Object singletonObject){
        synchronized (this.singletonObjects){
            singletonObjects.put(beanName, singletonObject);
        }

    }
}
