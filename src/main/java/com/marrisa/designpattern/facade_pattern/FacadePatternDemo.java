package com.marrisa.designpattern.facade_pattern;

/**
 * @Auther: Darryl
 * @Description: 外观模式demo类
 * @Date: 2020/04/24
 */
public class FacadePatternDemo {

	public static void main(String[] args) {
		AnimalVoiceMaker maker = new AnimalVoiceMaker(new Cat(), new Dog());
		maker.catVoice();
		maker.dogVoice();
	}

}
