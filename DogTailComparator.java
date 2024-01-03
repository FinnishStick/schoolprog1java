//Elias Mercurio elme7680

import java.util.Comparator;

public class DogTailComparator implements Comparator<Dog> {
    public int compare(Dog dog1, Dog dog2) {

        double tailLength1 = dog1.getTailLength();
        double tailLength2 = dog2.getTailLength();

        return Double.compare(tailLength1, tailLength2);
    }
}

