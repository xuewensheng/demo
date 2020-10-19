package com.example.demo.dynamicProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author : xuewensheng
 * @version :
 * @date : Created in 10:52 2020/10/15
 */
public class CglibProxy implements MethodInterceptor {


    private Object targrt;


    public CglibProxy(Object targrt) {
        this.targrt = targrt;
    }

    public Object createProxy(){
        //增强器
        Enhancer enhancer = new Enhancer();
        //创建子类，作为代理类
        enhancer.setSuperclass(Girl.class);
        //设置回调类
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("饭前");
        method.invoke(targrt,objects);
        System.out.println("饭后");
        return null;
    }
}
