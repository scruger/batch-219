package com.xsis.day1.quiz;

import java.util.Scanner;

public class Quiz2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nilaiMatkulA = 0, nilaiMatkulB = 0, nilaiMatkulC = 0, nilaiMatkulD = 0, rataRata = 0;
        System.out.print("Nilai Matkul A : ");
        nilaiMatkulA = in.nextInt();
        System.out.print("Nilai Matkul B : ");
        nilaiMatkulB = in.nextInt();
        System.out.print("Nilai Matkul C : ");
        nilaiMatkulC = in.nextInt();
        System.out.print("Nilai Matkul D : ");
        nilaiMatkulD = in.nextInt();
        rataRata = (nilaiMatkulA + nilaiMatkulB + nilaiMatkulC + nilaiMatkulD) / 4;
        System.out.println("rata - rata : " + rataRata);

    }
}
