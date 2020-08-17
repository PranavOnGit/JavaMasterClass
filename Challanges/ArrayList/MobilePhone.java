package Challanges.ArrayList;
import java.util.ArrayList;

public class MobilePhone {
    private String phoneNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    //Add contact
    public boolean addNewContact(Contacts contacts){
        if (findContact(contacts.getName()) >= 0){
            System.out.println("Contact already exits!");
            return false;
        }
        myContacts.add(contacts);
        return true;
    }

    //update the number
    public boolean updatePhoneNumber(Contacts oldContact, Contacts newContact) {
        int foundPosition = findContact(oldContact);

        if (foundPosition <= 0){
            System.out.println(oldContact.getName()+" was not found.");
            return false;
        } else if (findContact(newContact.getName()) != -1){
            System.out.println("Contact with name "+newContact.getName()+" is already exist");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName()+" is replaced with "+newContact.getName());
        return true;
    }

    //Remove the number
    public boolean removePhoneNumber(Contacts contacts) {
        int foundPosition = findContact(contacts);
        if (foundPosition < 0){
            System.out.println(foundPosition + contacts.getName()+" was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contacts.getName()+" has been deleted");
        return true;
    }

    //Find by accepting number
    public int findContact(Contacts contacts){
        return this.myContacts.indexOf(contacts);
    }
    //Find by accepting string
    public int findContact(String contactName){
        for (int i = 0; i < myContacts.size() ; i++) {
            Contacts contacts = this.myContacts.get(i);
            if (contacts.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    //Query Contact int
    public String queryContact(Contacts contacts){
        if (findContact(contacts) >= 0) {
            return contacts.getName();
        }
       return null;
    }
    //Query Contact String
    public Contacts queryContact(String name){
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    //Print Contacts
    public void printContacts(){
        System.out.println("Contact List");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i+1)+" "
                                +this.myContacts.get(i).getName()+" > "
                                +this.myContacts.get(i).getPhone());
        }
    }
}
