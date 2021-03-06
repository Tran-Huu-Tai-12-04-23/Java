public class Point3D extends Point2D {
     private float z = 0.0f;

     public Point3D() {

     }

     public Point3D(float x, float y, float z) {
          super(x, y);
          this.z = z;
     }

     public float getZ() {
          return this.z;
     }

     public void setZ(float z) {
          this.z = z;
     }

     public float[] getXYZ() {
          return new float[] { super.x, super.y, this.z };
     }

     public void setXYZ(float x, float y, float z) {
          super.x = x;
          super.y = y;
          this.z = z;
     }

     @Override
     public String toString() {
          return String.format("Point3D[%f,%f,%f]", super.x, super.y, this.z);
     }
}
