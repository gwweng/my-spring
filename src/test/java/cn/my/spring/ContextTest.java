package cn.my.spring;

import cn.my.spring.beans.TestService;
import cn.my.spring.beans.factory.BeanFactory;
import cn.my.spring.beans.factory.config.BeanDefinition;
import cn.my.spring.context.DefaultLisableBeanFactory;
import org.junit.Test;

/**
 * @author gengweiweng
 * @time 2021/11/25
 * @desc
 */
public class ContextTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new DefaultLisableBeanFactory();

        // 2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new TestService());
        ((DefaultLisableBeanFactory) beanFactory).registerBeanDefinition("testService", beanDefinition);

        // 3.获取bean
        TestService testService = (TestService) beanFactory.getBean("testService");
        testService.sayHello();
    }
}
