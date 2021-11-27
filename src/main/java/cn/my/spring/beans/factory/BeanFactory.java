package cn.my.spring.beans.factory;

import cn.my.spring.context.support.BeansException;

/**
 * @author gengweiweng
 * @time 2021/11/25
 * @desc Spring容器
 */
public interface BeanFactory {
    /**
     * 根据名称获取Bean
     * @param beanName bean名称
     * @return Spring Bean
     */
    Object getBean(String beanName) throws BeansException;
}
