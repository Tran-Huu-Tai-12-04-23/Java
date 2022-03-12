public class Exercise02 {

    public static int[][] addTwoMatrix(int[][] mt1 , int[][] mt2 ){
        int d = mt1.length , c =  mt1[0].length ;
        int matrixnewmul[][] = new int[d][c];
        for( int i = 0 ; i < d ; i++ ){
            for( int j = 0 ; j < c ; j++ ){
                matrixnewmul[i][j] = mt1[i][j] + mt2[i][j];
            }
        }
        return matrixnewmul ;
    }

    public static void multiplyMtrixWithNumber( int mt[][] , int k){
        int d = mt.length , c =  mt[0].length ;
        for(int i =0 ; i < d ; i++ ){
            for( int j = 0 ; j < c ; j++ ){
                mt[i][j] *= k ; 
            }
        }
    }
    public static void printMatrix(int mt[][]){
        int d = mt.length , c =  mt[0].length ;
        System.out.print("Matrix : \n");
        for(int i =0 ; i < d ; i++ ){
            for( int j = 0 ; j < c ; j++ ){
                System.out.print(mt[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int mt1[][] = {{1, 2 , 3, 4 }, {3, 4 , 5 , 9 }, {5, 6 , 9 , 5 }};
        int mt2[][] = {{12, 11 , 4, 5 }, {6, 9 , 0 , 14 }, { 14 , 7 , 20  , 11 }};

        int matrixnewmul[][] = addTwoMatrix(mt1 , mt2  );
        printMatrix(matrixnewmul);

        int k = 2 ;
        multiplyMtrixWithNumber(mt1, k);

        printMatrix(mt1);
        printMatrix(mt2); 

    }
}
