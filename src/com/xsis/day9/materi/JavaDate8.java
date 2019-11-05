package com.xsis.day9.materi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoPeriod;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class JavaDate8 {

    public static void main(String[] args) {
        LocalDate current = LocalDate.now();
        System.out.println("CurrentDate : " + current);

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before Foarmating : " + now);

        DateTimeFormatter formatPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        String formatDateTime = now.format(formatPattern);
        System.out.println("After Format : " + formatDateTime);

        LocalDateTime startDate = LocalDateTime.of(2019, 11, 4, 10, 30, 00);
        LocalDateTime endDate = LocalDateTime.of(2019, 12, 5, 12, 30, 00);

        System.out.println("Start Date : " + startDate);
        System.out.println("End Date : " + endDate);

        //count between dates
        long years = ChronoUnit.YEARS.between(startDate, endDate);
        long months = ChronoUnit.MONTHS.between(startDate, endDate);
        long weeks = ChronoUnit.WEEKS.between(startDate, endDate);
        long days = ChronoUnit.DAYS.between(startDate, endDate);
        long hours = ChronoUnit.HOURS.between(startDate, endDate);
        long minutes = ChronoUnit.MINUTES.between(startDate, endDate);
        long seconds = ChronoUnit.SECONDS.between(startDate, endDate);
        long millis = ChronoUnit.MILLIS.between(startDate, endDate);

        System.out.println("Years : " + years);
        System.out.println("Months : " + months);
        System.out.println("Weeks : " + weeks);
        System.out.println("Days : " + days);
        System.out.println("Hours : " + hours);
        System.out.println("Minutes : " + minutes);
        System.out.println("Seconds : " + seconds);
        System.out.println("Millis : " + millis);

    }
}
