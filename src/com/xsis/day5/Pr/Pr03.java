package com.xsis.day5.Pr;

import java.util.Scanner;

public class Pr03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";
        int index = 0, indexString = 0;
        //String[] arr = new String[10];
        System.out.print("input : ");
        input = in.nextLine();
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == ' '){
                index++;
            }
        }

        String[] arr = new String[index+1];
        String splitz = "";

        for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' '){
                    arr[indexString] = splitz;
                    indexString++;
                    splitz = "";
                }else{
                    splitz += input.charAt(i);
                }
                arr[indexString] = splitz;
        }

        String save = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (j > 0 && j < arr[i].length()-1){
                     save += "*";
                }else{
                    save += arr[i].charAt(j);
                }
            }
            arr[i] = save;
            save = "";
            //System.out.println(save);
            System.out.print(arr[i] + " ");
        }


/*
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ' || i == input.length()1){
                System.out.println(i);
                System.out.println(input.substring(awal, i));
                awal = i+1;
            }

        }*/
        //System.out.println(input.length());
        //System.out.println(input.substring(awal, input.length()));
    }
}
