package com.broadfaster.constructorinjection;

public class Student {

    private int studentId;
    private String studentName;
    private String studentAddress;

    public Student(int studentId, String studentName, String studentAddress) {

        System.out.println("using constructor injection");
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
