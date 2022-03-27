public class Exercise04 {
     public static void main(String[] args) {
          RegularPolygon rec1 = new RegularPolygon();
          RegularPolygon rec2 = new RegularPolygon("HINH", 5, 12);
          RegularPolygon rec3 = new RegularPolygon("HINHTHOI", 6);
          RegularPolygon rec4 = new RegularPolygon(rec1);

          System.out.println(rec1.toString());
          System.out.println(rec1.getName());
          System.out.println(rec1.getEdgeAmount());
          System.out.println(rec1.getEdgeLength());
          System.out.println(rec1.getArea());
          System.out.println(rec1.getPerimeter());
          System.out.println(rec1.getPylygon());

          System.out.println(rec2.toString());
          System.out.println(rec2.getName());
          System.out.println(rec2.getEdgeAmount());
          System.out.println(rec2.getEdgeLength());
          System.out.println(rec2.getArea());
          System.out.println(rec2.getPerimeter());
          System.out.println(rec2.getPylygon());

          System.out.println(rec3.toString());
          System.out.println(rec3.getName());
          System.out.println(rec3.getEdgeAmount());
          System.out.println(rec3.getEdgeLength());
          System.out.println(rec3.getArea());
          System.out.println(rec3.getPerimeter());
          System.out.println(rec3.getPylygon());

          System.out.println(rec4.toString());
          System.out.println(rec4.getName());
          System.out.println(rec4.getEdgeAmount());
          System.out.println(rec4.getEdgeLength());
          System.out.println(rec4.getArea());
          System.out.println(rec4.getPerimeter());
          System.out.println(rec4.getPylygon());

     }
}
