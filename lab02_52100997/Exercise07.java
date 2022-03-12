public class Exercise07 {
    public static void square(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = arr[i] * arr[i]; 
        }
    }
    public static void printArr(int arr[]){
        for(int x : arr ){
            System.out.print(x + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1 , 2, 11 , 5 ,4 ,7 ,6  ,0 ,9 };
        System.out.println("Array : ");
        printArr(arr);
        square(arr);
        System.out.println("\nArray new : ");
        printArr(arr);
        
    }
}
