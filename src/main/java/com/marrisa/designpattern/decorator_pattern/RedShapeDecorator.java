package com.marrisa.designpattern.decorator_pattern;

/**
 * @Auther: Darryl
 * @Description: 红色形状装饰器，用于装饰形状对象
 * @Date: created in 2020/3/30 21:36
 */
public class RedShapeDecorator extends AbstractShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setColor();
    }

    private void setColor(){
        System.out.println("set color : red");
    }
}
