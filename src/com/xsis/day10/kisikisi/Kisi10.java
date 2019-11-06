package com.xsis.day10.kisikisi;

import java.util.Scanner;

public class Kisi10 {

    static void fibbonacci(int arr[]){
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }
    }

    static void primeNumbers(int arr[]){
        int count = 0;
        int index = 0;
        for (int i = 2; index < arr.length; i++) {
            count = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0){
                    count++;
                }
            }
            if(count == 1){
                arr[index] = i;
                index++;
            }
        }
    }

    static void jumlahDeret(int arr[], int arrFib[], int arrPrime[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrFib[i] + arrPrime[i];
        }
    }

    static void display(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int range = 0;
        System.out.print("input range : ");
        range = in.nextInt();
        int arrFib[] = new int[range];
        int arrPrime[] = new int[range];
        int arrJumlah[] = new int[range];
        System.out.println("----- Fibonacci -----");
        fibbonacci(arrFib);
        display(arrFib);
        System.out.println("\n----- Prime -----");
        primeNumbers(arrPrime);
        display(arrPrime);
        System.out.println("\n----- Result Sum -----");
        jumlahDeret(arrJumlah, arrFib, arrPrime);
        display(arrJumlah);
    }
}
