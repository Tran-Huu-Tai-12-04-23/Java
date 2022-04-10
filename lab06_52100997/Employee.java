import java.time.LocalDate;

public class Employee {
     protected String ID;
     protected String fullName;
     protected int yearJoined;
     protected double coefficientsSalary;
     protected int numDayOff;

     public Employee() {
          this.ID = "0";
          this.fullName = "";
          this.yearJoined = 2020;
          this.coefficientsSalary = 1.0;
          this.numDayOff = 0;
     }

     public Employee(String ID, String fullName, double coefficientsSalary) {
          this.yearJoined = 2020;
          this.numDayOff = 0;
          this.ID = ID;
          this.fullName = fullName;
          this.coefficientsSalary = coefficientsSalary;
     }

     public Employee(String ID, String fullName, double coefficientsSalary, int yearJoined, int numDayOff) {
          this.ID = ID;
          this.numDayOff = numDayOff;
          this.yearJoined = yearJoined;
          this.coefficientsSalary = coefficientsSalary;
          this.fullName = fullName;
     }

     public double getSenioritySalary() {
          LocalDate localDate = LocalDate.now();
          int year = localDate.getYear();

          return (year - this.yearJoined > 5) ? ((year - this.yearJoined) * (coefficientsSalary / 100))
                    : 0;
     }

     public String considerEmulation() {
          String result = "";
          if (this.numDayOff <= 1) {
               result = "A";
          } else {
               if (numDayOff >= 2 && numDayOff <= 3) {
                    result = "B";
               } else {
                    if (numDayOff > 3) {
                         result = "C";
                    }
               }
          }
          return result;

     }

     public double getSalary() {
          double salary = 0;
          switch (this.considerEmulation()) {
               case "A": {
                    salary = 1150 + 1150 * ((double) this.coefficientsSalary + 1.0)
                              + this.getSenioritySalary();
                    break;
               }
               case "B": {
                    salary = 1150 + 1150 * ((double) this.coefficientsSalary + 0.75)
                              + this.getSenioritySalary();
                    break;
               }
               case "C": {
                    salary = 1150 + 1150 * ((double) this.coefficientsSalary + 0.5)
                              + this.getSenioritySalary();
                    break;
               }
          }
          return salary;
     }

}