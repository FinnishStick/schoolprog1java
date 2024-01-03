//Elias Mercurio elme7680
import java.util.Comparator;

class Owner implements Comparable<Owner>{
    private String ownerName;
    public Owner(String name) {
        this.ownerName = name.toUpperCase();
    }
    public String toString() {
        return ownerName;
    }
    public String getName() {
        return ownerName;
    }
    public int compareTo(Owner otherOwner) {
        return this.ownerName.compareTo(otherOwner.getName());
    }
}
