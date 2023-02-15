package sem1;

import java.util. *;
public class Main {
    public static void main(String[] args) {

        VendingMachine store = new VendingMachine();

        store.addProduct(new Product("Lays" , 123.45))
                .addProduct(new Product("fanta" , 98.76))
                .addProduct(new Product("fan" , 43.21))
                .addProduct(new Product("fan" , 43.21))
                .addProduct(new Beer("alcoholfree" , 67.89))
                .addProduct(new Beer("notbeer" , 67.89, 99))
                .addProduct(new DiabeticProducts("Lollipop", 110.00, 98.00, 256.00))
                .addProduct(new DiabeticProducts("Marmalade", 250.00, 0.00, 32.40))
                .addProduct(new CursedProducts("milk" , 56.65, 7));


        System.out.println(store);

        System.out.println("searching for ay's");
        System.out.println(store.findProduct("ys"));

        System.out.println("buying Lay's" );
        store.buy("Lays", 123.45);
        System.out.println(store);

        System.out.println("buying fan's" );
        store.buy("fan", 43.21);
        System.out.println(store);
        System.out.println("buying a's" );
        store.buy("fan", 4.1);
        System.out.println(store);
        store.buy("milk", 56.65);
        System.out.println(store);

        System.out.println("--------------------");
        System.out.println("buying lollipop" );
        store.buy("Lollipop", 110.00);
        System.out.println(store);

    }

}
