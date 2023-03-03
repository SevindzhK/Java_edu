package sem4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends BaseHero> implements Iterable<T> {
    List<T> warriors = new ArrayList<>();

    public void add(T warrior) {
        warriors.add(warrior);
    }

    public T get(int index) {
        return warriors.get(index);
    }

    @Override
    public Iterator<T> iterator() {
        return warriors.iterator();
    }

    public int getTeamHealth() {
        int teamHealth = 0;
        for (T hero : warriors) {

            teamHealth += hero.getHealth();
        }
        return teamHealth;
    }

    public int getMaxRange() {

        int maxRange = 0;
        for (T hero : warriors) {
            if (hero instanceof Archer) {
                Archer archer = (Archer) hero;
                if (maxRange < archer.range()) {
                    maxRange = archer.range();
                }
            }
        }
        return maxRange;
    }

    public int getSumDamage() {

        int sumDamage = 0;

        for (T hero : warriors) {
            sumDamage += hero.getWeapon().damage();
        }

        return sumDamage;
    }

    public int getMinProtection() {

        int minProtection = warriors.get(0).getProtection().protection();

        for (T hero : warriors) {
            int p = hero.getProtection().protection();
            if (minProtection > p) {
                minProtection = p;
            }
        }
        return minProtection;
    }
}
