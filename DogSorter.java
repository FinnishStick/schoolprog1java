//Elias Mercurio elme7680
import java.util.ArrayList;
import java.util.Comparator;
public class DogSorter{
    private static int nextDog(Comparator<Dog> comparator, ArrayList<Dog> list, int startIndex) {
        if (startIndex < 0 || startIndex >= list.size()) {
            throw new IndexOutOfBoundsException("Invalid start index");
        }

        int minIndex = startIndex;
        for (int i = startIndex + 1; i < list.size(); i++) {
            if (comparator.compare(list.get(i), list.get(minIndex)) < 0) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static void swapDogs(ArrayList<Dog> list, int a, int b) {
        if (a < 0 || a >= list.size() || b < 0 || b >= list.size()) {
            throw new IndexOutOfBoundsException("Invalid index values");
        } else {
            Dog temp = list.get(a);
            list.set(a, list.get(b));
            list.set(b, temp);
        }
    }

    public static int sortDogs(Comparator<Dog> comparator, ArrayList<Dog> list) {
        if (list == null || list.size() <= 1) {
            return 0;
        }

        int swaps = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = nextDog(comparator, list, i);
            if (minIndex != i) {
                swapDogs(list, i, minIndex);
                swaps++;
            }
        }
        return swaps;
    }
    public int compareTo(Dog otherDog, Dog dog){
        String firstDogName = dog.getName();
        String otherDogName = otherDog.getName();
        return firstDogName.compareTo(otherDogName);
    }
}
