package cn.my.spring.context.support;

import cn.my.spring.beans.factory.BeanFactory;
import cn.my.spring.beans.factory.config.BeanDefinition;


/**
 * @author gengweiweng
 * @time 2021/11/27
 * @desc 抽象Bean工厂类
 */

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String beanName) throws BeansException {
        return null;
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
