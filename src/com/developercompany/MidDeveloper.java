package com.developercompany;

public class MidDeveloper extends Employee{
    public MidDeveloper(String name, double salary, int id) {
        super(name, salary, id);
    }

    @Override
    public void work() {
        System.out.println("MidDeveloper is working");
        setSalary(7000);
    }
}
