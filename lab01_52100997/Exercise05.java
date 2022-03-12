public class Exercise05 {
    public static Boolean checkYearLeap(int y )
    {
        return (( y % 4 == 0 && y % 100 != 0  ) || y % 400 == 0 ) ? true : false ;
    }
    public static void main(String[] args) {
        int y = 2016 ; 
        if(checkYearLeap(y) == true )
            System.out.printf("%d is leap ....",y);
        else
            System.out.printf("%d isn't leap ....",y);
        
    }
}
