package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        char[] nums = String.valueOf(number).toCharArray();
        int sum = 0;

        for (char num : nums){
            sum += Character.getNumericValue(num);
        }
        System.out.println(sum);
    }
}
