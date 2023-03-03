package sem4.Protections;

import sem4.Protection;

public class Shield implements Protection {

    private String protectionName;
    private int protectionPoint;

    public Shield(String protectionName, int protectionPoint) {
        this.protectionName = protectionName;
        this.protectionPoint = protectionPoint;
    }

    @Override
    public int protection() {
        return protectionPoint;
    }

    @Override
    public String toString() {
        return "Shield{" +
                "protectionName='" + protectionName + '\'' +
                ", protectionPoint=" + protectionPoint +
                '}';
    }
}
