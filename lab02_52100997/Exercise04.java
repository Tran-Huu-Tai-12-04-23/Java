public class Exercise04 {
    public static void main(String[] args) {
        int arr[] = { 1 , 2,3 ,4 , 55 , 66 , 3 ,8 };
        Myclass counte = new Myclass();
        int k = 1 ; 
        System.out.printf("%d xuat hien %d trong mang... " ,k ,  counte.countElement(arr,k) );
    }
}
