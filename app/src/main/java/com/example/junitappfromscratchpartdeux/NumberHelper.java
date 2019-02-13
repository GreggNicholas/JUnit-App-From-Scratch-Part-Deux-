package com.example.junitappfromscratchpartdeux;

import java.util.Arrays;

public class NumberHelper {

    private static NumberHelper ourInstance;

    public static NumberHelper thisInstance() {
        if (ourInstance == null) {
            ourInstance = new NumberHelper();
        }
        return ourInstance;
    }

    private NumberHelper() {
    }

    // For exercise purposes only. We should never use strings to return two different values
//    use boolean instead.
    public String oddOrEven(int input) {
        String even = "even";
        String odd = "odd";
        if (input % 2 == 0) {
            return even;
        }
        return odd;
    }


    public boolean divisibleBy5(int input) {
        return input % 5 == 0;
    }

    public int[] multiplesOfN(int baseNumber, int range) {
        if (range < 0) {
            throw new IllegalArgumentException("Range cannot be less than 0");
        }
        int[] result = new int[range];
        for (int i = 0; i < range; i++) {
            result[i] = baseNumber * (i + 1);
        }
        return result;

    }


    public int stringToNumber(String number) {
        return Integer.parseInt(number);

    }

    public int arraySum(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += 1;
        }
        return sum;
    }

    public int largestNUmber(int[] number) {
        int largest = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }

        }
        return largest;
    }


    public int[] numberSort(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }


}
