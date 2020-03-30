package com.marrisa.designpattern.decorator_pattern;

/**
 * @Auther: Darryl
 * @Description: 装饰器模式的demo类
 * @Date: created in 2020/3/30 21:41
 */

public class DecoratorPatternDemo {

    public static void main(String[] args) {
        CircleShape circle = new CircleShape();
        RectangleShape rectangle = new RectangleShape();
        RedShapeDecorator redCircle = new RedShapeDecorator(circle);
        RedShapeDecorator redRectangle = new RedShapeDecorator(rectangle);

        circle.draw();
        rectangle.draw();
        System.out.println("====================");
        redCircle.draw();
        redRectangle.draw();
    }

}
