package com.xsis.day5.Pr;

import java.util.Scanner;

public class Pr03Coba {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";
        String save = "";

        System.out.print("Masukkan Kata : ");
        input = in.nextLine();

        for (int i = 0; i < input.length(); i++) {

            if(i == 0 || i == input.length()-1){
                save += input.charAt(i);
            }else if ((i < input.length()-1) && (input.charAt(i + 1) == ' ')){
                save += input.charAt(i);
            }else if (input.charAt(i) == ' '){
                save += input.charAt(i);
            }else if(input.charAt(i - 1) == ' '){
                save += input.charAt(i);
            }else{
                save += "*";
            }
        }
        System.out.println(save);
    }
}
