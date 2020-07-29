package OOP_Part_1.Class;

//OOP feature: Class

// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.
public class ClassBankAccount {
    private long account_number;
    private double balance;
    private String customer_name;
    private String email;
    private long phone_number;

    //Setters
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }
    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAccount_number(long account_number) {
        this.account_number = account_number;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Getters
    public String getCustomer_name() {
        return customer_name;
    }
    public long getPhone_number() {
        return phone_number;
    }
    public String getEmail() {
        return email;
    }
    public long getAccount_number() {
        return account_number;
    }
    public double getBalance() {
        return balance;
    }

    public void depositFunds(double amount){
        this.balance += amount;
        System.out.println("RS"+amount+" has been added to your account no:"+ account_number +" and balance is: "+this.balance+"RS");
    }
    public void withdrawFunds(double amount){
        if(this.balance < amount){
            System.out.println("Insufficient Fund!");
        }else {
            this.balance -= amount;
            System.out.println("RS"+amount+" has been deducted from your account no:"+ account_number +" and balance is: "+this.balance+"RS");
        }
    }

    public static void main(String[] args) {
        ClassBankAccount account = new ClassBankAccount();

        account.setCustomer_name("Pranav Chavan");
        account.setPhone_number(9527862112L);
        account.setEmail("pranav.pc@gmail.com");
        account.setAccount_number(12344546346534L);
        account.setBalance(80000.34);

        System.out.println("Name: "+account.getCustomer_name());
        System.out.println("Phone Number: "+account.getPhone_number());
        System.out.println("Email: "+account.getEmail());
        System.out.println("Account Number: "+account.getAccount_number());
        System.out.println("Current balance is: "+account.getBalance()+"RS");

        System.out.println();
        account.depositFunds(5000.23);
        account.withdrawFunds(2000.00);
    }
}
