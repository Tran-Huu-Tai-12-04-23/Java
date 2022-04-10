
public class MyCircle {
     protected double radius = 1.0;
     protected String color = "red";

     public MyCircle() {
     }

     public MyCircle(double radius) {
          this.radius = radius;
     }

     public MyCircle(double radius, String color) {
          this.radius = radius;
          this.color = color;
     }

     public double getRadius() {
          return this.radius;
     }

     public String getColor() {
          return this.color;
     }

     public void setRadius(double radius) {
          this.radius = radius;
     }

     public void setColor(String color) {
          this.color = color;
     }

     public double getArea() {
          return this.radius * this.radius * Math.PI;
     }

     @Override
     public String toString() {
          return "Circle[" + this.radius + "," + this.color + "," + this.getArea() + "]";
     }

}
