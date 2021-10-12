package CircleAndCylinder;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder("blue",2.0,2.0);

        System.out.printf(cylinder.toString(), cylinder.getColor(),cylinder.getHeight(),cylinder.getRadius());
        System.out.println("");
        System.out.printf("Thể tích hình trụ bằng %3.3f", cylinder.getVolume());
    }
}
