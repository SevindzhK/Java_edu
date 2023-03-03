package sem2;

public class Whale extends Predator implements Swimmable{

    public Whale(String nickname) {
        super(nickname);
    }

    public String toString(){
        return "I'm whale. " + super.toString() + ". My speed of swim is " + speedOfSwim();
    }

    @Override
    public String say() {
        return "fyr-fyr";
    }

    @Override
    public int speedOfSwim() {
        return 50;
    }
}
