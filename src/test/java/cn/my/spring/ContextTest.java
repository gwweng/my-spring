package cn.my.spring;

import cn.my.spring.beans.TestService;
import cn.my.spring.beans.factory.BeanFactory;
import cn.my.spring.beans.factory.config.BeanDefinition;
import cn.my.spring.context.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @author gengweiweng
 * @time 2021/11/25
 * @desc
 */
public class ContextTest {

    @Test
    public void test_BeanFactory() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition(TestService.class);
        beanFactory.registerBeanDefinition("testService", beanDefinition);

        // 3.第一次获取bean
        TestService testService = (TestService) beanFactory.getBean("testService");
        testService.sayHello();

        // 3.第二次获取bean
        TestService testService1 = (TestService) beanFactory.getBean("testService");
        testService.sayHello();

        System.out.println(testService == testService1);

    }
}
