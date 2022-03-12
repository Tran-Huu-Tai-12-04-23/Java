public class Exercise06 {
    public static int minThreeNumber(int x , int y , int z){
        return ( x < y && x < z ) ? x : ( y < x&& y < z )? y : z ; 
    }
    public static void main(String[] args) {
        System.out.print("Minximum between three numbers is : " + minThreeNumber(-20, -1,1));
    }
}
