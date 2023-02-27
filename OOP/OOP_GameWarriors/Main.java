package sem4;

import sem4.Protections.ChainArmor;
import sem4.Protections.Shield;
import sem4.Weapons.Melee;
import sem4.Weapons.Ranged;


public class Main {
    public static void main(String[] args) {
        Team<Footman> squadF = new Team<>();
        squadF.add(new Footman(55, "Joe", new Melee("spear", 15), new Shield("Steel shield", 30)));
        squadF.add(new Footman(55, "Chloe", new Melee("sword", 10), new Shield("Copper shield", 15)));
        squadF.add(new Footman(55, "Noe", new Melee("axe", 20), new Shield("Steel shield", 30)));

        for (Footman item : squadF){
            System.out.println(item);
        }
        System.out.println("Здоровье команды: " + squadF.getTeamHealth());
        System.out.println("Max дальность поражения: " + squadF.getMaxRange());
        System.out.println("Урон от команды F: " + squadF.getSumDamage());
        System.out.println("Минимальная защита в команде: " + squadF.getMinProtection());

        System.out.println("------------------------------------------------");


        Team<BaseHero> squadA = new Team<>();
        squadA.add(new Archer(15, "John", new Ranged("bow", 5, 50), new ChainArmor("Gold armor", 15)));
        squadA.add(new Archer(15, "Jonathan", new Ranged("crossbow", 15, 25), new ChainArmor("Silver armor", 12)));
        squadA.add(new Footman(55, "Carl", new Melee("sword", 10), new Shield("Copper shield", 15)));
        squadA.add(new Footman(55, "Martin", new Melee("axe", 20), new Shield("Steel shield", 30)));

        for (BaseHero item : squadA){
            System.out.println(item);
        }
        System.out.println("Здоровье команды: " + squadA.getTeamHealth());
        System.out.println("Max дальность поражения: " + squadA.getMaxRange());
        System.out.println("Урон от команды A: " + squadA.getSumDamage());
        System.out.println("Минимальная защита в команде: " + squadA.getMinProtection());

        System.out.println("");
        System.out.println("-----------------Сражение-------------------");
        System.out.println("");

        Footman footman1 = new Footman(77 , "Mark" , new Melee("book"  , 30), new Shield("Steel shield", 30));
        Footman footman2 = new Footman(66 , "Adam" , new Melee("weights"  , 45), new Shield("Copper shield", 15));
        while (footman1.getHealth()>0 && footman2.getHealth()> 0){  // пока оба живыб продолжают наносить удары
            footman1.hit(footman2);
            System.out.println(footman2);
            System.out.println("~~~~~~~~");
            footman2.hit(footman1);
            System.out.println(footman1);
            System.out.println("____________");
        }
        if (footman1.getHealth()>0){
            System.out.println(footman1 + " is Winner");
        }
        else {
            System.out.println(footman2 + " is Winner");
        }
    }
}