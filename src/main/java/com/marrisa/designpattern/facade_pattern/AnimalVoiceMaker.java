package com.marrisa.designpattern.facade_pattern;

/**
 * @Auther: Darryl
 * @Description: 动物叫声的门户模式类（外观模式类）
 * 现有的系统添加一个接口，来隐藏系统的复杂性。
 * 这种模式涉及到一个单一的类，该类提供了客户端请求的简化方法和对现有系统类方法的委托调用。
 *
 * 外观模式 和 代理模式 和 装饰模式 之间的对比思考
 * @Date: 2020/04/24
 */
public class AnimalVoiceMaker {
	private Cat cat;
	private Dog dog;

	public AnimalVoiceMaker(Cat cat, Dog dog){
		this.cat = cat;
		this.dog = dog;
	}

	public void dogVoice() {
		dog.voice();
	}

	public void catVoice() {
		cat.voice();
	}
}
