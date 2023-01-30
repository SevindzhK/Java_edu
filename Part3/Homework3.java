package sem3;

import java.util.*;

public class Homework3 {
    public static void main(String[] args) {


        //createRandomArrayList();
        //deleteEvenNumbers(createRandomArrayList());
        //findMaxMinAvg(createRandomArrayList());
        deleterepeat();
    }

    public static List<Integer> createRandomArrayList() {

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(10));
        }
        return numbers;
    }


    private static void findMaxMinAvg(ArrayList<Integer> nums) {

        System.out.println(nums);
        double sum = 0;
        for (int num : nums) {
            sum += num;
        }

        System.out.println("Maximum number is " + Collections.max(nums));
        System.out.println("Minimum number is " + Collections.min(nums));
        System.out.println("Average number is " + (sum / nums.size()));
    }

    private static void deleteEvenNumbers(ArrayList<Integer> nums) {

        System.out.println(nums);
        nums.removeIf(n -> (n % 2 == 0));
        System.out.println(nums);
    }

    private static void deleterepeat() {

        List<String> planets = new ArrayList<>();
        Map<String, Integer> planetCount = new HashMap<>();
        Random rand = new Random();

        String[] solarSystemPlanets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        for (int i = 0; i < 16; i++) {
            int randIndex = rand.nextInt(solarSystemPlanets.length);
            planets.add(solarSystemPlanets[randIndex]);
        }

        planets.add("Pluto");
        planets.add("Pluto");
        planets.add("Pluto");
        planets.add("Pluto");

        planets.sort(Comparator.naturalOrder());
        System.out.println(planets);


        for (String planet : planets) {
            if (planetCount.containsKey(planet)) {
                planetCount.put(planet, planetCount.get(planet) + 1);
            } else {
                planetCount.put(planet, 1);
            }
        }

        for (String planet : planetCount.keySet()) {
            System.out.printf("%s\t%s%n", planet, planetCount.get(planet));
        }

        for (String planet : planetCount.keySet()) {
            planetCount.replace(planet,1);
        }

        for (String planet : planetCount.keySet()) {
            System.out.printf("%s\t%s%n", planet, planetCount.get(planet));
        }

        List<String> planetsOneByOne = new ArrayList<>();
        planetsOneByOne.addAll(planetCount.keySet());
        System.out.println(planetsOneByOne);
    }
}





