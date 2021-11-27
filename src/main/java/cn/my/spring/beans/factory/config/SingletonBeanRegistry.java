package cn.my.spring.beans.factory.config;

/**
 * @author gengweiweng
 * @time 2021/11/27
 * @desc 单例注册接口类
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
