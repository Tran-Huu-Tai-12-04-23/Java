import java.util.Scanner;
import java.util.Vector;

public class Exercise01 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n;
          System.out.println("Enter length of vector : ");
          n = sc.nextInt();
          Vector<Integer> x = new Vector<Integer>(n);
          Vector<Integer> y = new Vector<Integer>(n);
          x.setSize(n);
          y.setSize(n);
          System.out.println(x.size());

          for (int i = 0; i < n; i++) {
               System.out.print("Enter element : ");
               int it = sc.nextInt();
               x.set(i, it);
          }
          int j = 0;
          for (int it : x) {
               it = 2 * it * it + 1;
               y.set(j, it);
               j++;
          }
          for (int it : y) {
               System.out.print(it + " ");
          }

     }
}
