package CircleAndCylinder;

public class Cylinder extends Circle{
    private double height = 1.0 ;
    public Cylinder(){
    }
    public Cylinder(String color , double radius , double height){
        super(color,radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getArea(){
        return 2*Math.PI*getRadius()*(getRadius() + getHeight());
    }
    public double getVolume(){
        return Math.PI*getRadius()*getRadius()*getHeight();
    }
    @Override
    public String toString(){
        return "Hình trụ này có màu %s ,chiều cao bằng %-2.3f ,bán kính bằng %-5.3f ";
    }
}
