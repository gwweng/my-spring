package cn.my.spring.context.support;


import cn.my.spring.beans.factory.ConfigurableListableBeanFactory;

/**
 * @author gengweiweng
 * @time 2021/11/25
 * @desc
 */
public abstract  class AbstractApplicationContext {


    public  abstract ConfigurableListableBeanFactory getBeanFactory();

    private Object getBean(String beanName){
        return this.getBeanFactory().getBean(beanName);
    }
}
