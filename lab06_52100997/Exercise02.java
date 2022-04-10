import javafx.stage.Modality;

public class Exercise02 {
     public static void main(String[] args) {
          Person per1 = new Person("Huutai", "quan ber");
          Student st1 = new Student("Huu ngyen ", "quan tom", "tieu chuan ", 2021, 20000000);
          System.out.println(per1.toString());
          System.out.println(st1.toString());
     }
}
