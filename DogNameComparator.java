//Elias Mercurio elme7680

import java.util.Comparator;

public class DogNameComparator implements Comparator<Dog> {
    public int compare(Dog dog1, Dog dog2){
        String name1 = dog1.getName();
        String name2 = dog2.getName();

        return name1.compareTo(name2);
    }
}