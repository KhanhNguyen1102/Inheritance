package Point2DAndPoint3D;

public class Main {
    public static void main(String[] args) {
        Point2D obj1 = new Point2D(2.0f,3.0f);
        Point3D obj2 = new Point3D(3.1f,2.5f,1.5f);
        System.out.println(obj1);
        System.out.println(obj2);
        float[] arr = obj1.getXY();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
