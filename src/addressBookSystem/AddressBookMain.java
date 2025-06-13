package addressBookSystem;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to address book program");
		
		Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();


        String choice;
        do {
            System.out.println("\nEnter Contact Details to Add:");

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
            String phone = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();

            Contact contact = new Contact(firstName, lastName, address, city, state, zip, phone, email);
            addressBook.addContact(contact);

            System.out.print("Do you want to add another contact? (yes/no): ");
            choice = scanner.nextLine();
            
            System.out.println("\nContact Created Successfully:");
            System.out.println(contact);
            
            Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phone, email);

            addressBook.addContact(newContact);
            addressBook.displayContacts();
        } while (choice.equalsIgnoreCase("yes"));

        // Final display
        System.out.println("\nFinal Contact List:");
        addressBook.displayContacts();
      
        System.out.print("\nEnter the First Name of contact to edit: ");
        String nameToEdit = scanner.nextLine();
        addressBook.editContact(nameToEdit);

        System.out.println("\nFinal Contact List:");
        addressBook.displayContacts();
        
        System.out.print("\nEnter the First Name of contact to delete: ");
        String nameToDelete = scanner.nextLine();
        addressBook.deleteContact(nameToDelete);

        System.out.println("\nFinal Contact List:");
        addressBook.displayContacts();
	}

}
