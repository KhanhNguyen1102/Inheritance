package PointAndMoveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(3,3);
        System.out.println(point1);
        MoveablePoint point2 = new MoveablePoint(2,2,3,3);
        System.out.println(point2);
        point2.move();
        System.out.println(point2);
    }
}
