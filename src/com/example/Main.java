package com.example;

import java.util.Random;

public class Main {

    final static int LEAP_YEAR = 2000;
    final static int NON_LEAP = 2100;


    public static void main(String[] args) {
        Month[] months = Month.values();

        Month month = Month.JANUARY;
        if (month.getDays(LEAP_YEAR) == 31 && month.getDays(NON_LEAP) == 31) {
            System.out.println("Success, January has 31 days regardless of year");
        } else {
            System.out.println("Error, January has 31 days regardless of year");
        }

        month = Month.FEBRUARY;
        if (month.getDays(LEAP_YEAR) == 29) {
            System.out.println("Success, February has 29 days during LEAP YEAR " + LEAP_YEAR);
        } else {
            System.out.println("ERROR, February has 29 days during LEAP YEAR " + LEAP_YEAR);
        }

        if (month.getDays(NON_LEAP) == 28) {
            System.out.println("Success, February has 28 days during NON LEAP YEAR " + NON_LEAP);
        } else {
            System.out.println("ERROR, February has 28 days during NON LEAP YEAR " + NON_LEAP);
        }

        month = Month.MARCH;
        if (month.getDays(LEAP_YEAR) == 31 && month.getDays(NON_LEAP) == 31) {
            System.out.println("Success, March has 31 days regardless of year");
        } else {
            System.out.println("Error, March has 31 days regardless of year");
        }
        month = Month.APRIL;
        if (month.getDays(LEAP_YEAR) == 30 && month.getDays(NON_LEAP) == 30) {
            System.out.println("Success, April has 30 days regardless of year");
        } else {
            System.out.println("Error, April has 30 days regardless of year");
        }
        month = Month.MAY;
        if (month.getDays(LEAP_YEAR) == 31 && month.getDays(NON_LEAP) == 31) {
            System.out.println("Success, May has 31 days regardless of year");
        } else {
            System.out.println("Error, May has 31 days regardless of year");
        }
        month = Month.JUNE;
        if (month.getDays(LEAP_YEAR) == 30 && month.getDays(NON_LEAP) == 30) {
            System.out.println("Success, June has 30 days regardless of year");
        } else {
            System.out.println("Error, June has 30 days regardless of year");
        }
        month = Month.JULY;
        if (month.getDays(LEAP_YEAR) == 31 && month.getDays(NON_LEAP) == 31) {
            System.out.println("Success, July has 31 days regardless of year");
        } else {
            System.out.println("Error, July has 31 days regardless of year");
        }
        month = Month.AUGUST;
        if (month.getDays(LEAP_YEAR) == 31 && month.getDays(NON_LEAP) == 31) {
            System.out.println("Success, August has 31 days regardless of year");
        } else {
            System.out.println("Error, August has 31 days regardless of year");
        }
        month = Month.SEPTEMBER;
        if (month.getDays(LEAP_YEAR) == 30 && month.getDays(NON_LEAP) == 30) {
            System.out.println("Success, September has 30 days regardless of year");
        } else {
            System.out.println("Error, September has 30 days regardless of year");
        }
        month = Month.OCTOBER;
        if (month.getDays(LEAP_YEAR) == 31 && month.getDays(NON_LEAP) == 31) {
            System.out.println("Success, October has 31 days regardless of year");
        } else {
            System.out.println("Error, October has 31 days regardless of year");
        }
        month = Month.NOVEMBER;
        if (month.getDays(LEAP_YEAR) == 30 && month.getDays(NON_LEAP) == 30) {
            System.out.println("Success, November has 30 days regardless of year");
        } else {
            System.out.println("Error, November has 30 days regardless of year");
        }
        month = Month.DECEMBER;
        if (month.getDays(LEAP_YEAR) == 31 && month.getDays(NON_LEAP) == 31) {
            System.out.println("Success, December has 31 days regardless of year");
        } else {
            System.out.println("Error, December has 31 days regardless of year");
        }

        for (int i = 0; i < months.length; ++i) {
            System.out.println(months[i].name() + " " + months[i].ordinal());
        }

    }

//    public static Month getRandomMonth() {
//        Random random = new Random();
//        Month month[] = Month.values();
//        return month[random.nextInt(month.length)];
//    }

}
