package cn.my.spring.context.support;

import cn.my.spring.beans.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author gengweiweng
 * @time 2021/11/27
 * @desc
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry{

    private final Map<String, BeanDefinition> beanDefinitionMap =  new ConcurrentHashMap<>();
    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) {
            throw new BeansException("No bean named '" + beanName + "' is defined");
        }
        return beanDefinition;

    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition bd) {
        beanDefinitionMap.put(beanName, bd);
    }
}
