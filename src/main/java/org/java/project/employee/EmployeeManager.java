package org.java.project.employee;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class EmployeeManager {
    public static void main(String[] args) throws URISyntaxException, IOException {
        EmployeeService service = new EmployeeService();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("*".repeat(30)+" menu page"+"*".repeat(30));
            System.out.println("1. find the Who is Working In these countries");
            System.out.println("2. Maximum Paid Employee In these Countries");
            System.out.println("3. To Show All Employee Details ");
            System.out.println("Chose the option :");
            int options = sc.nextInt();
            switch (options) {
                case 1:
                    System.out.println("Enter the employees of given Country : ");
                    String country = sc.next();
                    service.showEmployees(country);
                    break;
                case 2:
                    System.out.println("Enter the max paid employees of given country");
                    String country1 = sc.next();
                    service.ShowMaxPaidEmployee(country1);
                    break;
                case 3:
                    System.out.println("Enter the country to get Stats of All Employees :");
                    service.ShowEmpStats();
                default:
                    System.out.println("Invalid Input ");
            }
        }
    }
}
