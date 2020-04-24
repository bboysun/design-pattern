package com.marrisa.designpattern.proxy_pattern.cglib_proxy;

import com.marrisa.designpattern.proxy_pattern.Snow;
import com.marrisa.designpattern.proxy_pattern.SnowImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Auther: Darryl
 * @Description: cglib proxy
 * @Date: 2020/04/24
 */
public class CglibProxy implements MethodInterceptor {
	private Object target;

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("Cglib proxy 在被代理类执行之前的操作。。。");
		Object res = method.invoke(target, objects);
		System.out.println("Cglib proxy 在被代理类执行之后的操作。。。");
		return res;
	}

	// 获取代理对象
	private Object getCglibProxy(Object target) {
		this.target = target;
		Enhancer enhancer = new Enhancer();
		// 从这里可以看出cglib生成的匿名代理类是继承了被代理类的
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(this);
		Object res = enhancer.create();
		return res;
	}

	// cglib proxy test demo
	public static void main(String[] args) {
		CglibProxy proxy = new CglibProxy();
		Snow sonwCglibPorxy = (Snow) proxy.getCglibProxy(new SnowImpl());
		sonwCglibPorxy.color("BLUE");
	}
}
