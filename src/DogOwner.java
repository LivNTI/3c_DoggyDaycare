import java.util.Scanner;

public class DogOwner extends Person {
    //attributes

    private Dog furbaby;

    //constructor
    public DogOwner(Dog myDoggo){
        Scanner s= new Scanner(System.in);
        System.out.println("Hello Owner, what is your name?");
        name= s.nextLine();
        greet();
        furbaby= myDoggo;
    }

    //methods
    public String getName() {
        return name;
    }
}
