package com.marrisa.designpattern.decorator_pattern;

/**
 * @Auther: Darryl
 * @Description: 形状装饰器抽象类，用于包装shape类
 * @Date: created in 2020/3/30 21:32
 */
public abstract class AbstractShapeDecorator implements Shape{

    Shape shape;

    public AbstractShapeDecorator(Shape shape){
        this.shape = shape;
    }

    public void draw(){
        shape.draw();
    }

}
