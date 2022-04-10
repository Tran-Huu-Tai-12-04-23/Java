
public class Exercise01 {
     public static void main(String[] args) {
          MyCircle cr1 = new MyCircle();
          MyCircle cr2 = new MyCircle(4.3, "green");
          System.out.println(cr1.getArea());
          System.out.println(cr1.toString());
          System.out.println(cr2.toString());
     }
}