public class Exercise05{
    public static String deleteCharString( String st ) {
        String stnew = new String() ;
        for( int i =0 ; i < st.length() ; i++ ) {
            char it = st.charAt(i) ;
            if ( it != ',' && it != '.'){
                stnew += it ; 
            }
        }
        return stnew ;
    }

    public static String[] splitString(String stnew ) {
        
        String it[] = stnew.split("\\s") ;
        return it;
    }
    public static void result(String[] it ) {
        for( int i = 0 ; i < it.length ; i++  ) {
            if( checkVtString( it , i ) == 1 ){
                System.out.println(it[i] + " : " + countManyString(it[i] , it));
            }
        }
    }

    public static int checkVtString( String[] it , int i ) {
        int d = 0 ; 
        if( i == 0 ){
            d = 1; 
        }
        else{
            for( int j = i ; j >= 0 ; j -- ){
                if ( it[i].toUpperCase().equals(it[j].toUpperCase())){
                    d ++ ; 
                }
            }
        }
        return d ; 
    }

    public static int countManyString(String temp , String[] it ) {
        int count = 0 ;
        for( String temp1 : it ) {
            if( temp.toUpperCase().equals(temp1.toUpperCase())){
                count ++ ; 
            }
        }
        return count ;  
    }


    public static void main( String[] args ) {
        String st = "Tran tran Huu tai Tai. que quan my chau phu my binh dinh. Chieu hom ay, chieu hom kia, chieu hom nay.";
        String stnew = deleteCharString(st);
        String it[] = splitString(stnew) ;

        result(it);
    }
}