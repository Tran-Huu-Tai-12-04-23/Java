
public class RegularPolygon {
     private String name;
     private int egdeAmount;
     private double egdeLength;

     public RegularPolygon() {
          this.name = "";
          this.egdeAmount = 3;
          this.egdeLength = 1;
     }

     public RegularPolygon(String name, int egdeAmount, double egdeLength) {
          this.name = name;
          this.egdeAmount = egdeAmount;
          this.egdeLength = egdeLength;
     }

     public RegularPolygon(String name, int egdeAmount) {
          this.name = name;
          this.egdeAmount = egdeAmount;
          this.egdeLength = 1;
     }

     public RegularPolygon(RegularPolygon polygon) {
          this.name = polygon.name;
          this.egdeAmount = polygon.egdeAmount;
          this.egdeLength = polygon.egdeLength;
     }

     public String getName() {
          return this.name;
     }

     public int getEdgeAmount() {
          return this.egdeAmount;
     }

     public double getEdgeLength() {
          return this.egdeLength;
     }

     public void setName(String name) {
          this.name = name;
     }

     public void setEdgeAmount(int num) {
          this.egdeAmount = num;
     }

     public void setEdgeLength(double length) {
          this.egdeLength = length;
     }

     public String getPylygon() {
          String result = new String();
          if (this.egdeAmount == 3) {
               result = "Triangle";
          } else if (this.egdeAmount == 4) {
               result = "Quadrangle";
          } else if (this.egdeAmount == 5) {
               result = "Pentagon";
          } else if (this.egdeAmount == 6) {
               result = "Hexagon";
          } else if (this.egdeAmount > 6) {
               result = "Polygon has the number of edges greater than 6";
          }
          return result;
     }

     public double getPerimeter() {
          return this.egdeLength * this.egdeAmount;
     }

     public double getArea() {
          double a = 0;
          if (this.egdeAmount == 3) {
               a = 0.433;
          } else if (this.egdeAmount == 4) {
               a = 1;
          } else if (this.egdeAmount == 5) {
               a = 1.72;
          } else if (this.egdeAmount == 6) {
               a = 2.595;
          } else if (this.egdeAmount > 6) {
               a = -1;
          }
          return this.egdeLength * this.egdeLength * a;
     }

     @Override
     public String toString() {
          return this.name + "-" +
                    this.getPylygon() + "-" + this.getArea();
     }

}
