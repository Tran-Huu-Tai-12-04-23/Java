public class Exercise03 {
    public static void main(String[] args) {
        Student st1 = new Student(52100997, "Tai", "Tran") ;
        System.out.println(st1.toString());

        st1.setID(52100999);
        st1.setFirstName("Nguyen");
        st1.setLastName("Tai");
        System.out.println(st1.getName());
        System.out.println(st1.getID());
        System.out.println(st1.getFirstName());
        System.out.println(st1.getLastName());

        System.out.println(st1.toString());
 
    }
}
