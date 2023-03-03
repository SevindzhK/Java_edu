package sem2;

public class Rabbit extends Herbivores implements Runable {
    public Rabbit (String nickname) {
        super(nickname);
    }

    public String toString(){
        return "I'm rabbit. " + super.toString() + ". My speed of run is " + speedOfRun();
    }
    public String say(){
        return "fur-fur";
    }

    @Override
    public int speedOfRun() {
        return 30;
    }
}
