package com.marrisa.designpattern.factory_pattern.complex;

import com.marrisa.designpattern.factory_pattern.simple.Circle;
import com.marrisa.designpattern.factory_pattern.simple.Rectangle;
import com.marrisa.designpattern.factory_pattern.simple.Shape;
import com.marrisa.designpattern.factory_pattern.simple.Square;

/**
 * @Auther: Darryl
 * @Description: TODO:描述
 * @Date: created in 2020/2/25 20:55
 */

public class OtherShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String type) {
        if ("CIRCLE".equals(type)) {
            return new Circle();
        } else if ("RECTANGLE".equals(type)) {
            return new Rectangle();
        } else if ("SQUARE".equals(type)) {
            return new Square();
        } else {
            return null;
        }
    }

    @Override
    Color getColor(String type) {
        return null;
    }
}
