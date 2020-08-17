package Challanges.ArrayList;
import javax.xml.namespace.QName;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("123 123 123");

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        startPhone();
        printMenu();
        while (!quit){
            System.out.println("Please enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    System.out.println("Phone is shutting down...");
                    quit = true;
                    break;
                case 1: printContacts(); break;
                case 2: addNumber(); break;
                case 3: updateNumber(); break;
                case 4: removeNumber(); break;
                case 5: checkNumber(); break;
                case 6: printMenu(); break;
            }
        }
    }

    public static void addNumber(){
        System.out.println("Add Name:");
        String name = scanner.nextLine();
        System.out.println("Add Phone number");
        String number = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name,number);
        if (mobilePhone.addNewContact(newContact)){
            System.out.println("New Contact name: "+name+" and phone Number: "+number+" is added!");
        }else {
            System.out.println("Can't add. As"+name+" is already exist!");
        }
    }

    //update
    public static void updateNumber(){
        System.out.println("please enter existing contact name:");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null ){
            System.out.println("Record not found!");
            return;
        }
        System.out.println("Enter new contact name");
        String newName =  scanner.nextLine();
        System.out.println("Enter new contact number");
        String newNumber =  scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName,newNumber);
        if (mobilePhone.updatePhoneNumber(existingContactRecord, newContact)){
            System.out.println("Record added successfully!");
        }else {
            System.out.println("record already exist!");
        }

    }

    //remove
    public static void removeNumber() {
        System.out.println("please enter existing contact name:");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Record not found!");
            return;
        }
        if (mobilePhone.removePhoneNumber(existingContactRecord)){
            System.out.println("Contact has been removed successfully!");
        }else {
            System.out.println("Error deleting contact.");
        }
    }

    //query
    public static void checkNumber() {
        System.out.println("please enter existing contact name:");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Record not found!");
            return;
        }
        System.out.println("Name: "+existingContactRecord.getName()+" Phone: "+existingContactRecord.getPhone());
    }

    public static void startPhone(){ System.out.println("Phone is starting up!..."); }

    public static void printMenu(){
        System.out.println("\n***** PHONE MENU *****\n" +
                            "0 - Shutdown the phone\n" +
                            "1 - Print contact list\n" +
                            "2 - Add new Number\n" +
                            "3 - Update the Number\n" +
                            "4 - Remove the Number\n" +
                            "5 - Check if the Number exist\n" +
                            "6 - print Instructions");
    }

    public static void printContacts(){
        mobilePhone.printContacts();
    }
}
