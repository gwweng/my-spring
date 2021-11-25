package cn.my.spring.context;

import cn.my.spring.beans.factory.ConfigurableListableBeanFactory;
import cn.my.spring.beans.factory.config.BeanDefinition;
import cn.my.spring.context.support.BeanDefinitionRegistry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author gengweiweng
 * @time 2021/11/25
 * @desc
 */
public class DefaultLisableBeanFactory implements ConfigurableListableBeanFactory, BeanDefinitionRegistry {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    @Override
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

    @Override
    public Object getBean(String beanName) {
        return beanDefinitionMap.get(beanName).getBean();
    }
}
