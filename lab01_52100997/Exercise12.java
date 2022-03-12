public class Exercise12 {
    public static int reverseNumber(int n ) {
        int s = 0 ;
        while(n > 0 )
        {
            s = s * 10 +  n % 10 ; 
            n = n / 10 ; 
        }
        return s ; 
    }
    public static void main(String[] args) {
        int n = 1234567;
        System.out.print("Reverse of number  is : " + reverseNumber(n));
    }
}
