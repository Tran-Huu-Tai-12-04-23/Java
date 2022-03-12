public class Exercise10 {
    public static int sumDigi(int n )
    {
        int x = n  ; 
        while(n >9)
        { 
            n = n / 10 ; 
        }
        return x < 10 ? x : x % 10 + n ; 
    }
    public static void main(String[] args) {
        int n = 112414129;
        System.out.print("Sum the first digit and the last digit of a number is  : " + sumDigi(n));
    }
    
}
