package com.marrisa.designpattern.command_pattern;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Auther: Darryl
 * @Description: 命令的统一的调用器
 * @Date: 2020/04/18
 */
public class Broker {
	private List<Order> orderList = Lists.newArrayList();

	public void takeOrder(Order order) {
		orderList.add(order);
	}

	public void placeOrder() {
		orderList.forEach(order -> {
			order.execute();
		});
		orderList.clear();
	}
}
