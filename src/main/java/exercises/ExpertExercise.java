package exercises;

import java.util.Arrays;

public class ExpertExercise {

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static int[] sortArray() {
        int[] numbers = {6, 2, 8, 3, 9, 6};

        Arrays.sort(numbers);

        return numbers;
    }

    public static String[] splitStringOnComma(String s) {
        return s.split(",");
    }

    public static int checkSum(int number) {
        if (number == 0) {
            return 0;
        }

        int lastDigit = number % 10;

        return lastDigit + checkSum(number / 10);
    }

    public static String decimalToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLiterals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNumber = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                romanNumber.append(romanLiterals[i]);
            }
        }

        return romanNumber.toString();
    }
}
