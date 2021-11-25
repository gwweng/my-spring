package cn.my.spring.context.support;

import cn.my.spring.beans.factory.ConfigurableListableBeanFactory;
import cn.my.spring.context.DefaultLisableBeanFactory;

/**
 * @author gengweiweng
 * @time 2021/11/25
 * @desc
 */
public class GenericApplicationContext extends AbstractApplicationContext{

    private final DefaultLisableBeanFactory beanFactory;

    public GenericApplicationContext(DefaultLisableBeanFactory beanFactory) {
        this.beanFactory = new DefaultLisableBeanFactory();
    }

    @Override
    public ConfigurableListableBeanFactory getBeanFactory() {
        return this.beanFactory;
    }
}
