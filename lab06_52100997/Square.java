public class Square extends Rectangle {
     private double side;

     public Square() {

     }

     public Square(double side) {
          this.side = side;
     }

     public Square(double side, String color, boolean filled) {
          super(color, filled);
          this.side = side;
     }

     public double getSide() {
          return this.side;
     }

     public void setSide(double side) {
          this.side = side;
     }

     @Override
     public void setWidth(double width) {
          this.width = width;
     }

     @Override
     public void setlength(double length) {
          this.length = length;
     }

     @Override
     public String toString() {
          return String.format("Square[%s , %b , %f , %f ]", this.color, this.filled, this.width, this.length);
     }

}
