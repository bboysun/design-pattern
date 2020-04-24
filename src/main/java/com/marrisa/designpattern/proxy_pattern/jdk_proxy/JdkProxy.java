package com.marrisa.designpattern.proxy_pattern.jdk_proxy;

import com.marrisa.designpattern.proxy_pattern.Snow;
import com.marrisa.designpattern.proxy_pattern.SnowImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: Darryl
 * @Description: jdk proxy
 * @Date: 2020/04/24
 */
public class JdkProxy implements InvocationHandler {

	private Object target;

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("JDK proxy 在被代理类方法之前的操作。。。");
		Object res = method.invoke(target, args);
		System.out.println("JDK proxy 在被代理类方法之后的操作。。。");
		return res;
	}

	// 获取代理对象
	private Object getProxyObject(Object o) {
		this.target = o;
		// 从这里可以看出来，JDK动态代理生成的代理类和被代理类实现同一个接口
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}

	// Test jdk proxy
	public static void main(String[] args) {
		JdkProxy proxy = new JdkProxy();
		Snow proxySnow = (Snow) proxy.getProxyObject(new SnowImpl());
		proxySnow.color("BLUE");
	}
}
