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
        if( this.numberator % this.denominator == 0 
        && this.numberator > this.denominator) {
            this.numberator /= this.denominator ;
            this.denominator /=this.denominator ;
        }
        else if( this.denominator % this.numberator == 0 
        && this.denominator > this.numberator) {
            this.denominator = this.denominator / this.numberator;
            this.numberator /= this.numberator ;
        }
    }

    @Override
    public String toString() {
        return String.format( "Fraction[num=%d,den=%d]"
        , this.numberator , this.denominator);
    }
    

}

