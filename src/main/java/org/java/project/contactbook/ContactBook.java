package org.java.project.contactbook;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//enum ReportType {ADD, DELETE, SHOW};
//
//public class ContactBook {
// private static class Contact{
//    private String name ;
//    private long number ;
//  public Contact (String name ,Long number ){
//          this.name=name;
//          this.number=number;
// }
//   public String getName(){
//       return name;
// }
//  public long getNumber(){
//      return number;
// }
//
// private static List<Contact> contacts = new ArrayList<>();
// private static int count = 0;
//    public static void main(String[] args) {
//  While(true){
// System.out.println(" 1.ADD; 2.Delete; 3. Show; 4.Exit");
//       int userChoice = scanner.nextInt();
//
//            switch (userChoice) {
//                case 1:
//                    Book(ReportType.ADD);
//                    break;
//                case 2:
//                    Book(ReportType.DELETE);
//                    break;
//                case 3:
//                    Book(ReportType.SHOW);
//                    break;
//                case 4:
//                    System.exit(0);
//                default:
//                    System.out.println("Invalid Input");
//            }
//        }
//    }
//}
//    private static void Book(ReportType Options) {
//
//
//        switch (Options) {
//            case ADD:
//                AddingContact();
//                ShowContact();
//                break;
//            case DELETE:
//                DeleteContact();
//                break;
//            case SHOW:
//                ShowContact();
//            default:
//                System.out.println("Invalid Input");
//        }
//    }
//
//    private static void AddingContact() {
//        int count = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Name : ");
//        String Name = sc.next();
//        System.out.println("Enter the Number :");
//        long Number = sc.nextLong();
//        count++;
//    }
//
//    private static void DeleteContact() {
//  Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Name to delete: ");
//        String nameToDelete = sc.next();
//
//        contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(nameToDelete));
//
//        System.out.println("Contact deleted successfully.");
//        count--;
//    }
//
//    private static void ShowContact() {
//
//    }
//}


import java.util.Scanner;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

;

public class ContactBook {
    public static class Contact {
        private String name;
        private long number;

        public Contact(String name, long number) {
            this.name = name;
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public long getNumber() {
            return number;
        }
    }


}





















































