package sem5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework5_2 {
    public static void main(String[] args) {
        popularName();
    }

    private static void popularName() {
        String[] employees = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};
        Map<String, Integer> names = new HashMap<>();

        for (String person : employees) {
            person = person.substring(0, person.indexOf(" "));
            if (names.containsKey(person)) {
                names.put(person, names.get(person) + 1);
            } else {
                names.put(person, 1);
            }
        }
        names.entrySet().removeIf(entry -> entry.getValue() == 1);

        names.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}




