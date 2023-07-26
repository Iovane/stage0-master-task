package com.epam.conditions;

import java.util.ArrayList;
import java.util.List;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Wrong month number");
        } else {
            String season = switch (monthNumber) {
                case 12, 1, 2 -> "Winter";
                case 3, 4, 5 -> "Spring";
                case 6, 7, 8 -> "Summer";
                default -> "Autumn";
            };
            System.out.println(season);
        }
    }
}
