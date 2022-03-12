

public class Exercise06 {
    public static int find(int arr[], int k)
    {
        for(int i =0 ; i < arr.length ; i++){
            if( arr[i] == k )
            {
                return i ; 
            }
        }
        return -1 ; 
    }
    public static void main(String[] args) {
        int arr[] = { 1 , 2, 3, 4, 5, 6, 7 ,8 , 10 };
        int k = 5 ; 
        System.out.printf("Index of an element %d in an array is %d  " , k , find(arr, k));
    }
}
