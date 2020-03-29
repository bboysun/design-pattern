package com.marrisa.designpattern.factory_pattern.complex;

import com.marrisa.designpattern.factory_pattern.simple.Shape;

/**
 * @Auther: Darryl
 * @Description: TODO:描述
 * @Date: created in 2020/2/25 20:50
 */

public abstract class AbstractFactory {
    abstract Shape getShape(String type);
    abstract Color getColor(String type);
}
