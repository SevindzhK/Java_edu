package Part1;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //findMinMax();
        //leapYear();
        transposition();

    }

    private static void transposition() {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(4);
        }
        System.out.println(Arrays.toString(array));

        int l = 0;
        int r = array.length - 1;
        while (l <= r) {
            if (array[l] == 3 && array[r] != 3) {
                int temp = array[l];
                array[l] = array[r];
                array[r] = temp;
                l++;
                r--;
            } else if (array[l] != 3) {
                l++;
            } else if (array[l] == 3 && array[r] ==3) {
                r--;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void leapYear() {

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите год: ");
                int year = Integer.parseInt(scanner.nextLine());
                scanner.close();
                boolean isLeapYear;
                isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
                System.out.println(isLeapYear);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат");
            }
        }
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
            if (minValue < num) {
                minValue = num;
            }
            if (maxValue > num) {
                maxValue = num;
            }
        }

        //System.out.println(Arrays.toString(array));
        System.out.println("Min value: " + minValue);
        System.out.println("Max value: " + maxValue);
    }
}
