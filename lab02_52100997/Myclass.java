public class Myclass {
    public int findLargestThird(int arr[]){
        for( int i =0 ; i < arr.length ;  i ++ ){
            int min = i ;
            for( int j = i +1 ; j < arr.length ; j++ ){
                if( arr[j] < arr[min] ){
                    min = j ;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr[2];
    }
    public int findMin(int arr[]){
        int min = arr[0];
        for(int i : arr)
        {
            if( i < min )
                min = i ;
        }
        return min ;
    }
    public int sumEvenArr(int arr[]){
        int s = 0 ; 
        for(int x : arr )
        {
            if( x % 2 == 0 )
                s += x ; 
        }
        return s ; 
    }
    public int countElement(int arr[], int k ){
        int d =0 ; 
        for(int x : arr )
        {
            if( x == k )
                d++ ; 
        }
        return d ; 
    }
    public int countPrime(int arr[]){
        int d = 0 ; 
        for(int x : arr )
        {
            if(checkPrime(x) == true  )
                d ++ ;  
        }
        return d ; 
    }
    public Boolean checkPrime(int k)
    {  
        if( k < 2 )
            return false;
        else if ( k == 2)
        {
            return true ;
        }
        else
        {
            for( int i = 2 ; i < k ; i++)
            {
                if( k % i == 0)
                    return false;
            }
            return true ;
        }
    }
}
