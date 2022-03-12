
public class Exercise04 {

    public static double fc( float c ){
        return c/1.8 + 32 ;
    }
    public static double cf( float f){
        return ( f - 32 )/(1.8) ;
    }
    public static void main(String[] args){
        System.out.println("Celsius to Fahrenheit = " + fc(32));
        System.out.println("Fahrenheit to Celsius = " + cf(2));
    }
}
