package org.example;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        //System.out.println("Today is : " + today);

        DateTimeFormatter fmt =DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm");
        String formattedDate = today.format(fmt);
        System.out.println("Today is: " + formattedDate);

        DateTimeFormatter fmt1 =DateTimeFormatter.ofPattern("yyy-MM-dd");
        String formattedDate1 = today.format(fmt1);
        System.out.println("Today is: " + formattedDate1);

        DateTimeFormatter fmt2 =DateTimeFormatter.ofPattern("MMMM d, yyy");
        String formattedDate2= today.format(fmt2);
        System.out.println("Today is: " + formattedDate2);

        DateTimeFormatter fmt3 =DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");
        String formattedDate3 = today.format(fmt3);
        System.out.println("Today is: " + formattedDate3);



}

}