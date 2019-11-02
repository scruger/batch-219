package com.xsis.day6.materi.inheritance;

public abstract class EmpoAbstract {

    private String ssn;
    private String name;
    private String email;
    private int yearOfBirth;
    private double salary;

    public EmpoAbstract(String ssn, String name, String email, int yearOfBirth, double salary) {
        this.ssn = ssn;
        this.name = name;
        this.email = email;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
    }

    public abstract double getTotalSalary();

    @Override
    public String toString() {
        return "EmpoAbstract{" +
                "ssn='" + ssn + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", salary=" + salary +
                '}';
    }
}
