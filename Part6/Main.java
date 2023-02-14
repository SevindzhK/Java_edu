package sem6;
import sem6.Laptop;
import sem6.LaptopFilter;

import java.util.*;

class Menu {
    public static void showResult(List<Laptop> laps){
        for (Laptop lap : laps) {
            System.out.println(lap);
            System.out.println("-------------------------------------------------------------------------");
        }
        System.out.println("Всего найдено: " + laps.size());
    }

    public static double[] readScreenDiagonal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите MIN размер экрана: ");
        double min = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите MAX размер экрана: ");
        double max = Double.parseDouble(scanner.nextLine());
        double[] array = new double[] {min, max};
        return array;
    }

    public static int[] readCores() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите MIN количество ядер: ");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите MAX количество ядер: ");
        int max = Integer.parseInt(scanner.nextLine());
        int[] array = new int[] {min, max};
        return array;
    }

    public static int[] readRAM() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите MIN объем памяти: ");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите MAX объем памяти: ");
        int max = Integer.parseInt(scanner.nextLine());
        int[] array = new int[] {min, max};
        return array;
    }
    public static String readModel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название модели: ");
        String model = scanner.nextLine();

        return model;
    }

    public static String readBrand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название бренда: ");
        String brand = scanner.nextLine();

        return brand;
    }

    public static String readProcessor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите производителя процессора: ");
        String processor = scanner.nextLine();

        return processor;
    }

    public static String readColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цвет ноутбука: ");
        String color = scanner.nextLine();

        return color;
    }
    public static void start(List<Laptop> stock) {

        Map<Integer, String> menu = new HashMap<>();
        menu.put(1, "по модели");
        menu.put(2, "по бренду");
        menu.put(3, "по количеству ядер");
        menu.put(4, "по длине диагонали");
        menu.put(5, "по производителю процессора");
        menu.put(6, "по объему оперативной памяти");
        menu.put(7, "по цвету ноутбука");

        LaptopFilter filter = new LaptopFilter(stock);

        System.out.println("Введите цифру, соответствующую необходимому критерию: ");
        for (Integer command : menu.keySet()) {
            System.out.printf("%d - %s" + System.lineSeparator(), command, menu.get(command));
        }

        Scanner scanner = new Scanner(System.in);
        try {
            int command = Integer.parseInt(scanner.nextLine());
            switch (command){
                case 1: showResult(filter.filterByModel(readModel()));
                    break;
                case 2: showResult(filter.filterByBrand(readBrand()));
                    break;
                case 3: showResult(filter.filterByNumberOfCores(readCores()));
                    break;
                case 4: showResult(filter.filterByScreenDiagonal(readScreenDiagonal()));
                    break;
                case 5: showResult(filter.filterByProcessor(readProcessor()));
                    break;
                case 6: showResult(filter.filterByRAM(readRAM()));
                    break;
                case 7: showResult(filter.filterByColor(readColor()));

                default:
                    System.out.println("Некорректный ввод");
                    break;
            }
        } catch (NumberFormatException e){
            System.out.println("Некорректный ввод");
        }
    }

}

public class Main {
    public static void main(String[] args) {

        List<Laptop> stock = new ArrayList<>();

        stock.add(new Laptop("HYM-W56","Honor", 6, 16.1, "AMD", 16, "grey"));
        stock.add(new Laptop("FX506HCB", "ASUS", 6, 15.6,"Intel", 8, "black"));
        stock.add(new Laptop("M1/8/256", "Apple", 8, 13.3, "Apple", 8, "grey"));
        stock.add(new Laptop("JYU4525RU","Xiaomi", 2, 16.1, "Intel", 8, "black"));
        stock.add(new Laptop("JYU4526RU","Xiaomi", 2, 16.1, "Intel", 8, "black"));
        stock.add(new Laptop("HDE-W36","Honor", 8, 14.1, "AMD", 12, "red"));
        stock.add(new Laptop("M1/16/256", "Apple", 16, 17.8, "Apple", 16, "white"));
        stock.add(new Laptop("82FG0165US", "Lenovo", 4, 15.6, "Intel", 8, "black"));
        stock.add(new Laptop("RLEF-Xi5", "HUAWEI", 12, 16.0, "Intel", 16, "white"));
        stock.add(new Laptop("JYU4532RU","Xiaomi", 2, 15.6, "Intel", 8, "grey"));

        Menu.start(stock);
    }

}



