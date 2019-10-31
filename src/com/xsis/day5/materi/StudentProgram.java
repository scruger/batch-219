package com.xsis.day5.materi;

public class StudentProgram {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.nama = "Nondi";
        st1.nim = "123";
        st1.jurusan = "Teknik Informatika";
        st1.ipk = 3.45;
        st1.type = "REGULER";

        Student st2 = new Student();
        st2.nama = "Odang";
        st2.nim = "126";
        st2.jurusan = "Hukum";
        st2.ipk = 3.91;
        st2.type = "BOOTCAMP";

        System.out.println(st1);
    }
}
