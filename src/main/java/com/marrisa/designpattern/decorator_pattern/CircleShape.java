package com.marrisa.designpattern.decorator_pattern;

/**
 * @Auther: Darryl
 * @Description: 圆
 * @Date: created in 2020/3/30 21:29
 */
public class CircleShape implements Shape {

    @Override
    public void draw() {
        System.out.println("shape: circle");
    }
}
