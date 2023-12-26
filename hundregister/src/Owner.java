import java.util.Scanner;

public class Owner {
    String ownerName;
    public Owner() {
        Scanner input = new Scanner(System.in);
        System.out.print("Namn på ägare:");
        String Name = input.nextLine();;
        String ownerName = Name.toUpperCase();
    }
    public String toString(){
        return null;
    }
    public String getName(){
        return ownerName;
    }

}