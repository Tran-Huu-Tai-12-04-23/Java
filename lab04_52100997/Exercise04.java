public class Exercise04 {
    public static void main(String[] args) {
        House h1 = new House() ;
        House h2 = new House("A02" , 3, false , 200 , 2560000 );

        System.out.println("House 1 : ");
        System.out.println(h1.getHouseCode());
        System.out.println(h1.getNumOfBedRooms());
        System.out.println(h1.getHasSwimmingPool());
        System.out.println(h1.getArea());
        System.out.println(h1.getCostPerSquareMeter());

        h1.setArea(100);
        h1.setCostperSquareMeter(2500000);
        h1.setHasSwimmingPool(true);
        System.out.println(h1.toString());

        System.out.println("House 2: ");
        System.out.println(h2.getHouseCode());
        System.out.println(h2.getNumOfBedRooms());
        System.out.println(h2.getHasSwimmingPool());
        System.out.println(h2.getArea());
        System.out.println(h2.getCostPerSquareMeter());
        System.out.println(h2.toString());

        
    }
}
