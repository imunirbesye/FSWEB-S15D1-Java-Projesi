package tr.com.workintech.mobilePhone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts = new ArrayList<Contact>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contact contact) {
        if(myContacts.contains(contact)) {
            return false;
        } else {
            myContacts.add(contact);
            return true;
        }
    }

    public boolean updateContact(Contact oldC, Contact newC){
        if(myContacts.contains(oldC)) {
            int i = myContacts.indexOf(oldC);
            myContacts.set(i, newC);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact){
        if(myContacts.contains(contact)) {
            myContacts.remove(contact);
            return true;
        } else {
            return false;
        }
    }

    public int findContact(Contact contact) {
        for(int i = 0; i < myContacts.size(); i++){
            if(myContacts.get(i).getName().equals(contact.getName())){
                if(myContacts.get(i).getNumber().equals(contact.getNumber()))
                    return i;
            }
        }
        return -1;
    }

    public int findContact(String number) {
        for(Contact c : myContacts){
            if(c.getNumber().equals(number))
                return myContacts.indexOf(c);
        }

        return -1;
    }

    public Contact queryContact(String name){
        for(Contact c : myContacts){
            if(c.getName().equals(name)){
                return c;
            }
        }

        return null;
    }

    public void printContact() {
        for(int i = 0; i < myContacts.size(); i++){
            System.out.println(i+1 + " " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getNumber());
        }
    }
}
