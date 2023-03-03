package sem5;

import java.util.*;

public class Homework5_1 {
    public static void main(String[] args) {

        phonebook();
    }

    private static void phonebook() {

        Map<String, LinkedList<String>> phonebook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            phonebook.put(getname(), getnumbers());
            System.out.println("Чтобы создать еще один контакт, нажмите 1, для выхода - нажмите любой символ");
            String command = scanner.nextLine();
            if (!command.equals("1")) {
                break;
            }
        }
        for (String contact : phonebook.keySet()) {
            System.out.printf("%s\t%s%n", contact, phonebook.get(contact));
        }
    }
    private static String getname() {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Введите имя контакта: ");
            String name = scanner.nextLine();

            if (name.isBlank()) {
                System.out.println("Вы ничего не ввели");
            } else {
                return name;
            }
        }
    }
    private static LinkedList getnumbers() {

        LinkedList<String> numbers = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер телефона: ");
            String number = scanner.nextLine();
            if (!isRightNumber(number)) {
                continue;
            }
            numbers.add(number);
            System.out.println("Чтобы добавить еще один номер, нажмите 1. Для выхода - любой другой символ?");
            String command = scanner.nextLine();
            if (!command.equals("1")) {
                break;
            }
        }
        return numbers;
    }
    private static boolean isRightNumber(String number) {

        if (number.isBlank()) {
            System.out.println("Вы ничего не ввели");
            return false;
        }

        String regex = "^\\+?[0-9\\-\\s]*$";
        if (!number.matches(regex)) {
            System.out.println("Номер введен некорректно");
            return false;
        }
        return true;
    }
}