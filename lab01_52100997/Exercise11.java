public class Exercise11 {
    public static int countDigitsNumbers(int n ){
        int d = 0 ; 
        while(n> 0 )
        {
            d ++ ; 
            n /= 10 ;
        }
        return d;
    }
    public static void main(String[] args) {
        int n = 12312311;
        System.out.print("Digits of numbers is : " + countDigitsNumbers(n));
    }
}
