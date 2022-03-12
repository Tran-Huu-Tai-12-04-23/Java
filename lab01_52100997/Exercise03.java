public class Exercise03 {
    public static int remainderDivision(int n , int m )
    {
        while(n >= m){
            n = n - m ; 
        }
        return n ;
    }
    public static void main(String[] args) {
        System.out.println("remainder of the above division:"+ remainderDivision(100 , 5));
    }
}
