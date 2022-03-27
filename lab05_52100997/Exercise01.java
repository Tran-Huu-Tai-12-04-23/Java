import java.util.Scanner;

public class Exercise01 {
     public static int maxEven(int[] a) {
          int max;
          for (int i = 0; i < a.length; i++) {
               if (a[i] % 2 == 0) {
                    max = i;
                    for (int j = i + 1; j < a.length; j++) {
                         if (a[max] < a[j] && a[j] % 2 == 0) {
                              max = j;
                         }
                    }
                    return a[max];
               }
          }
          return -1;
     }

     public static int minOdd(int[] a) {
          int min;
          for (int i = 0; i < a.length; i++) {
               if (a[i] % 2 != 0) {
                    min = i;
                    for (int j = i + 1; j < a.length; j++) {
                         if (a[min] > a[j] && a[j] % 2 != 0) {
                              min = j;
                         }
                    }
                    return a[min];
               }
          }
          return -1;
     }

     public static int sumMEMO(int[] a) {
          return maxEven(a) + minOdd(a);
     }

     public static int sumEven(int[] a) {
          int s = 0;
          for (int i = 0; i < a.length; i++) {
               if (a[i] % 2 == 0) {
                    s += a[i];
               }
          }
          return s;
     }

     public static int prodOdd(int[] a) {
          int pr = 1;
          for (int x : a) {
               if (x % 2 != 0) {
                    pr *= x;
               }
          }
          return pr;
     }

     public static int idxFirstEven(int[] a) {
          for (int i = 0; i < a.length; i++) {
               if (a[i] % 2 == 0) {
                    return i;
               }
          }
          return -1;
     }

     public static int idxLastOdd(int[] a) {
          for (int i = a.length - 1; i >= 0; i--) {
               if (a[i] % 2 != 0) {
                    return i;
               }
          }
          return -1;
     }

     public static int[] input(int n) {
          int[] a = new int[n];
          Scanner sc = new Scanner(System.in);
          for (int i = 0; i < n; i++) {
               System.out.print("Enter element " + (i + 1) + " in array : ");
               a[i] = sc.nextInt();
          }
          return a;
     }

     public static void main(String[] args) {
          int n;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the element of array : ");
          n = sc.nextInt();
          int[] a = input(n);
          System.out.println("Max of even element in array is : " + maxEven(a));
          System.out.println("Min of odd element in array is : " + minOdd(a));
          System.out.println(
                    "The sum of the greatest even number and the smallest odd number in an array is : " + sumMEMO(a));
          System.out.println("The sum of the even number in an array is : " + sumEven(a));
          System.out.println("The product of odd numbers in an array.is :  " + prodOdd(a));
          System.out.println("The position of the first even number in the array is :   " + idxFirstEven(a));
          System.out.println("The position of the last odd number in the array is :   " + idxLastOdd(a));

     }

}
