package com.xsis.day6.materi.inheritance;

public class Manager extends Employee implements EmployeeInterface{

    private double commissions;

    public Manager(String ssn, String name, String email, int yearOfBirth, double salary, double commissions) {
        super(ssn, name, email, yearOfBirth, salary);
        this.commissions = commissions;
    }

    @Override
    public String getInfoEmployee() {
        return toString() + " from interface";
    }

    @Override
    public void setPotongGaji(double gaji) {
        setSalary(getSalary() - gaji);
    }

    @Override
    public void setKomisi(double komisi) {

    }

    public double getCommissions() {
        return commissions;
    }

    public void setCommissions(double commissions) {
        this.commissions = commissions;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + getCommissions();
    }

    @Override
    public String toString() {
        return super.toString().replace("Employee", "Manager") +
                "commissions=" + commissions +
                '}';
    }
}
