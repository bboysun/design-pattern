package com.marrisa.designpattern.command_pattern;

/**
 * @Auther: Darryl
 * @Description: 命令模式Demo类入口
 * @Date: 2020/04/18
 */
public class CommandDemo {

	public static void main(String[] args) {
		Broker broker = new Broker();

		broker.takeOrder(new BuyOrder(new Stock("TTT",2000)));
		broker.takeOrder(new SellOrder(new Stock("TTT",100)));

		broker.placeOrder();
	}

}
