package sem4;

import sem4.Protections.ChainArmor;
import sem4.Weapons.Ranged;

public class Archer extends BaseHero<Ranged, ChainArmor>{
    public Archer(int health, String name, Ranged ranged, ChainArmor armor) {
        super(health, name, ranged, armor);
    }

    public int range(){
        return weapon.getRange();
    }

    @Override
    public String toString() {
        return "Archer{ " +  "weapon= " + weapon + " " + super.toString() + "}";
    }
}
