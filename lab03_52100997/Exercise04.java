public class Exercise04 {

    // length of string 
    public static int lengthString(String st) {
        return st.length();
    }

    // count a number of words in string :
    public static int countNumberOfWords(String st ) {
        int count = 0 ;
        char it[] = new char[st.length()];
        for( int i =0 ; i < st.length() - 1 ; i++ ) {
            it[i] = st.charAt(i);
            if( (i > 0 && it[i-1] == ' ' && it[i] !=' ') || ( i > 0 && it[i+1] == ' ' && it[i] != ' ') || ( i == 0 && it[i] != ' ') || ( i == st.length() && it[i] != ' ')) {
                count ++ ; 
            }
        }
        return count ;
    }
    // Concatenate one string’s contents to another.
    public static String concatString(String st , String stanother) {
        return st + stanother ;
    }
    // Check if a string is palindrome or not. 
    public static Boolean checkStringPalindrome(String st ) {
        int j = st.length() - 1 ; 
        for( int i = 0 ; i < st.length() / 2; i++ ) {
            if( st.charAt(i) != st.charAt(j)) {
                return false ;
            }
            j -- ;
        }
        return true ;
    }
    
    public static void main(String[] args) {
        String st = "hth hth";

        System.out.println("Length of string is : " + lengthString(st));
        
        System.out.println(countNumberOfWords(st) + " words..");

        System.out.println("String after concatenate one string's contetns to another is : " + concatString(st,"mot ngay buon"));
        
        if( checkStringPalindrome(st)){
            System.out.println("String is palindrome .... ");
        }
        else{
            System.out.println("String is not palindrome .... ");
        }
    }
}
