//Elias Mercurio elme7680

import java.util.Comparator;

public class DogTailNameComparator implements Comparator<Dog> {
    public int compare(Dog dog1, Dog dog2) {

        double tailLength1 = dog1.getTailLength();
        double tailLength2 = dog2.getTailLength();

        int tailLengthComparison = Double.compare(tailLength1, tailLength2);

        if (tailLengthComparison != 0) {
            return tailLengthComparison;
        }

        String name1 = dog1.getName();
        String name2 = dog2.getName();

        return name1.compareTo(name2);
    }
}