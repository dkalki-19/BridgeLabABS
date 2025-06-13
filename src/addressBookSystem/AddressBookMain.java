package addressBookSystem;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to address book program");
		
		Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();


        System.out.println("Enter Contact Details:");
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

        Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);

        System.out.println("\nContact Created Successfully:");
        System.out.println(contact);
        
        Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);

        addressBook.addContact(newContact);
        addressBook.displayContacts();
        
        System.out.print("\nEnter the First Name of contact to edit: ");
        String nameToEdit = scanner.nextLine();
        addressBook.editContact(nameToEdit);

        System.out.println("\nFinal Contact List:");
        addressBook.displayContacts();
	}

}
