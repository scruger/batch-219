package com.xsis.day9.materi;


import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaClassicDate {

    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println("CurrentDate : " + currentDate);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String strDate = formatter.format(currentDate);

        System.out.println("Format Date : " + strDate);

    }
}
