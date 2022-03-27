
public class Exercise02 {
     public static String shortName(String str) {
          String it[] = str.split(" ");
          return it[it.length - 1] + " " + it[0];
     }

     public static String hashtagName(String str) {
          String it[] = str.split(" ");
          return "#" + it[it.length - 1] + it[0];
     }

     public static String upperCaseAllVowel(String str) {
          String it[] = { "U", "E", "O", "A", "I", "u", "e", "o", "a", "i" };

          String it3 = new String();
          String it4 = new String();

          for (int i = 0; i < str.length(); i++) {
               it3 = str.substring(i, i + 1);
               for (String x2 : it) {
                    if (x2.equals(it3)) {
                         it3 = it3.toUpperCase();
                    }
               }
               it4 += it3;
          }

          return it4;
     }

     public static String upperCaseAllN(String str) {
          String it3 = new String();
          String it4 = new String();

          for (int i = 0; i < str.length(); i++) {
               it3 = str.substring(i, i + 1);
               if ("n".equals(it3)) {
                    it3 = it3.toUpperCase();
               }
               it4 += it3;
          }
          return it4;
     }

     public static void main(String[] args) {
          String str = "Nguyen Le Trong Tin";
          System.out.println(shortName(str));
          System.out.println(hashtagName(str));
          System.out.println(upperCaseAllVowel(str));
          System.out.println(upperCaseAllN(str));
     }
}
