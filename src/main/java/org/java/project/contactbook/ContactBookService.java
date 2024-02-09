package org.java.project.contactbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactBookService {
    ContactBook Contact =new ContactBook();
    private static List<ContactBook.Contact> contacts = new ArrayList<>();
    private static int count = 0;


    public static void Book(ReportType options) {
        switch (options) {
            case ADD:
                AddingContact();
                ShowContact();
                break;
            case DELETE:
                DeleteContact();
                ShowContact();
                break;
            case SHOW:
                ShowContact();
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
    public static void AddingContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String name = sc.next();
        System.out.println("Enter the Number: ");
        long number = sc.nextLong();
        ContactBook.Contact newContact = new ContactBook.Contact(name, number);
        contacts.add(newContact);
        count++;
    }

    public static void DeleteContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name to delete: ");
        String nameToDelete = sc.next();

        contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(nameToDelete));

        System.out.println("Contact deleted successfully.");
        count--;
    }

    public static void ShowContact() {
        System.out.println("Contacts:");

        for (ContactBook.Contact contact : contacts) {
            System.out.println("Name: " + contact.getName() + ", Number: " + contact.getNumber());
        }

        System.out.println("Total Contacts: " + count);
    }
}
