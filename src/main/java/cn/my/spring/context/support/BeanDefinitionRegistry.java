package cn.my.spring.context.support;

import cn.my.spring.beans.factory.config.BeanDefinition;

/**
 * @author gengweiweng
 * @time 2021/11/25
 * @desc
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition bd);
}
