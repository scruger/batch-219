package com.xsis.day10.kisikisi;

import java.util.Scanner;

public class Kisi09 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int deck = 0, deckPlayer = 0, deckKomputer = 0, kotakA = 0, kotakB = 0, bet = 0;
        String pilihKotak = "", isLanjut = "";
        System.out.print("Input Deck : ");
        deck = in.nextInt();
        deckPlayer = deck;
        deckKomputer = deck;

        do {
            kotakA = (int)(Math.random() * 9.9);
            kotakB = (int)(Math.random() * 9.9);
            System.out.println("\n------- WELCOME -------");
            System.out.println("Total Deck Player : " + deckPlayer);
            System.out.println("Total Deck Komputer : " + deckKomputer);
            System.out.print("\nPilih Kotak A/B : ");
            pilihKotak = in.next().toUpperCase();
            System.out.print("Place Bet : ");
            bet = in.nextInt();
            if (bet > deckPlayer){
                bet = deckPlayer;
            }

            if ((kotakA > kotakB && pilihKotak.equals("A")) || (kotakA < kotakB && pilihKotak.equals("B"))){
                System.out.println("\n------- YOU WIN -------");
                System.out.println("Your Choice : " + pilihKotak);
                System.out.println("Kotak A : " + kotakA);
                System.out.println("Kotak B : " + kotakB);
                System.out.println("You Win");
                deckPlayer += bet;
                deckKomputer -= bet;
            } else if (kotakA == kotakB){
                System.out.println("\n------- DRAW -------");
                System.out.println("Your Choice : " + pilihKotak);
                System.out.println("Kotak A : " + kotakA);
                System.out.println("Kotak B : " + kotakB);
                System.out.println("Try Again");
            } else {
                System.out.println("\n------- YOU LOSE -------");
                System.out.println("Your Choice : " + pilihKotak);
                System.out.println("Kotak A : " + kotakA);
                System.out.println("Kotak B : " + kotakB);
                System.out.println("You Lose");
                deckPlayer -= bet;
                deckKomputer += bet;
            }

            if (deckPlayer < 0){
                deckPlayer = 0;
            }else if (deckKomputer < 0){
                deckKomputer = 0;
            }

            System.out.println("\nDeck Player saat ini : " + deckPlayer);
            System.out.println("Deck Komputer saat ini : " + deckKomputer);

            if (deckPlayer <= 0){
                System.out.println("\n----- PLAYER LOSE -----");
            }else if (deckKomputer <= 0){
                System.out.println("\n----- COMPUTER LOSE -----");
            }

            if (deckPlayer > 0 && deckKomputer > 0){
                System.out.print("\nLanjut atau Menyerah ? Y/N ");
                isLanjut = in.next().toUpperCase();
                if (!isLanjut.equals("Y")){
                    System.out.println("\nYou Are Surrender");
                }
            }


        }while (deckPlayer > 0 && deckKomputer > 0 && isLanjut.equals("Y"));
    }
}
