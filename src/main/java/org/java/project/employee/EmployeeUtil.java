package org.java.project.employee;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class EmployeeUtil {
    public static void main(String[] args)throws URISyntaxException, IOException  {


       // public static List<Employee> employee() {
            List<String> Employees = Files.readAllLines(Path.of(EmployeeUtil.class.getResource("/employees.csv").toURI()));

            for (String temp : Employees) {
                System.out.println(temp);
           /* int id =Integer.parseInt(temp[0]);
                    String name =temp[1];
            String country =temp[2];
            double salary =Double.parseDouble(temp[3]);*/

            }

            List<Employee> data =new ArrayList<>();
           // return null;


    }

   /* public static void employee() throws IOException {
        Path path=Path.of("src","main","resources","employees.csv");
       Map<Object, List<Employee>> Employees= Files.lines(path)
                .skip(1)
                .map(EmployeeUtil::getEmployee)
               .collect(Collectors.groupingBy(Employee::getCountry));
        System.out.println(Employees);
    }
private static Employee getEmployee(String line){
    String[] fields =line.split(",");
    if (fields.length != 4) {
        throw  new RuntimeException("Invalid Line in Csv File "+line);
    }
    return new Employee(Integer.parseInt(fields[0]),fields[1],fields[2],Integer.parseInt(fields[3]));
}*/


}
