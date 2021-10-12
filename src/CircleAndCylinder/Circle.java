package CircleAndCylinder;

public class Circle {
    private String color = "black" ;
    private double radius = 1.0 ;
    public Circle(){

    }
    public Circle(String color, double radius){
        this.color = color ;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return getRadius()*getRadius()*Math.PI;
    }
    @Override
    public String toString(){
        return "Hình tròn này có màu "
                + getColor()
                + " và bán kính "
                + getRadius() ;
    }
}
