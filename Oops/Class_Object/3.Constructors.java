package com.Oops;

class Employee{
    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
        System.out.println("constructor called... 1");
    }

    Employee(Employee emp){
        this.name = emp.name;
        this.salary = emp.salary;
        System.out.println(" copy constructor called... 2");
    }
    void Details(){
        System.out.println(name+" \n"+salary);
    }
}
 class Constructors {
    public static void main() {
        Employee obj = new Employee("Atharv",40000);
        obj.Details();

//        calling copy constructor
        Employee obj_copy = new Employee(obj);
        obj_copy.Details();



    }
}
