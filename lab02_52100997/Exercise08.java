import java.math.BigDecimal ;

public class Exercise08 {

    public static BigDecimal findMax (BigDecimal [] arr) {
        BigDecimal max = arr[0];
        
        for(BigDecimal it : arr ){
            if( it.compareTo(max) > 0  ){
                max = it ; 
            }
        }
        return max;
    }

    public static void main(String[] args) {
        BigDecimal []arr = {
            new BigDecimal(1) , 
            new BigDecimal(17) , 
            new BigDecimal(6) , 
            new BigDecimal( 55) , 
            new BigDecimal(22) , 
            new BigDecimal(11) , 
            new BigDecimal(2) , 
            new BigDecimal(9) , 
            new BigDecimal(5) , 
            new BigDecimal(3) , 

        } ;
       
        System.out.print("Max of array object is : " + findMax(arr));
    }

}
