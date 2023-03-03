package sem2;

public class Duck extends Herbivores implements Flyable, Runable, Swimmable{
    public Duck(String nickname) {
        super(nickname);

    }

    @Override
    public int speedOfFly() {
        return 50;
    }
    public String toString(){
        return "I'm duck. " + super.toString() + ". My speed of run is " + speedOfRun() + ", speed of fly " + speedOfFly() + " and speed of swim is " + speedOfSwim();
    }
    @Override
    public int speedOfRun() {
        return 10;
    }

    @Override
    public String say() {
        return "krya-krya";
    }

    @Override
    public int speedOfSwim() {
        return 5;
    }
}
