//Elias Mercurio elme7680
class Dog {
    public static String dogName;
    public String dogBreed;
    public int dogAge;
    private int dogWeight;
    private double tailLength;
    private String[] dogBreedArray = {"tax", "dachshund", "mäyräkoira", "teckel"};

    public Dog(String name, String breed, int age, int weight) {
        if (age > 0) {
            dogAge = age;
        } else {
            throw new IllegalArgumentException("Age must be a positive integer.");
        }

        if (weight > 0) {
            dogWeight = weight;
        } else {
            throw new IllegalArgumentException("Weight must be a positive integer.");
        }

        dogName = name.toUpperCase();
        dogBreed = breed.toUpperCase();

        if (containsString(dogBreedArray, dogBreed)) {
            tailLength = 3.7;
        } else {
            tailLength =  (double) (dogWeight * dogAge) / 10;
        }
    }

    public String getName() {
        return dogName;
    }

    public String getBreed() {
        return dogBreed;
    }

    public int getAge() {
        return dogAge;
    }

    public int getWeight() {
        return dogWeight;
    }
    public double getTailLength() {
        if (containsString(dogBreedArray, dogBreed)) {
            tailLength = 3.7;
        } else {
            tailLength =  (double) (dogWeight * dogAge) / 10;
        }
        return tailLength;
    }
    public int updateAge(int newAge) {
        if (Integer.MAX_VALUE - newAge >= dogAge & newAge > 0) {
            dogAge += newAge;
            System.out.println("Ny ålder har registrerats");
        } else {
            System.out.println("Hunden kan inte bli yngre");
        }
        getTailLength();
        return dogAge;
    }

    private static boolean containsString(String[] array, String target) {
        for (String element : array) {
            if (element.equalsIgnoreCase(target)) {
                return true;
            }
        }
        return false;
    }
    public String toString() {
        return "Dog{name='" + dogName + "', breed='" + dogBreed + "', age=" + dogAge + ", weight=" + dogWeight + ", tailLength=" + tailLength + '}';
    }
}
