public class Student {
    private int id ;
    private String firstName ;
    private String lastName ;

    public Student(int id , String firstName , String lastName ) {
        this.id = id ;
        this.firstName = firstName ; 
        this.lastName = lastName ;
    }

    public int getID() {
        return this.id ;
    }

    public String getFirstName() {
        return this.firstName ;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setID(int id ) {
        this.id = id ;
    }
    public void setFirstName(String firstName ) {
        this.firstName = firstName ;
    }
    public void setLastName(String lastName ) {
        this.lastName = lastName ;
    }

    public String getName() {
        return firstName +" "+ lastName ;
    }

    @Override
    public String toString() {
        return String.format( "Student : [id : %d,firstname : %s,lastname : %s] " , this.getID() , this.getFirstName(), this.getLastName() );
    }

}
