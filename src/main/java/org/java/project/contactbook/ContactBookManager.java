package org.java.project.contactbook;

import java.util.Scanner;

import static org.java.project.contactbook.ContactBookService.*;


public class ContactBookManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1.ADD; 2.Delete; 3.Show; 4.Exit ");
            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    Book(ReportType.ADD);
                    break;
                case 2:
                    Book(ReportType.DELETE);
                    break;
                case 3:
                    Book(ReportType.SHOW);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

}
