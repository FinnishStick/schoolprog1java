//Elias Mercurio elme7680
import java.util.ArrayList;
import java.util.Comparator;
public class DogCollection {
    private ArrayList<Dog> dogArrayList = new ArrayList<>();

    public boolean addDog(Dog dog) {
        if (!dogArrayList.contains(dog)) {
            dogArrayList.add(dog);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeDog(Dog dog) {
        if (dogArrayList.contains(dog)) {
            dogArrayList.remove(dog);
            return true;
        } else {
            return false;
        }
    }

    public boolean containsDog(String dogName) {
        for (Dog dog : dogArrayList) {
            if (dog.getName().equals(dogName)) {
                return true;
            }
        }
        return false;
    }

    public Dog getDog(String dogName) {
        for (Dog dog : dogArrayList) {
            if (dog.getName().equals(dogName)) {
                return dog;
            }
        }
        return null;
    }

    public static ArrayList<Dog> getDogs(Comparator<Dog> comparator, ArrayList<Dog> list) {
        DogSorter.sortDogs(comparator, list);
        return new ArrayList<>(list);
    }

    public static ArrayList<Dog> getDogsWithTail(Comparator<Dog> tailNameComparator, ArrayList<Dog> list, double minTailLength) {
        ArrayList<Dog> filteredAndSortedDogs = new ArrayList<>();

        for (Dog dog : list) {
            if (dog.getTailLength() >= minTailLength) {
                filteredAndSortedDogs.add(dog);
            }
        }

        DogSorter.sortDogs(tailNameComparator, filteredAndSortedDogs);

        return filteredAndSortedDogs;
    }
}
