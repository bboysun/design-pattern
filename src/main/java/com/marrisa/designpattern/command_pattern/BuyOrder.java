package com.marrisa.designpattern.command_pattern;

/**
 * @Auther: Darryl
 * @Description: 具体买的命令
 * @Date: 2020/04/18
 */
public class BuyOrder implements Order {
	private Stock stock;

	public BuyOrder(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.buy();
	}
}
