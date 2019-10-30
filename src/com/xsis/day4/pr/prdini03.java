package com.xsis.day4.pr;

public class prdini03 {
    public static void main(String[] args) {
        int[][] n = {{14, 10, 55, 11, 90},
                {3, 12, 7, 88,2 },
                {5, 6, 43, 1, 3},
                {11, 55, 123, 15, 4},
                {15, 55, 67, 18, 8}};
        int max = 0;
        for (int i = 0; i <n.length ; i++) {
            for (int j = 0; j <n[i].length ; j++) {
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i <n.length ; i++) {
            for (int j = 0; j <n[i].length ; j++) {
                if (n[i][j]>max){
                    max = n[i][j];
                }
            }
        }
        System.out.println("The max value is: "+max);
    }
}
