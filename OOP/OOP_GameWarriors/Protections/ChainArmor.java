package sem4.Protections;

import sem4.Protection;

public class ChainArmor implements Protection {

    private String armorName;
    private int protectionPoint;

    public ChainArmor(String armorName, int protectionPoint) {
        this.armorName = armorName;
        this.protectionPoint = protectionPoint;
    }

    public int getProtectionPoint() {
        return protectionPoint;
    }

    @Override
    public int protection() {
        return protectionPoint;
    }

    @Override
    public String toString() {
        return "ChainArmor{" +
                "armorName='" + armorName + '\'' +
                ", protectionPoint=" + protectionPoint +
                '}';
    }
}
