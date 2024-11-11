import java.util.ArrayList;

public class Daycare {
    private ArrayList<Dog> dogs = new ArrayList<>();
    private ArrayList<DogOwner> owners = new ArrayList<>();

    //constructor
    public Daycare(){
        Employee worker= new Employee("Hanna");
        worker.greet();


        addADog();

        for(Dog doggo : dogs){
            doggo.getInfo();

        }

        /*
        for(int i= 0; i< dogs.size(); i++){
            Dog mydog= dogs.get(i);
            mydog.getInfo();
        }
         */
    }

    //methods
    public void addADog(){
        dogs.add(new Dog("Spot"));
        dogs.add(new Dog("Koto"));
        dogs.add(new Dog("Vofflan"));
        dogs.add(new Dog("Clifford"));


    }
}
