package com.example.demo.dynamicProxy;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author : xuewensheng
 * @version :
 * @date : Created in 10:51 2020/10/15
 */
public class JDKProxy {

    public static void main(String[] args){
        try {
            Class  girlClass = Class.forName("com.example.demo.dynamicProxy.Girl");
            Human girl  = (Human) Proxy.newProxyInstance(girlClass.getClassLoader(), girlClass.getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                    System.out.println("饭前");
                    method.invoke(girlClass.getConstructor().newInstance(),objects);
                    System.out.println("饭后");
                    return null;
                }
            });
            System.out.println(girl.getClass().getName());
            girl.eat();

           Girl girl1 =   (Girl)new CglibProxy(new Girl()).createProxy();
           System.out.println(girl1.getClass().getName());
           girl1.eat();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
