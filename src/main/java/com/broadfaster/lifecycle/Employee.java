package com.broadfaster.lifecycle;

public class Employee{

    private int employeeId;
    private String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        System.out.println("properties has been set using constructor");
    }

    public void init() {
        System.out.println("init using xml config");
    }

    public void destroy() {
        System.out.println("destroy using xml config");
    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName=" + employeeName +
                '}';
    }
}
