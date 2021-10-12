package Point2DAndPoint3D;

public class Point3D extends Point2D{
    private float z = 0.0f;
    private float[] arr1 = new float[3];
    public Point3D(){

    }
    public Point3D(float x, float y , float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x ,float y , float z){
        super.setXY(x,y);
        this.z = z ;
    }
    public float[] getXYZ() {
       arr1[0] = getX();
       arr1[1] = getY();
       arr1[2] = getZ();
       return arr1;
    }
    public String toString(){
        return "(" + getX() + "," + getY()+ "," + getZ() + ")";
    }
}
