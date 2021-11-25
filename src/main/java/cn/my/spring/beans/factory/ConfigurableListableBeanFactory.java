package cn.my.spring.beans.factory;

/**
 * @author gengweiweng
 * @time 2021/11/25
 * @desc Spring应用上下文容器
 */
public interface ConfigurableListableBeanFactory extends BeanFactory {
    /*********************************************************************
     * 真实的Spring继承的接口并不是直接继承BeanFactory,而是通过简接继承BeanFactory
     * 拥有getBean的能力，在BeanFactory基础上其扩展了以下功能方法
     *  1、2个忽略自动装配的的方法。
     *  2、1个注册一个可分解依赖的方法。
     *  3、1个判断指定的Bean是否有资格作为自动装配的候选者的方法。
     *  4、1个根据指定bean名，返回注册的Bean定义的方法。
     *  5、2个冻结所有的Bean配置相关的方法。
     *  6、1个使所有的非延迟加载的单例类都实例化的方法。
     *********************************************************************/
}
