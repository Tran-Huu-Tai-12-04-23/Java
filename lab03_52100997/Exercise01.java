public class Exercise01{
    // print array : 
    public static void printArray(int arr[]){
        for( int x : arr ){
            System.out.print(x +" ");
        }
    }
    // YC 1 
    public static int[] deleteFirstElement(int arr[] , int  k ){
        int arrnew[] = new int[arr.length - 1 ];
        int d =0 ; 
        for( int x : arr ){
            if( x != k ){
                arrnew[d] = x ; 
                d ++ ;
            }
        }
        return arrnew ; 
    }

    public static Boolean check(int arr[] , int k ){
        for( int x : arr ){
            if( x == k ){
                return true  ;
            }
        }
        return false ; 
    }
    // YC 2 : 
    public static void insertElement(int arr[] , int x , int p){
        for( int i =0 ; i < arr.length ; i++ ){
            if( i == p ){
                for( int j = arr.length - 1 ; j > i  ; j -- ){
                    arr[j] = arr[j -1];
                }
                arr[i] = x ;
            }
        }
    }

    //  YC 3 : 
    public static void printArr(int arr[]){
        for(int x : arr ){
            System.out.print(x + " ");
        }
    }

    public static int countElement(int arr[] , int i ){
        int f = 0;
        for( int j = i ; j >=0 ; j -- ){
            if( arr[i] == arr[j] ){
                f ++ ;
            }
        }
        return f; 
    }
    public static int[] arrDouElement(int arr[] ){
        int count = 0 ; 
        for( int i =0 ; i < arr.length ; i++ ){
            if( countDou(arr, arr[i] ) > 1   && countElement(arr, i) == 1){
                count ++ ; 
            }
        }
        int arrdouplicate[] = new int[count];
        int k = 0 ; 
        for( int i =0 ; i < arr.length ; i++ ){
            if( countDou(arr, arr[i] ) > 1   && countElement(arr, i) == 1){
                 arrdouplicate[k] = arr[i];
                 k++;
            }
        }
        return arrdouplicate ; 
    }

    public static int countDou(int arr[] , int k){
        int count = 0 ; 
        for( int x : arr ){
            if ( x == k ){
                count ++ ; 
            }
        }
        return count ; 
    }
    // YC 4 : 
    public static int[] arrNotDouplicate(int arr[] ){
        int size = 0 ; 
        for( int x : arr ){
            if( countDou(arr , x ) == 1 ){
                size ++ ;
            }
        }
        int arrnotdou[] = new int[size];
        int d = 0 ; 
        for( int f : arr ){
            if( countDou(arr , f ) == 1 ){
                arrnotdou[d] = f ;
            }
        }
        return arrnotdou;
    }

    public static int[] arrRemoveDouplicate(int arr[] , int arrdou[]){
        int size = 0 ; 
        for( int i =0 ; i < arr.length ; i++ ){
            if( countElement(arr, i) == 1 ){
                size ++ ; 
           }
        }
        int arrremovedou[] = new int[size];
        int k =0 ; 
        for( int i =0 ; i < arr.length ; i++ ){
            if( countElement(arr, i) == 1 ){
                arrremovedou[k] = arr[i];
                k++;
           }
        }
        return arrremovedou;
    }
    // main
    public static void main(String[] args) {

        int arr[] = { 1 ,2 , 3 ,4 , 5, 8,11 ,99 , 1, 1, 3 ,2  };
        int k = 5 ; 
        
        if( check(arr, k)){
            int arrnew[] = deleteFirstElement(arr, k);
            printArray(arrnew);
        }
        else{
            System.out.printf("There is no %d element in the array ....", k );
        }

        int x = 55 , p = 0 ;
        insertElement(arr, x , p);
        System.out.print("\nArray after insert element in array is : ");
        printArray(arr);

        int arrdou[] = arrDouElement(arr);
        System.out.print("\nThe douplicate values of an array  of integer values : "); 
        printArr(arrdou);

        int arrremverdou[] = arrRemoveDouplicate(arr,arrdou);
        System.out.print("\nArray after remover douplicate element is : ");
        printArr(arrremverdou);
    
    } 

}