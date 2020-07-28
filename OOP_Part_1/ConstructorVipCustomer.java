package OOP_Part_1;

//OOP concept: Constructor

// Create a new class ConstructorVipCustomer
// it should have 3 fields name, credit limit, and email address.
// create 3 constructors
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
// 3rd constructor should save all fields.
// create getters only for this using code generation of intellij as setters wont be needed
// test and confirm it works.

public class ConstructorVipCustomer {
    private String name;
    private int credit_limit;
    private String email_address;

    //1st Constructor
    public ConstructorVipCustomer(){
        this("Default Name", 10000, "Default Email" );
    }

    //2nd Constructor
    public ConstructorVipCustomer(int credit_limit, String email_address){
        this("Default Name", credit_limit, email_address);
    }

    //3rd Constructor
    public ConstructorVipCustomer(String name, int credit_limit, String email_address){
        this.name =  name;
        this.credit_limit = credit_limit;
        this.email_address =  email_address;
    }

    //Getters
    public String getName() {
        return name;
    }
    public int getCredit_limit() {
        return credit_limit;
    }
    public String getEmail_address() {
        return email_address;
    }

    public static void main(String[] args) {
        ConstructorVipCustomer custom1 =  new ConstructorVipCustomer();
        ConstructorVipCustomer custom2 =  new ConstructorVipCustomer(340000, "dom12@gmail.com");
        ConstructorVipCustomer custom3 =  new ConstructorVipCustomer("Pranav Chavan", 50000, "pranav.pc@gmail.com");

        System.out.println("Customer 1:");
        System.out.println("Name: "+custom1.getName());
        System.out.println("Email: "+custom1.getEmail_address());
        System.out.println("Credit Limit: "+custom1.getCredit_limit());
        System.out.println();

        System.out.println("Customer 2:");
        System.out.println("Name: "+custom2.getName());
        System.out.println("Email: "+custom3.getEmail_address());
        System.out.println("Credit Limit: "+custom2.getCredit_limit());
        System.out.println();

        System.out.println("Customer 3:");
        System.out.println("Name: "+custom3.getName());
        System.out.println("Email: "+custom3.getEmail_address());
        System.out.println("Credit Limit: "+custom3.getCredit_limit());
    }
}
