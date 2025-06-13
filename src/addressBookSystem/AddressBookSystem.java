package addressBookSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookSystem {
    private Map<String, AddressBook> addressBookMap;

    public AddressBookSystem() {
        addressBookMap = new HashMap<>();
    }

    public void addAddressBook(String bookName) {
        if (addressBookMap.containsKey(bookName)) {
            System.out.println("Address Book with this name already exists.");
        } else {
            addressBookMap.put(bookName, new AddressBook());
            System.out.println("Address Book '" + bookName + "' created successfully.");
        }
    }

    public AddressBook getAddressBook(String bookName) {
        return addressBookMap.get(bookName);
    }

    public void listAddressBooks() {
        System.out.println("Available Address Books:");
        for (String name : addressBookMap.keySet()) {
            System.out.println("- " + name);
        }
    }
}
