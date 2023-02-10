package sem2;
//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        writerTxt();
        //System.out.println(isPalindrom());
        //System.out.println(isPalindrom2());
    }

    private static boolean isPalindrom() {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        do {
            System.out.println("Введите слово или предложение: ");
            str = scanner.nextLine();
        } while (str.isBlank());
        scanner.close();

        str = str.toLowerCase().replace(" ", "");
        StringBuilder reverse = new StringBuilder(str).reverse();

        return str.equals(reverse.toString());
    }

    private static boolean isPalindrom2() {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        do {
            System.out.println("Введите слово или предложение: ");
            str = scanner.nextLine();
        } while (str.isBlank());
        scanner.close();

        str = str.toLowerCase().replace(" ", "");

        for (int i = 0; i <= str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 -i)) {
                return false;
            }
        }

        return true;
    }


    private static void writerTxt() {
        String str = "TEST";
        int count = 100;
        final String PATH = "src/main/resources/lib/hm.txt";

        try (PrintWriter pw = new PrintWriter(PATH)) {
            pw.print(str.repeat(count));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            throw new RuntimeException(e);
        }
    }
}



