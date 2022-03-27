
public class Exercise02_2 {
     public static int countWord(String paragraph) {
          String it = new String();
          String it1 = new String();
          for (int i = 0; i < paragraph.length(); i++) {
               it1 = paragraph.substring(i, i + 1);
               if (it1.equals(".") == false && it1.equals(",") == false) {
                    it += it1;
               }
          }
          String it3[] = it.split(" ");
          return it3.length;
     }

     public static int countSentences(String paragraph) {
          int count = 0;
          String it = new String();
          for (int i = 0; i < paragraph.length(); i++) {
               it = paragraph.substring(i, i + 1);
               if (it.equals(".")) {
                    count++;
               }
          }
          return count;
     }

     public static int countAppear(String paragraph, String word) {
          int count = 0;
          String it = new String();
          String it1 = new String();
          for (int i = 0; i < paragraph.length(); i++) {
               it1 = paragraph.substring(i, i + 1);
               if (it1.equals(".") == false && it1.equals(",") == false) {
                    it += it1;
               }
          }
          String it3[] = it.split(" ");
          for (String x : it3) {
               if (word.equals(x)) {
                    count++;
               }
          }
          return count;
     }

     public static void main(String[] args) {
          String paragraph = "The Edge Surf is of course also a whole lot better, which will hopefully win Microsoft some convert . It offers time trial, support for other input methods like touch and gamepads, accessibility improvements, high scores, and remastered visuals.";
          String word = "The";
          System.out.println("The number of words in the paragraph is : " + countWord(paragraph));
          System.out.println("The number of sentences in the paragraph is : " + countSentences(paragraph));
          System.out.println("The number of occurrences of the word in the paragraph is : "
                    + countAppear(paragraph, word));
     }
}
