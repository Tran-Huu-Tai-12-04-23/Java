
public class Exercise03 {
     public static void main(String[] args) {
          Club cl1 = new Club("HCM", 10, 7, 3);
          Club cl2 = new Club();
          Club cl3 = new Club(cl1);

          System.out.println(cl1.toString());
          System.out.println(cl1.getName());
          System.out.println(cl1.getLosses());
          System.out.println(cl1.getName());
          System.out.println(cl1.getsDraws());
          System.out.println(cl1.getWins());
          System.out.println(cl1.getPoints());

          System.out.println(cl2.toString());
          System.out.println(cl2.getName());
          System.out.println(cl2.getLosses());
          System.out.println(cl2.getName());
          System.out.println(cl2.getsDraws());
          System.out.println(cl2.getWins());
          System.out.println(cl2.getPoints());

          System.out.println(cl3.toString());
          System.out.println(cl3.getName());
          System.out.println(cl3.getLosses());
          System.out.println(cl3.getName());
          System.out.println(cl3.getsDraws());
          System.out.println(cl3.getWins());
          System.out.println(cl3.getPoints());

     }
}
