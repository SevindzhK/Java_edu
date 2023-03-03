package sem2;

public class Dog extends Predator implements Runable, Swimmable{
    public Dog(String nickname) {
        super(nickname);
    }

    public String toString(){
        return "I'm dog. " + super.toString() + ". My speed of run is " + speedOfRun() + ", my speed of swim is " + speedOfSwim();
    }
    public String say(){
        return "gav-gav";
    }

    @Override
    public int speedOfRun() {
        return 20;
    }

    @Override
    public int speedOfSwim() {
        return 7;
    }
}
