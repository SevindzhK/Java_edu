package sem6;
import sem6.Laptop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LaptopFilter {

    private List<Laptop> laptops;
    public LaptopFilter(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public List<Laptop> filterByModel(String model){
        List<Laptop> result = new LinkedList<>();
        for (Laptop lap : laptops) {
            if (lap.getModel().equals(model)){
                result.add(lap);
            }
        }
        return result;
    }

    public List<Laptop> filterByBrand(String brand){
        List<Laptop> result = new LinkedList<>();
        for (Laptop lap : laptops) {
            if (lap.getBrand().equals(brand)){
                result.add(lap);
            }
        }
        return result;
    }

    public List<Laptop> filterByScreenDiagonal(double min, double max){
        List<Laptop> result = new LinkedList<>();
        for (Laptop lap : laptops) {
            if (min <= lap.getScreenDiagonal() && lap.getScreenDiagonal() <= max){
                result.add(lap);
            }
        }
        return result;
    }

    public List<Laptop> filterByNumberOfCores(int min, int max){
        List<Laptop> result = new LinkedList<>();
        for (Laptop lap : laptops) {
            if (min <= lap.getNumberOfCores() && lap.getNumberOfCores() <= max){
                result.add(lap);
            }
        }
        return result;
    }

}
