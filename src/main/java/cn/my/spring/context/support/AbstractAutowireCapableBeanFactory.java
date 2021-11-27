package cn.my.spring.context.support;

import cn.my.spring.beans.factory.config.BeanDefinition;

/**
 * @author gengweiweng
 * @time 2021/11/27
 * @desc
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
             bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException  | IllegalAccessException e) {
            e.printStackTrace();
        }
        addSingleton(beanName, bean);
        return bean;
    }
}
