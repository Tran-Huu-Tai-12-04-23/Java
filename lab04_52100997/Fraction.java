public class Fraction {
    private int numberator ;
    private int denominator ;

    public Fraction() {
        this.numberator = 0 ;
        this.denominator = 1 ; 
    }
    public Fraction(int num , int den ) {
        if( num != 0 ){
            this.numberator = num ;
            this.denominator = den ;
        }
    }

    public Fraction(Fraction f ) {
        this.numberator = f.numberator ;
        this.denominator = f.denominator ;
    }

    public Fraction add(Fraction f) {
        Fraction n = new Fraction();
        n.numberator = this.numberator * f.denominator 
        + this.denominator * f.numberator ;
        n.denominator = this.denominator * f.denominator ;
        return n;
    }
    public Fraction sub(Fraction f ) {
        Fraction n2 = new Fraction() ;
        n2.numberator = this.numberator * f.denominator 
        - this.denominator * f.numberator ;
        n2.denominator = this.denominator * f.denominator ;
        return n2;
    }

    public Fraction mul(Fraction f ) {
        Fraction it = new Fraction();
        it.numberator = this.numberator * f.numberator ;
        it.denominator = this.denominator * f.denominator ;   
        return it ;
    }

    public Fraction div(Fraction f ) {
        Fraction it2 = new Fraction();
        it2.numberator = this.numberator * f.denominator ;
        it2.denominator = this.denominator * f.numberator ;
        return it2;
    }

    public void reducer() {
        int gdc ;
        int s1 = this.numberator , s2 = this.denominator ;
        if (s1 == 0 || s2 == 0){
            gdc = s1 + s2;
        }
        while (s1 != s2){
            if (s1 > s2){
                s1 -= s2; 
            }else{
                s2 -= s1;
            }
        }
        gdc =s1;
        this.numberator /= gdc;
        this.denominator /= gdc;
    }

    @Override
    public String toString() {
        return String.format( "Fraction[num=%d,den=%d]"
        , this.numberator , this.denominator);
    }
    

}

