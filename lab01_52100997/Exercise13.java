public class Exercise13 {
    public static Boolean checkPalindrome(int n ){
        int x = n ; 
        int s = n % 10 ; 
        n = n / 10 ; 
        while( n > 0 )
        {
            s = s * 10 + n % 10 ; 
            n /= 10 ;
        }
        return (s == x && checkPrime(n) == true )? true : false ;
    }

    public static Boolean checkPrime(int n ){
        if(n == 2 )
        {
            return true ; 
        }
        else if(n == 2 )
        {
            return true ; 
        }
        else 
        {
            for(int i = 2 ; i < n ; i++ )
            {
                if( n % i == 0 )
                {
                    return false ; 
                }
            }
            return true ; 
        }
    }

    public static void main(String[] args) {
        int n = 2122;
        if(checkPalindrome(n) == true )
            System.out.printf("%d is palindrome number .." , n );
        else
            System.out.printf("%d isn't palindrome number .." , n );
        
    }
    
}
