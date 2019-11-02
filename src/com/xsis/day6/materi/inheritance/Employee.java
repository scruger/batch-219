package com.xsis.day6.materi.inheritance;

public class Employee {

    private String ssn;
    private String name;
    private String email;
    private int yearOfBirth;
    private double salary;

    public Employee(String ssn, String name, String email, int yearOfBirth, double salary) {
        if (salary <= 0.0){
            throw new IllegalArgumentException("Salary harus lebih besar > 0.0");
        }
        this.ssn = ssn;
        this.name = name;
        this.email = email;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;

    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ssn='" + ssn + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", yearOfBirth='" + yearOfBirth + '\'' +
                ", salary=" + salary +
                '}';
    }
}
