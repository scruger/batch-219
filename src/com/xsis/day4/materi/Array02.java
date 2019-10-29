package com.xsis.day4.materi;

import java.util.Scanner;

public class Array02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = new int[5];
        //int[] n = {1, 2, 4, 10 ,15};
        //initArray(n);
        initArrayScanner(n);
        showArray(n);
        replaceArray(n, 10, 50);
        showArray(n);

    }

    // inisialisasi with Scanner
    static void initArrayScanner(int[] n){
        Scanner in = new Scanner(System.in);
        int a = 0;
        for (int i = 0; i < n.length; i++) {
            System.out.print("Input index ke-" + i + " : ");
            a = in.nextInt();
            n[i] = a;
        }
    }

    // method untuk inisialisasi array
    static void initArray(int[] n){
        System.out.println("initial array...");
        n[0] = 1;
        n[1] = 2;
        n[2] = 4;
        n[3] = 10;
        n[4] = 15;
    }

    // method display array
    static void showArray(int[] n){
        System.out.println("show array...");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }

    // replace index array
    static void replaceArray(int[] n){
        System.out.println("\nreplace value...");
        for (int i = 0; i < n.length; i++){
            if (n[i] == 15){
                n[i] = 90;
                System.out.println("index ke : " + i + " replace with value : " + n[i]);
            }
        }
    }

    // replace value index array
    static void replaceArray(int[] n , int value, int valueReplace){
        System.out.println("\nreplace value...");
        for (int i = 0; i < n.length; i++){
            if (n[i] == value){
                n[i] = valueReplace;
                System.out.println("index ke : " + i + " replace with value : " + n[i]);
            }
        }
    }


}
