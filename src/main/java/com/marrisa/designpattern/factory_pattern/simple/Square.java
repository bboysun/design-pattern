package com.marrisa.designpattern.factory_pattern.simple;

/**
 * @Auther: Darryl
 * @Description: TODO:描述
 * @Date: created in 2020/2/25 20:29
 */

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("I am square");
    }
}
