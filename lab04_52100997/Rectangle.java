public class Rectangle {
    private float width;
    private float length ;

    public Rectangle(){
        this.width = 1.0f;
        this.length = 1.0f;
    }

    public Rectangle(float width , float length ) {
        this.length = length ;
        this.width = width ;
    }

    public float getWidth() {
        return this.width;
    }
    public float getlength() {
        return this.length ;
    }

    public float getArea() {
        return this.length * this.width ;
    }
    public float getPerimeter() {
        return ( this.length + this.width ) * 2 ;
    }

    public void setWidth( float width) {
        if ( width > 0 ){
            this.width = width ;
        }
    }
    public void setLength( float length) {
        if( length > 0 ) {
            this.length = length ;
        }
    }

    @Override
    public String toString() {
        return String.format("Rectangle[width : %f,length : %f ]", this.width , this.length);
    }
    
}
