package com.marrisa.designpattern.command_pattern;

/**
 * @Auther: Darryl
 * @Description: 具体卖出的命令
 * @Date: 2020/04/18
 */
public class SellOrder implements Order {
	private Stock stock;

	public SellOrder(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.sell();
	}
}
