package sem1;

public class CursedProducts extends Product {

    private int longevity;
    public CursedProducts(String name, Double price, int longevity) {
        super(name, price);
        this.longevity = longevity;
    }

    @Override
    public String toString(){
        return String.format("%s longevity = %d  " , super.toString(), longevity);
    }

}