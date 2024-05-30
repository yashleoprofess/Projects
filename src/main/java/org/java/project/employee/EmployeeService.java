package org.java.project.employee;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private  List<Employee> employees;
    public EmployeeService() throws URISyntaxException, IOException {
     //  employees= EmployeeUtil.employee();
    }
    List<EmployeeUtil> employeeUtils =new ArrayList<>();

    public void showEmployees(String country) {
        if (employees.isEmpty()) {
            System.out.println("Employee Not Found in the country ");
        } else {
            for (Employee temp : employees) {
                if (temp.getCountry().toLowerCase().contains(country)) {
                    System.out.println(temp);
                }
                System.out.println("-".repeat(45));
            }
        }
    }

    public void ShowMaxPaidEmployee(String country) {
        if (employees.isEmpty()) {
            System.out.println("No Employee are found");
            return;
        }
        double maxSalary = maxSalary();
        List<Employee> maxPaidEmployees = new ArrayList<>();
        for (Employee temp : employees) {
            if (temp.getSalary() == maxSalary && temp.getCountry().contains(country)) {
                maxPaidEmployees.add(temp);
            }
        }
        for (Employee emp : maxPaidEmployees) {
            emp.showInfo();
            System.out.println("-".repeat(45));
        }
    }

    public void ShowEmpStats() {
        String Name = getName();
        String Country = getCountry();
        double totalSalary = totalSalary();
        double totalEmployee = totalEmployee();
        System.out.println(" Employee Name : " + Name);
        System.out.println("Employee Country : " + Country);
        System.out.println("Total Salary : "+totalSalary);
        System.out.println("Total Employee : "+totalEmployee);
    }

    private double totalSalary() {
        double total = 0;
        for (Employee emp : employees) {
            total += emp.getSalary();
        }
        return total;
    }

    private int totalEmployee() {
        int count = 0;
        for (Employee employee : employees) {
            count += employee.getId();
        }
        return count;
    }

    private String getCountry() {
        String country = employees.getFirst().getCountry();
        for (Employee employee : employees) {
            if (employee.getCountry().contains(country)) {
                country = employee.getCountry();
            }
        }
        return country;
    }

    private String getName() {
        String Name = employees.getFirst().getName();
        for (Employee employee : employees) {
            if (employee.getName().contains(Name)) {
                Name = employee.getName();
            }
        }
        return Name;
    }

    private double maxSalary() {
        double max = employees.getFirst().getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
        return max;
    }

    private void showDetails(Employee employee) {
        for (Employee employee1:employees) {
            System.out.println("Employee id : " + employee1.getId());
            System.out.println("Employee Name : " + employee1.getName());
            System.out.println("Employee Country : " + employee1.getCountry());
            System.out.println("Employee Salary : " + employee1.getSalary());
        }
    }
}
