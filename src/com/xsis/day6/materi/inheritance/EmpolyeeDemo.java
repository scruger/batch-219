package com.xsis.day6.materi.inheritance;

public class EmpolyeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("1234", "Xsis", "xsis@gmail.com", 2000, 2);
        System.out.println(e1.toString());

        Manager m1 = new Manager("1001", "Vadjar", "vadjar@gmail.com", 1995, 2000000, 10000);
        System.out.println(m1.toString());
        System.out.println(m1.getSalary());

        m1.setSalary(5000000);
        System.out.println(m1.toString());

        System.out.println("===================== interface =======================");
        // implementation interface
        EmployeeInterface emi = m1;
        emi.setPotongGaji(56000);
        System.out.println(emi.getInfoEmployee());

        System.out.println("===================== abstract =======================");
        Staff st1 = new Staff("1000", "abstract", "abs@gmail.com", 2015, 75000);
        System.out.println(st1.toString());

        System.out.println("===================== abstract =======================");
        Employee e2 = new Manager("2000", "Empolyee2", "emp2@gmail.com", 2004, 25000, 500);
        System.out.println(e2.toString());

    }
}
