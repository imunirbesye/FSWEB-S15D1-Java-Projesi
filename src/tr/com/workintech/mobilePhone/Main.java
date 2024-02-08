package tr.com.workintech.mobilePhone;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("5318179227");

        Contact c1 = new Contact("Annem", "5468568179");
        Contact c2 = new Contact("Babam", "5468568176");
        Contact c3 = new Contact("Yunus", "5421587145");
        Contact c4 = new Contact("Ark1", "5395244889");
        Contact c5 = new Contact("Ark2", "5424242424");

        mobilePhone.addNewContact(c1);
        mobilePhone.addNewContact(c2);
        mobilePhone.addNewContact(c3);
        mobilePhone.addNewContact(c4);
        mobilePhone.addNewContact(c5);

        mobilePhone.printContact();

        System.out.println(mobilePhone.findContact("5468568176"));
        System.out.println(mobilePhone.findContact(new Contact("Yunus", "5421587145")));
        System.out.println(mobilePhone.queryContact("Ark1").getNumber());
        System.out.println(mobilePhone.removeContact(c3));

        mobilePhone.printContact();
    }
}
