package _b6_inheritance.homework.point_2d_and_point3d;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arrayXYZ = {getX(),getY(),this.z};
        return arrayXYZ;
    }

    @Override
    public String toString() {
        return "Location: ("+super.getX()+","+super.getY()+","+this.z+")";
    }
}
