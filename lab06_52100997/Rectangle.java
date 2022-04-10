public class Rectangle extends Shape {
     protected double width = 1.0;
     protected double length = 1.0;

     public Rectangle() {

     }

     public Rectangle(double width, double length, String color, boolean filled) {
          super(color, filled);
          this.width = width;
          this.length = length;
     }

     public Rectangle(String color, boolean filled) {
     }

     public double getWidth() {
          return this.width;
     }

     public double getLength() {
          return this.length;
     }

     public void setWidth(double width) {
          this.width = width;
     }

     public void setlength(double length) {
          this.length = length;
     }

     public double getArea() {
          return this.width * this.length;
     }

     public double getPerimeter() {
          return this.length * 2 + this.width * 2;
     }

     @Override
     public String toString() {
          return String.format("Rectangle[%s , %b , %f , %f ]", this.color, this.filled, this.width, this.length);
     }
}
