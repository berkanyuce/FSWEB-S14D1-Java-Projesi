package com.developercompany;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(String name, double salary, int id) {
        super(name, salary, id);
    }

    @Override
    public void work() {
        System.out.println("SeniorDeveloper is working");
        setSalary(20000);
    }
}
