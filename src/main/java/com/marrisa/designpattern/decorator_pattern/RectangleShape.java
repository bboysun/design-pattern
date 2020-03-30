package com.marrisa.designpattern.decorator_pattern;

/**
 * @Auther: Darryl
 * @Description: 长方形
 * @Date: created in 2020/3/30 21:30
 */
public class RectangleShape implements Shape {

    @Override
    public void draw() {
        System.out.println("shape: rectangle");
    }
}
