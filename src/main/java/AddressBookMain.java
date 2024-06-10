import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook System.");

        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter contact details:");
        int id=(int)Math.random()*100;
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.print("State: ");
        String state = scanner.nextLine();
        System.out.print("Zip: ");
        String zip = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Contact contact = new Contact(id,firstName, lastName, address, city, state, zip, phoneNumber, email);
        addressBook.addContact(contact);

        System.out.println("Contacts in Address Book:");
        addressBook.showContacts();
    }





}
