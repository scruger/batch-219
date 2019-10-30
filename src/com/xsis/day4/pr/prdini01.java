package com.xsis.day4.pr;

public class prdini01 {
    public static void main(String[] args) {
        int[][] n = new int[5][5];
        for (int i = 0; i <n.length ; i++) {
            for (int j = 0; j <n[i].length ; j++) {
                if(i==4-j){
                    n[i][j]=5;
                } else if(i<4-j){
                    n[i][j]=11;
                } else {
                    n[i][j]=88;
                }
            }
        }
        for (int i = 0; i <n.length ; i++) {
            for (int j = 0; j <n[i].length ; j++) {
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
    }
}
