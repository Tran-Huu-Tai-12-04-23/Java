public class Exercise09 {
    public static void halistone(int n  )
    {
        while(n > 1)
        {
            if(n % 2 == 0 )
            {
                System.out.printf("%d is even , so we take  n / 2 : % d \n ", n , n/2); 
                n /= 2 ;  
            }
            else
            {
                System.out.printf("%d is old , so we take  3 * n + 1  : %d \n", n , 3 * n +1); 
                n = 3 * n +1 ; 
            }
        }
    }
    public static void main(String[] args) {
        int n = 20 ;
        halistone(n);
    }

    
}
