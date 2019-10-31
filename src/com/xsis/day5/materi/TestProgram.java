package com.xsis.day5.materi;

public class TestProgram {

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.setNim(123);
        t1.setNama("bob");

        Test t2 = new Test();
        t2.setNim(456);
        t2.setNama("kim");

        Test[] tes = {t1, t2};
        Test[] copy = new Test[2];


        for (int i = 0; i < tes.length; i++) {
            copy[i] = tes[i];
        }

        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i].show());
        }

        //for (int i = 0; i < tes.length; i++) {
          //  if()

        //}
    }
}
