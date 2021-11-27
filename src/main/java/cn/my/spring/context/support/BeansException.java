package cn.my.spring.context.support;

/**
 * @author gengweiweng
 * @time 2021/11/27
 * @desc
 */
public class BeansException extends RuntimeException{
    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
