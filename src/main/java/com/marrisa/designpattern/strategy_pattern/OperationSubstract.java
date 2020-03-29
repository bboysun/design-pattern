package com.marrisa.designpattern.strategy_pattern;

/**
 * @Auther: Darryl
 * @Description: TODO:描述
 * @Date: created in 2020/2/26 12:55
 */

public class OperationSubstract implements Strategy {

    @Override
    public void doOperation(int num1, int num2) {
        System.out.println("substract: " + num1 + " - " + num2);
    }
}
