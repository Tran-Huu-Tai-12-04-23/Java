public class Exercise09 {
    public static int[] divisibleNumbers(int arr[], int k){
        int d = 0 ;
        for(int x : arr){
            if( x % k == 0 ) {
                d ++ ; 
            }
        }
        int arr2[] = new int[d];
        int j =0 ; 
        for( int i : arr  ) {
            if( i % k == 0 ){
                arr2[j] = i ; 
                j ++ ; 
            }
        }

        return arr2 ; 

    }

    public static void printArray(int arr2[]){
        for(int x : arr2 ){
            System.out.print(x + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1 , 5 , 6,7 , 8 , 10 , 20 , 22 ,24 , 100 } ;
        int k = 2 ; 
        int arr2[] = divisibleNumbers(arr, k);
        printArray(arr2);
     
    }
}
