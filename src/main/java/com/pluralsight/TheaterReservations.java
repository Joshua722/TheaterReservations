package com.pluralsight;
import java.time.format.DateTimeFormatter;
import java.time.*;
import java.util.*;


public class TheaterReservations {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("M/d/yyyy");

        System.out.println("Please enter your name (firstname lastname) : ");
            String userName = myScanner.nextLine();
            userName = userName.trim();
        System.out.println("What date will you be coming? (MM/dd/yyyy): ");
            String userDate = myScanner.next();
            userDate = userDate.trim();
        System.out.println("How many tickets would you like? : ");
            int userQuantity = myScanner.nextInt();


        String[] userNames = userName.split("\\ ");

        LocalDate dateReserved = LocalDate.parse(userDate, format);

        if(userQuantity > 1){
            System.out.println(userQuantity + " tickets reserved for " + userDate + " under the name " + userNames[1] + ", " + userNames[0]);
        }
        else {
            System.out.println(userQuantity + "ticket reserved for " + userDate + " under the name " + userNames[1] + ", " + userNames[0]);
        }


    }
}
