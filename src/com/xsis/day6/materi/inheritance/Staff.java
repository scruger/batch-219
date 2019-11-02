package com.xsis.day6.materi.inheritance;

public class Staff extends EmpoAbstract {

    public Staff(String ssn, String name, String email, int yearOfBirth, double salary) {
        super(ssn, name, email, yearOfBirth, salary);
    }

    @Override
    public double getTotalSalary() {
        return 0;
    }
}
