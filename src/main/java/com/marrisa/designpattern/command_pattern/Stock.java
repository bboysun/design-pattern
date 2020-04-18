package com.marrisa.designpattern.command_pattern;

/**
 * @Auther: Darryl
 * @Description: 一个股票的请求类
 * @Date: 2020/04/18
 */
public class Stock {
	private String name;
	private int quantity;

	public Stock(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	public void buy() {
		System.out.println("buy [" + quantity + "] stock name is [" + name + "]");
	}

	public void sell() {
		System.out.println("sell [" + quantity + "] stock name is [" + name + "]");
	}
}
