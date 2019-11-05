package com.xsis.day9.quiz9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Parkir {

   static void jamMasuk(String inputDate, String inputTime, Date dateMasuk){
       Scanner in = new Scanner(System.in);
       System.out.println("Masukkan Tanggal Masuk (dd/MM/yyyy) : ");
       inputDate = in.nextLine();

       System.out.println("Masukkan Jam Masuk (hh:mm:ss) : ");
       inputTime = in.nextLine();
       String dateTime = inputDate + " " + inputTime;
       SimpleDateFormat dateTimeFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
       dateMasuk = null;
       try {
           //Parsing the String
           dateMasuk = dateTimeFormat.parse(dateTime);
       } catch (ParseException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }
       System.out.println(dateMasuk);
   }

    static void jamKeluar(String inputDate, String inputTime, Date dateKeluar){
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Tanggal Keluar (dd/MM/yyyy) : ");
        inputDate = in.nextLine();

        System.out.println("Masukkan Jam Keluar (hh:mm:ss) : ");
        inputTime = in.nextLine();
        String dateTime = inputDate + " " + inputTime;
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        dateKeluar = null;
        try {
            //Parsing the String
            dateKeluar = dateTimeFormat.parse(dateTime);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(dateKeluar);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0;
        String inputDate = "";
        String inputTime = "";
        String dateTime = "";
        String kelInputDate = "";
        String kelInputTime = "";
        String kelDateTime = "";
        Date dateMasuk = null;
        Date dateKeluar = null;
        Date currentDate = new Date();
        //System.out.println("CurrentDate : " + currentDate);
        SimpleDateFormat formatterDate = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatterTime = new SimpleDateFormat("hh:mm:ss");
        String formDate = formatterDate.format(currentDate);
        String formTime = formatterTime.format(currentDate);
        /*System.out.println("Enter the Date : ");

        String date = in.next();
        //SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");


        System.out.println("Enter the Time : ");
        String time = in.next();
        //SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");

        //String dateTime = date + " " + time;
        System.out.println("debug date time" + dateTime);

        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

        Date date2 = null;
        try {
            //Parsing the String
            date2 = dateTimeFormat.parse(dateTime);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(date2);*/





        System.out.println("Pilih Kendaraan : ");
        System.out.println("1. Motor");
        System.out.println("2. Mobil");
        System.out.println("3. Tidak Jadi");
        System.out.print("Masukkan Input : ");
        input = in.nextInt();
        switch (input){
            case 1:
                System.out.println("================== Motor ====================");
                System.out.println("Masukkan Tanggal Masuk (dd/MM/yyyy) : ");
                inputDate = in.next();

                System.out.println("Masukkan Jam Masuk (hh:mm:ss) : ");
                inputTime = in.next();
                dateTime = inputDate + " " + inputTime;
                SimpleDateFormat dateTimeFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
                try {
                    //Parsing the String
                    dateMasuk = dateTimeFormat.parse(dateTime);
                } catch (ParseException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println(dateMasuk);

               //LocalDateTime startDate = LocalDateTime.of(dateMasuk);
               //LocalDateTime endDate = LocalDateTime.of(dateKeluar);

               //long hours = ChronoUnit.HOURS.between(startDate, endDate);
               //long minutes = ChronoUnit.MINUTES.between(startDate, endDate);

              //  System.out.println("hours : " + hours);
               // System.out.println("minutes : " + minutes);

                break;
            case 2:
                System.out.println("================== Mobil ====================");
                System.out.println("Masukkan Tanggal Masuk (dd/MM/yyyy) : ");
                System.out.println("Masukkan Jam Masuk (hh:mm:ss) : ");

                System.out.println("Masukkan Tanggal Keluar (dd/MM/yyyy) : ");
                System.out.println("Masukkan Jam Keluar (hh:mm:ss) : ");
                break;
            default:
        }

    }
}
