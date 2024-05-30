package org.java.project.employee;

public class Employee {
    private int id;
    private String name;
    private String country;
    private double salary;
    public Employee(int id,String name,String country,double salary){
        this.id=id;
        this.name=name;
        this.country=country;
        this.salary=salary;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getCountry(){
        return country;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(){
        this.salary=salary;
    }
    public void showInfo(){
        System.out.println("Employee id : "+id);
        System.out.println("Employee name : "+name);
        System.out.println("Employee Country :"+country);
        System.out.println("Employee Salary : "+salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", salary=" + salary +
                '}';
    }
}
