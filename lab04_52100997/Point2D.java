
public class Point2D {
    private float x  ;
    private float y  ;

    public Point2D(){
        this.x = 0.0f;
        this.y = 0.0f;
    }
    public Point2D(float x , float y ) {
        this.x = x ;
        this.y = y ;
    }

    public float getx(){
        return this.x ; 
    }
    public float gety() {
        return this.y;
    }
    
}
