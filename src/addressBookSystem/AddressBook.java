package addressBookSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private List<Contact> contactList;

    public AddressBook() {
        contactList = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
        System.out.println("Contact added successfully!");
    }

    public void displayContacts() {
        if (contactList.isEmpty()) {
            System.out.println("No contacts to display.");
        } else {
            System.out.println("List of Contacts:");
            for (Contact contact : contactList) {
                System.out.println(contact);
            }
        }
    }
    
    
    public void editContact(String nameToEdit) {
        Scanner scanner = new Scanner(System.in);
        for (Contact contact : contactList) {
            if (contact.getFirstName().equalsIgnoreCase(nameToEdit)) {
                System.out.print("Enter New Address: ");
                String address = scanner.nextLine();
                System.out.print("Enter New City: ");
                String city = scanner.nextLine();
                System.out.print("Enter New State: ");
                String state = scanner.nextLine();
                System.out.print("Enter New Zip: ");
                String zip = scanner.nextLine();
                System.out.print("Enter New Phone Number: ");
                String phone = scanner.nextLine();
                System.out.print("Enter New Email: ");
                String email = scanner.nextLine();

                contact.setAddress(address);
                contact.setCity(city);
                contact.setState(state);
                contact.setZip(zip);
                contact.setPhoneNumber(phone);
                contact.setEmail(email);

                System.out.println("Contact updated successfully!");
                return;
            }
        }
        System.out.println("Contact with name " + nameToEdit + " not found.");
    }
}
