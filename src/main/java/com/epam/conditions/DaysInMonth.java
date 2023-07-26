package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        int daysInMonth;

        if (year > 0 && month <= 12) {
            if (year % 4 == 0 && year % 100 != 0) {
                daysInMonth = switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12 -> 31;
                    case 4, 6, 9, 11 -> 30;
                    default -> 29;
                };

            } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                daysInMonth = switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12 -> 31;
                    case 4, 6, 9, 11 -> 30;
                    default -> 29;
                };

            } else {
                daysInMonth = switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12 -> 31;
                    case 4, 6, 9, 11 -> 30;
                    default -> 28;
                };
            }
            System.out.println(daysInMonth);

        } else System.out.println("invalid date");

    }


    public static void main(String[] args) {
        new DaysInMonth().printDays(2001,2);
    }
}
