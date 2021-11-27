package cn.my.spring.beans.factory.config;

import lombok.Data;

/**
 *
 * @author gengweiweng
 * @time 2021/11/25
 * @desc 简易版BeanDefinition
 */
@SuppressWarnings({"rawtypes"})
@Data
public class BeanDefinition {
    /*****************************************************
     * Spring中使用BeanDefinition来存储Bean的所有属性定义
     * 包括class类型，是否单例，是否有实例化参数、是否有构造方法、是否有方法覆盖等
     ******************************************************/
    private Object bean;

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }


}
