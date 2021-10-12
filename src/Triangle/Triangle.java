package Triangle;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPerimeter(){
        return (getSide1()+getSide2() + getSide3())/2;
    }
    public double getArea(){
        double p = getPerimeter();
        return Math.pow(p*(p-getSide1())*(p-getSide2())*(p-getSide3()),0.5);
    }
    @Override
    public String toString(){
        return "This triangle have {"
                + getColor()
                + " , diện tích "
                + getArea()
                + " , chu vi "
                + getPerimeter()
                + " }";
    }
}
