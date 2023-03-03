package sem2;

public class Sparrow extends Herbivores implements Flyable{
    public Sparrow(String nickname) {
        super(nickname);

    }

    @Override
    public int speedOfFly() {
        return 40;
    }
    public String toString(){
        return "I'm sparrow. " + super.toString() + ". My speed of fly is " + speedOfFly();
    }


    @Override
    public String say() {
        return "chik-chirik";
    }
}
