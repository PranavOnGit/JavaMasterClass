package Exercises;

//OOP concept: Class
//Please refer Person.txt for problem statement.
public class Person {

    private String firstName;
    private String lastName;
    private int age;

    //Setters
    public void setAge(int age) {
        if(age < 0 || age > 100){
            this.age = 0;
        }else {
            this.age = age;
        }
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    public boolean isTeen(){
        if( this.age > 12 && this.age < 20){
            return true;
        }else {
            return false;
        }
    }
    public String getFullName(){
        if(this.firstName.isEmpty() && this.lastName.isEmpty()){
            return "";
        }else if(this.lastName.isEmpty()){
            return firstName;
        }else if (this.firstName.isEmpty()){
            return lastName;
        }else {
            return firstName+" "+lastName;
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string

        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John

        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}
