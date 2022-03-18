

public class House {
    private static final Object[] House = null;
    private String houseCode = "A01" ;
    private int numOfBebRooms = 2 ;
    private Boolean hasSwimmingPool = false ;
    private double area = 0f;
    private double costPerSquareMeter = 0f;

    public House() {

    }
    public House(String houseCode , int numOfBebRooms 
                , Boolean hasSwimmingPool , double area 
                , double costPerSquareMeter ) {
        this.houseCode = houseCode ;
        this.numOfBebRooms = numOfBebRooms ;
        this.hasSwimmingPool = hasSwimmingPool ;
        this.area = area ;
        this.costPerSquareMeter = costPerSquareMeter ;
    }

    public void setHoudeCode( String houseCode ) {
        this.houseCode = houseCode ;
    }
    public void setNumberOfBebRooms( int numOfBebRooms ) {
        this.numOfBebRooms = numOfBebRooms ;
    }
    public void setHasSwimmingPool( Boolean hasSwimmingPool ) {
        this.hasSwimmingPool = hasSwimmingPool ;
    }
    public void setArea( double area ) {
        this.area = area ;
    }
    public void setCostperSquareMeter( double costPerSquareMeter ) {
        this.costPerSquareMeter = costPerSquareMeter ;
    }

    public String getHouseCode() {
        return this.houseCode ;
    }
    public int getNumOfBedRooms() {
        return this.numOfBebRooms ;
    }
    public Boolean getHasSwimmingPool() {
        return this.hasSwimmingPool ;
    }
    public double getArea() {
        return this.area ;
    }
    public double getCostPerSquareMeter() {
        return this.costPerSquareMeter ;
    }

    public double calculateSellingPrice() {
        return (this.hasSwimmingPool) ? ( this.area * this.costPerSquareMeter )*(1.1) *(1.15)
         :  (this.area * this.costPerSquareMeter * 1.15)  ;
    }
    @Override
    public String toString() {
        return String.format( "House[%s , %d , %b , %f ]", this.houseCode , this.numOfBebRooms , this.hasSwimmingPool , this.calculateSellingPrice()) ;
    }
}
