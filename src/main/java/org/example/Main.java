package org.example;

import java.util.Arrays;

public class Main {

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 11;
        int b = 15;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers() {
        int a = 50;
        int b = 80;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }

    public static int[] invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 0 ? 1 : 0;
        }
        return array;
    }


    public static int[] createSequenceArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static int[] multiplyLessThanSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        return array;
    }

    public static int[][] fillDiagonals(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - 1 - i] = 1;
        }
        return matrix;
    }

    public static int[] createFilledArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }

    public static void main(String[] args) {
        // Test method 1
        printThreeWords();

        // Test method 2
        checkSumSign();

        // Test method 3
        printColor();

        // Test method 4
        compareNumbers();

        // Test method 5
        System.out.println(isSumInRange(5, 5));  // true
        System.out.println(isSumInRange(1, 2));   // false

        // Test method 6
        printNumberSign(5);
        printNumberSign(-5);
        printNumberSign(0);

        // Test method 7
        System.out.println(isNegative(5));    // false
        System.out.println(isNegative(-5));  // true

        // Test method 8
        printStringMultipleTimes("Test", 3);

        // Test method 9
        System.out.println(isLeapYear(2000)); // true
        System.out.println(isLeapYear(1900)); // false

        // Test method 10
        int[] array10 = {1, 1, 0, 0, 1};
        System.out.println(Arrays.toString(invertArray(array10)));

        // Test method 11
        System.out.println(Arrays.toString(createSequenceArray()));

        // Test method 12
        int[] array12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(multiplyLessThanSix(array12)));

        // Test method 13
        int[][] matrix = fillDiagonals(5);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        // Test method 14
        System.out.println(Arrays.toString(createFilledArray(5, 10)));
    }
}
