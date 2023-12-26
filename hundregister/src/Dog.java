import java.util.Scanner;

public class Dog {
    String dogName;
    String dogBreed;
    int dogAge;
    int dogWeight;
    double tailLength;
    String[] dogBreedArray = {"tax", "dachshund", "mäyräkoira", "teckel"};
    public Dog() {
        Scanner input = new Scanner(System.in);

        System.out.print("Namn på hund:");
        String name = input.nextLine();
        final String dogName = name.toUpperCase();

        System.out.print("Ras på hund:");
        String breed = input.nextLine();
        final String dogBreed = breed.toUpperCase();

        System.out.print("Ras på hund:");
        int dogAge = input.nextInt();

        System.out.print("Vikt på hund:");
        int dogWeight = input.nextInt();

        if (containsString(dogBreedArray, dogBreed) ) {
            tailLength = 3.7;
        }else{
            tailLength = dogAge * ((double) dogWeight /10);
        }

        input.close();
    }
    private static boolean containsString(String[] array, String target) {
        for (String element : array) {
            if (element.equals(target)) {
                return true;
            }
        }
        return false;
    }
    public String getName(){
        return dogName;
    }
    public String getBreed(){
        return dogBreed;
    }
}
