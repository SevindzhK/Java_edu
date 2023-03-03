package sem1;

public class Beer extends Product {
    private int alcohol = 0;

    public Beer(String name, Double price) {
        super(name, price);
    }

    public Beer(String name, Double price, int alcohol) {
        this(name, price);
        this.alcohol = alcohol;
    }

    @Override
    public String toString(){
        return String.format("%s alcohol = %d  " , super.toString(), alcohol);
    }

}
