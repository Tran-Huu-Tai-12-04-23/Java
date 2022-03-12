public class Exercise07 {
    public static Boolean checkApha(Character a ){
        return(( a >= 65 && a <= 90 ) || ( a >= 97 && a <= 122))? true : false ;
    }
    public static void main(String[] args) {
        Character a = '1';
        if(checkApha(a))
            System.out.printf("%c is alphanumeric " , a );
        else
            System.out.printf("%c isn't alphanumeric " , a );

    }
}
