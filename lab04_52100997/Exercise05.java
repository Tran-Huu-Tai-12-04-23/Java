public class Exercise05 {
    public static void main(String[] args) {
        Fraction fr1 = new Fraction() ;
        Fraction fr2 = new Fraction(48 , 24) ;
        Fraction fr3 = new Fraction(fr2) ;
        Fraction fr8 = new Fraction(1,2) ;

        System.out.println(fr1.toString());
        System.out.println(fr3.toString());
        System.out.println(fr2.toString());

        Fraction fr4 = fr1.add(fr2);
        Fraction fr5 = fr1.sub(fr2);
        Fraction fr6 = fr1.mul(fr2);
        Fraction fr7 = fr1.div(fr2);
        System.out.println("fr1 + fr2 : " + fr4.toString());
        System.out.println("fr1 - fr2 : " + fr5.toString());
        System.out.println("fr1 * fr2 : " + fr6.toString());
        System.out.println("fr1 / fr2 : " + fr7.toString());

        Fraction fr9 = fr2.add(fr8);
        Fraction fr10 = fr2.sub(fr8);
        Fraction fr11 = fr2.mul(fr8);
        Fraction fr12 = fr2.div(fr8);
        System.out.println("fr2 + fr8 : " + fr9.toString());
        System.out.println("fr2 - fr8 : " + fr10.toString());
        System.out.println("fr2 * fr8 : " + fr11.toString());
        System.out.println("fr2 / fr8 : " + fr12.toString());

        fr2.reducer(); 
        System.out.println("Fraction after reducer : " + fr2.toString());

    }
}
