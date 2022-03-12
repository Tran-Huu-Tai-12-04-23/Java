import java.util.Scanner;
public class Exercise02 {
    public static double S(Double a , Double b ){
        return (1.0/2)*( a* b);
    }
    public static void main(String[] args){
        Double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of triangle = ");
        a = sc.nextDouble();
        System.out.print("Enter base of triangle = ");
        b = sc.nextDouble();
        System.out.print("Area of triangle = " + S(a ,b ));
    }
}