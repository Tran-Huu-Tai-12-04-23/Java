import java.io.FileWriter;
import java.io.IOException;

import org.w3c.dom.Text;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.File;
public class Exercise02 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("output.txt");
            FileReader fr = new FileReader("text.txt");
            File frr = new File("text.txt");
            Scanner sc = new Scanner(frr);
            int sum = 0 ;
            while(sc.hasNextDouble()){
                double it = sc.nextDouble();
                sum += it ;
            }
            String it = String.valueOf(sum);
            fw.write(it);
            fw.close();
            fr.close();
            
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }

        
    }

   
}
