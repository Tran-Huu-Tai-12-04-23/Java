import javax.lang.model.util.ElementScanner6;

public class Exercise03{

    // yc 1 
    public static String firstName(String name) {
        String fname[] = name.split("\\s");

        return fname[0];
    }
    public static String lastName(String name ) {
        String fname[] = name.split("\\s");
        return fname[fname.length -1 ];
    }

    // middle name 
    public static String middleName( String name ) {
        String mname = new String();
        String fname[] = name.split("\\s");
        for( int i = 1 ; i < fname.length -1 ; i ++ ){
            mname += fname[i] + " ";
        }
        return mname;
    }

    // yc 3 :capitalze the full name 
    public static String capitalzeFullName( String name ) {
        String fullname[] = name.split("\\s");
        String fullnamecap = new String();
        for( int i = 0 ; i < fullname.length ; i ++ ) {
            String item = fullname[i] ;
            String subitem = fullname[i].substring(0,1).toUpperCase();
            fullnamecap += ( subitem + fullname[i].substring(1).toLowerCase() + " " );
        }
        return fullnamecap;
    }

    // yc 4 : Uppercase all vowels and lowercase all consonants.
    public static String uppVowels(String name ) {
        String uppvowelsname = new String();
        for( int i = 0 ; i < name.length() ; i ++ ) {
            String it = name.substring(i,i+1);
            if( checkVowels(it)  && it != "\\s"){
                uppvowelsname +=   it.toUpperCase();
             }
             else if( checkVowels(it) == false  && it != "\\s" ){
                uppvowelsname += it.toLowerCase();
             }
             else{
                 uppvowelsname += " ";
             }
        }
        return uppvowelsname;
    }

    public static Boolean checkVowels(String it ) {
        String[] upvowelsname = {"U" , "E" , "O" , "A" , "I" , "u" , "e" , "o" , "a" , "i" } ;
        for( int i = 0 ; i < upvowelsname.length ; i++ ) {
            if( upvowelsname[i].equals(it) == true ){
                return true  ; 
            }
        }
        return false ;
    }

    public static void main(String[] args) {
        String name = "Tran Huu Cao chieu hon Tai";
        
        System.out.println(firstName(name));
        System.out.println(lastName(name));

        System.out.println(middleName(name));

        System.out.println(capitalzeFullName(name));
        
        System.out.println(uppVowels(name));
    }
}