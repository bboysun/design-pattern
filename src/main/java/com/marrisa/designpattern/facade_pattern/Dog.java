package com.marrisa.designpattern.facade_pattern;

/**
 * @Auther: Darryl
 * @Description: 狗
 * @Date: 2020/04/24
 */
public class Dog implements Animal {
	@Override
	public void voice() {
		System.out.println("dog voice is wangwang");
	}
}
