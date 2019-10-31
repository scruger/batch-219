package com.xsis.day5.materi.encapsulation;

public class StudentProgram {

    public static void main(String[] args) {
        Student st1 = new Student("123", "Bob", "Teknik Informatika", 3.14);
        Student st2 = new Student("234", "Odang");
        Student st3 = new Student("456", "Hnedy");
        /*st1.setNama("Bob");
        st1.setNim("123");
        st1.setJurusan("Teknik Informatika");
        st1.setIpk(3.45);
        st1.setType("BOOTCAMP");*/

        System.out.println(st1.getNim() + " / " + st1.getNama());
        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());
        System.out.println("Total Student : " + Student.counter);
        System.out.println("-----------------------------------");

        // isi array listStudent dengan object student
        Student[] listStudent = {st1, st2, st3};

        for (int i = 0; i < listStudent.length; i++) {
            if(listStudent[i].getNim() == "234"){
                System.out.println(listStudent[i].toString());
            }
        }

        // update type attribute
        System.out.println("-----Update Type Atribute-----");
        for (int i = 0; i < listStudent.length; i++) {
            if(listStudent[i].getType() == null){
                listStudent[i].setType("BOOTCAMP");
            }
            System.out.println(listStudent[i].toString());
        }
    }
}
