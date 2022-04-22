
import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;

public class Exercise02 {
  public static Boolean checkWordDic(String words, Set<String> dictionary) {
    words = words.toLowerCase();
    for (String i : dictionary) {
      i = i.toLowerCase();
      if (i.equals(words)) {
        return true;
      }
    }
    return false;

  }

  public static String findWordOfDic(String words, HashMap<String, String> set) {
    String result = "None";
    words = words.toLowerCase();
    for (String i : set.keySet()) {
      i = i.toLowerCase();
      if (i.equals(words)) {
        return (String) set.get(i);
      }
    }
    return result;

  }

  public static void main(String[] args) {
    HashMap<String, String> dictionary = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter word : ");
    String x = sc.nextLine();
    dictionary.put("eat", "Ăn");
    dictionary.put("home", "Nhà");
    dictionary.put("chicken", "con gà");
    dictionary.put("rigth", "bên phải");
    dictionary.put("left", "trái");
    dictionary.put("smartphone", "điện thoại thông minh ");
    dictionary.put("windown", "cửa sổ");
    dictionary.put("table", "Cái bàn");
    dictionary.put("display", "Màn hình");
    dictionary.put("keys", "chìa khóa");

    System.out.println(checkWordDic(x, dictionary.keySet()));

    System.out.println(findWordOfDic(x, dictionary));

  }
}
