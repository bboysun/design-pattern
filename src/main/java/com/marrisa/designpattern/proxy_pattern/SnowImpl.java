package com.marrisa.designpattern.proxy_pattern;

/**
 * @Auther: Darryl
 * @Description: snow implement class
 * @Date: 2020/04/24
 */
public class SnowImpl implements Snow {
	@Override
	public void color(String color) {
		System.out.println("snow color is " + color);
	}
}
