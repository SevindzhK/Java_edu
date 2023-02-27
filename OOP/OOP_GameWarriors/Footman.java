package sem4;

import sem4.Protections.Shield;
import sem4.Weapons.Melee;

public class Footman extends BaseHero<Melee, Shield>{

    public Footman(int health, String name, Melee weapon, Shield shield) {
        super(health, name, weapon, shield);
    }

    @Override
    public String toString() {
        return "Footman{ " + super.toString() + " }";
    }
}
