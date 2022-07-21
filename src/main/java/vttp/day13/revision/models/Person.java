package vttp.day13.revision.models;

public class Person {
    
    private String firstName;
    private String lastName;

    public Person(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {  return firstName;   }
    public void setFirstName(String firstName) {    this.firstName = firstName; }
    public String getLastName() {   return lastName;    }
    public void setLastName(String lastName) {  this.lastName = lastName;   }

    @Override
    public String toString() {
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\n";
    }
}
