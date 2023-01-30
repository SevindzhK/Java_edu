package Part1;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        findMinMax();
        System.out.println(isLeapYear() ? "Високосный год" : "Невисокосный год");
//        transposition();

    }

    private static void transposition() {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(4);
        }
        System.out.println(Arrays.toString(array));

        int left = 0;
        int right = array.length - 1;
        int value = 3;
        while (left < right) {
            if (array[left] == value && array[right] != value) {
                array[left] = array[right];
                array[right] = value;
                left++;
                right--;
            } else if (array[left] != value) {
                left++;
            } else if (array[left] == value && array[right] == value) {
                right--;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static int getYear() {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите год: ");
                int year = Integer.parseInt(scanner.nextLine());
                scanner.close();
                return year;
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат");
            }
        }
    }

    private static boolean isLeapYear() {

        int year = getYear();

        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }


    private static void findMinMax() {
        int[] array = new int[50];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        int minValue = array[0];
        int maxValue = array[0];

        for (int num : array) {
            if (num < minValue) {
                minValue = num;
            }
            if (num > maxValue) {
                maxValue = num;
            }
        }

        //System.out.println(Arrays.toString(array));
        System.out.println("Min value: " + minValue);
        System.out.println("Max value: " + maxValue);
    }
}
