
import java.util.Scanner;

public class Exercise14{
    public static Boolean vendingMachine( ){
        Scanner sc = new Scanner(System.in);
        System.out.println("----Menu----\n1.Coca\n2.Pepsi\n3.Sprite\n4.Snack\n5.Shutdown Machine.");
        System.out.println("Please enter the number : ");
        int n = sc.nextInt();
        switch(n){
            case 1 : {
                System.out.println("The price of coca is 2$ , please enter the amount of money :");
                int k = sc.nextInt();
                if( k < 2 )
                {
                    System.out.println("Not enough money to buy  this item , please sslect agian .");
                }
                else{
                    System.out.printf("You change is %d$\n" , k - 2 );
                }
                return false  ;
            }
            case 2 : {
                System.out.println("The price of pesi is 3$ , please enter the amount of money :");
                int k = sc.nextInt();
                if( k < 3 )
                {
                    System.out.println("Not enough money to buy  this item , please sslect agian .");
                }
                else{
                    System.out.printf("You change is %d$\n" , k - 3);
                }
                return false ;
            }
            case 3 :{
                System.out.println("The price of sprite is 4 $ , please enter the amount of money : ");
                int k = sc.nextInt();
                if( k < 4 )
                {
                    System.out.println("Not enough money to buy  this item , please sslect agian .");
                }
                else{
                    System.out.printf("You change is %d$\n" , k - 4);
                }
                return false ;
            }
            case 4:{
                System.out.println("The price of snack is $1 , please enter the amount of money : ");
                int k = sc.nextInt();
                if( k < 1 )
                {
                    System.out.println("Not enough money to buy  this item , please sslect agian .");
                }
                else{
                    System.out.printf("You change is %d$\n" , k - 1);
                }
                return false ;
            }
            case 5 :{
                System.out.println("Machine is shutting down .");
                return true ;
            }
            default :{
                System.out.println("Please enter the valid numbers ");
                return false ;
            }
        }
    } 

    public static void main(String[] args) {
        while( vendingMachine() == false ){
            vendingMachine();
        }
    }
}