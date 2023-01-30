package sem2;
//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //writerTxt();
        System.out.println(isPalindrom());
    }

    private static boolean isPalindrom() {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        do {
            System.out.println("Введите слово или предложение: ");
            str = scanner.nextLine();
        } while (str.isEmpty());
        scanner.close();

        str = str.toLowerCase().replace(" ", "");
        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        String reverse = sb.toString();
        return str.equals(reverse);
    }

    private static void writerTxt() {
        String str = "TEST";
        int count = 100;
        StringBuilder text = new StringBuilder(str.repeat(count));

        try (PrintWriter pw = new PrintWriter("src/main/resources/lib/hm.txt")) {
            pw.print(text);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}



