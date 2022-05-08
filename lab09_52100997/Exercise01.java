import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FilenameFilter;
import java.util.Scanner;
import java.io.FileWriter;  
 
public class Exercise01{
    public static String findStringMaxInfile(String[] arrStr ){
        int indexRes = 0;
        for(int i = 0 ; i < arrStr.length ; i++ ){
            if(arrStr[indexRes].length() < arrStr[i].length()){
                indexRes = i ;
            }
        }
        return arrStr[indexRes];
        
    }
    public static void main(String[] args) {
        try {
                File myObj = new File("text.txt");
                Scanner sc = new Scanner(myObj);
                Scanner sc2 = new Scanner(System.in);
                FileWriter fw = new FileWriter("text.txt", true);
                String items = "";
                
                if( myObj.isDirectory()){
                    System.out.println(myObj + " is Directory ...");
                }
                else {
                    System.out.println(myObj + " IS not Directory ... ");
                }
                if( myObj.isFile()){
                    System.out.println(myObj + " is file ... ");
                }
                else {
                    System.out.println(myObj + " is not file ....");
                }
                 System.out.print("Enter the String append text to an existing the file .... : ");
                String str = "";
                str = sc2.nextLine();
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw);
                out.println(str);

                while(sc.hasNext()){
                    String it = sc.next();
                    items += it +" ";
                }
                items.trim();
                System.out.println(items);
                String [] arrStrText = items.split("\\s");
                for( String it : arrStrText){
                    System.out.println("it : " + it );
                }
                /* find text have lenght max  */
                System.out.print("The longest word in a text file is : " + findStringMaxInfile(arrStrText)); 
                out.close();
                sc.close();
            } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            }
    }
}
