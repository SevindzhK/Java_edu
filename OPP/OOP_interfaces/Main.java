package sem2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoopark = new Zoo();
        zoopark.addAnimals(List.of(new Cat("Barsik"), new Dog("Sharik"), new Rabbit("Whik"), new Cow("Murka"), new Duck("Krya"), new Sparrow("Chika"), new Whale("Villy")));
        for (Sayable item : zoopark.getSayable()) {
            System.out.println(item.say());
        }
        System.out.println("---------------------------------------------");
        System.out.println("Представители животных, способные бегать: ");
        for (Runable item : zoopark.getRunable()){
            System.out.println(item);
        }
        System.out.println("---------------------------------------------");
        System.out.println("Представители животных, способные летать: ");
        for (Flyable item : zoopark.getFlyable()){
            System.out.println(item);
        }
        System.out.println("---------------------------------------------");
        System.out.println("Представители животных, способные плавать: ");
        for (Swimmable item : zoopark.getSwimmable()){
            System.out.println(item);
        }

        System.out.println("---------------------------------------------");
        System.out.println("Победитель в номинации 'БЕГ' - " + zoopark.getWinner());

        System.out.println("---------------------------------------------");
        System.out.println("Победитель в номинации 'ПОЛЕТ' - " + zoopark.getWinnerFly());

        System.out.println("---------------------------------------------");
        System.out.println("Победитель в номинации 'ПЛАВАНИЕ' - " + zoopark.getWinnerSwim());
    }
}
