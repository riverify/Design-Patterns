package com.river.test.factory;

/**
 * <p>Project: design-patterns - Factory
 * <p>Powered by river On 2023/02/11 7:36 PM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class Factory {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("圆形");
        shape.draw();
    }
}

interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw矩形");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("draw方形");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw圆形");
    }
}

class ShapeFactory {
    public static Shape getShape(String shape) {
        if (shape.equals("矩形")) {
            return new Rectangle();
        } else if (shape.equals("方形")) {
            return new Square();
        } else if (shape.equals("圆形")) {
            return new Circle();
        } else {
            return null;
        }
    }
}
