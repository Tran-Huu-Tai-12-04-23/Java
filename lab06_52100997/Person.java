
public class Person {
     protected String name;
     protected String address;

     public Person(String name, String address) {
          this.name = name;
          this.address = address;
     }

     public String getNamwe() {
          return this.name;
     }

     public String getAddress() {
          return this.address;
     }

     @Override
     public String toString() {
          return String.format("Person[%s , %s ]", this.name, this.address);
     }

}
