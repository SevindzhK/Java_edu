package sem4;

import java.util.Random;

public abstract class BaseHero<W extends Weapon, P extends Protection>  {
    private int health;
    private String name;
    protected W weapon;
    protected P protection;

    protected BaseHero(int health, String name, W weapon, P protection) {
        this.health = health;
        this.name = name;
        this.weapon = weapon;
        this.protection = protection;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public P getProtection() {
        return protection;
    }

    public void setProtection(P protection) {
        this.protection = protection;
    }

    @Override
    public String toString() {
        return "BaseHero{" +
                "health=" + health +
                ", name='" + name + '\'' +
                ", weapon=" + weapon +
                ", protection=" + protection +
                '}';
    }

    public int damageFork(){
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }
    public int protectionFork(){
        Random random = new Random();
        return random.nextInt(protection.protection());
    }

    public boolean hit(BaseHero recepient){
        int damage = damageFork();
        int protection = protectionFork();
        return ! recepient.reduceHealth(damage, protection);
    }
    public boolean reduceHealth(int damage, int protection){
        health = health - (damage - damage * (protection/100));
        return health>0;
    }

}