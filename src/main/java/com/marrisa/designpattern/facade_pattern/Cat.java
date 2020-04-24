package com.marrisa.designpattern.facade_pattern;

/**
 * @Auther: Darryl
 * @Description: 猫
 * @Date: 2020/04/24
 */
public class Cat implements Animal {
	@Override
	public void voice() {
		System.out.println("cat voice is miaomiao");
	}
}
