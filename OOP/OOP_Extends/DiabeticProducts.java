package sem1;

public class DiabeticProducts extends Product{

    private double carbohydrate;
    private double calories;
    public DiabeticProducts(String name, Double price, double carbohydrate, double calories) {
        super(name, price);
        this.carbohydrate = carbohydrate;
        this.calories = calories;
    }

    @Override
    public String toString(){
        return String.format("%s, carbohydrate/100 gr. = %2.2f, calories/100 gr. = %2.2f" , super.toString(), carbohydrate, calories);
    }
}
