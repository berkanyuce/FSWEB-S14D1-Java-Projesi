package com.developercompany;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(String name, double salary, int id) {
        super(name, salary, id);
        juniorDevelopers = new JuniorDeveloper[10];
        midDevelopers = new MidDeveloper[10];
        seniorDevelopers = new SeniorDeveloper[10];
    }
    @Override
    public void work() {
        System.out.println("HR Manager is working");
        setSalary(10000);
    }


    public void addEmployee(int index, JuniorDeveloper juniorDeveloper) {
        if (index >= 0 && index < juniorDevelopers.length) {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = juniorDeveloper;
                System.out.println("Junior Developer added successfully at index " + index);
            } else {
                System.out.println("Index " + index + " is already occupied. Cannot add Junior Developer.");
            }
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public void addEmployee(int index, MidDeveloper midDeveloper) {
        if (index >= 0 && index < midDevelopers.length) {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = midDeveloper;
                System.out.println("Mid Developer added successfully at index " + index);
            } else {
                System.out.println("Index " + index + " is already occupied. Cannot add Mid Developer.");
            }
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloper) {
        if (index >= 0 && index < seniorDevelopers.length) {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = seniorDeveloper;
                System.out.println("Senior Developer added successfully at index " + index);
            } else {
                System.out.println("Index " + index + " is already occupied. Cannot add Senior Developer.");
            }
        } else {
            System.out.println("Index out of bounds");
        }
    }

}
