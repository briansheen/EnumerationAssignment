package com.example;

/**
 * Created by bsheen on 4/12/17.
 */
public enum Month {
    JANUARY(31), FEBRUARY(28),MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);

    private int days;

    Month(int days) {
        this.days = days;
    }

    public int getDays(int year) {
        // if the month is feb then 29 28
        // else return days
        if(name().equals("FEBRUARY")) {
            if (((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) {
                return days+1;
            } else {
                return days;
            }
        } else {
            return days;
        }
    }

    @Override
    public String toString() {
        return "Month{" +
                "name= " + name() +
                " days=" + days +
                '}';
    }
}
