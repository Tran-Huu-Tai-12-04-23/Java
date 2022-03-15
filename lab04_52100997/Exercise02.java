public class Exercise02 {
    
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle((float)1.2 , (float)3.4);
        
        System.out.println(rec1.getlength() );
        System.out.println(rec1.getWidth() );

        System.out.println(rec2.getlength() );
        System.out.println(rec2.getWidth() );

        System.out.println(rec1.toString() );
        System.out.println(rec2.toString() );

        rec1.setLength(20);
        rec1.setWidth(10);

        System.out.println(rec1.getlength() );
        System.out.println(rec1.getWidth() );

        System.out.println(rec1.toString() );
    }
}
