public class Exercise01{
    public static int findMax(int arr[]){
        int max = arr[0] ; 
        for(int i : arr)
        {
            if( i > max )
                max = i ; 
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = { 1 ,2 , 4  ,7 ,6 ,8 ,9 };
        System.out.print("Max of array is : " + findMax(arr));
    }
}