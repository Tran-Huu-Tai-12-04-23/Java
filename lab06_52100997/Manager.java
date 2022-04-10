import javafx.scene.input.Mnemonic;

public class Manager extends Employee {
     private String position;
     private String department;
     private double salaryCoefficientPosition;

     public Manager() {
          this.department = "Admin";
          this.salaryCoefficientPosition = 5.0;
     }

     public Manager(String ID, String fullName, double coefficientsSalary, String postion,
               double salaryCoefficientPosition) {
          this.numDayOff = 0;
          this.yearJoined = 2020;
          this.ID = ID;
          this.fullName = fullName;
          this.coefficientsSalary = coefficientsSalary;
          this.position = postion;
          this.salaryCoefficientPosition = salaryCoefficientPosition;
     }

     public Manager(String ID, int numDayOff, int yearJoined, String fullName, double coefficientsSalary,
               String position, double salaryCoefficientPosition) {
          this.numDayOff = numDayOff;
          this.position = position;
          this.yearJoined = yearJoined;
          this.fullName = fullName;
          this.coefficientsSalary = coefficientsSalary;
          this.salaryCoefficientPosition = salaryCoefficientPosition;
          this.ID = ID;
     }

     @Override
     public String considerEmulation() {
          return "A";
     }

     public double bonusByPosition() {
          return 1150 * this.salaryCoefficientPosition;
     }

     @Override
     public double getSalary() {
          return 1150 * 1150 * (this.salaryCoefficientPosition + 1.0)
                    + this.getSenioritySalary() + this.bonusByPosition();
     }

}