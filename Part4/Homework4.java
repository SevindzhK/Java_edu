package sem4;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Homework4 {
    public static void main(String[] args) {
        stack();
    }

    private static void stack() {

        Scanner in = new Scanner(System.in);
        Stack<String> stack = new Stack<>();


        while (true) {
            System.out.println();
            System.out.println("Введите строку для запоминания, print - для вывода  всех данных на экран, " + System.lineSeparator() + "revert - для удаления последней строки, exit - для выхода из программы");
            String inputString = in.nextLine();

            if (inputString.isEmpty()) {
                System.out.println("Строка не должна быть пустой");
                continue;
            } else if (inputString.equalsIgnoreCase("print")) {
                if (stack.isEmpty()) {
                    System.out.println("Нет данных для вывода на экран");
                    continue;
                } else {
                    while (!stack.isEmpty()) {
                        System.out.println(stack.pop());
                    }
                }
            } else if (inputString.equalsIgnoreCase("revert")) {
                if (stack.isEmpty()) {
                    System.out.println("Нет данных для удаления");
                    continue;
                } else {
                    System.out.println("Вы удалили последнюю введенную строку " + stack.pop());
                }
            } else if (inputString.equalsIgnoreCase("exit")) {
                System.exit(0);
                break;
            } else {
                stack.push(inputString);
            }
        }
    }
}
