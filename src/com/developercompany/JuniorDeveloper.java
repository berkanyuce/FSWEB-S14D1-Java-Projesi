package com.developercompany;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(String name, double salary, int id) {
        super(name, salary, id);
    }

    @Override
    public void work() {
        System.out.println("Junior Developer is working");
        setSalary(5000);
    }
}
