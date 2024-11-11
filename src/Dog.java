public class Dog {
    //attributes
    private String name;
    private DogOwner human;
    private int happiness=5;

    //constructor
    public Dog(String inName){
        name= inName;
        System.out.println("Hello " +name);
        human= new DogOwner(this);
    }

    //methods
    public void getInfo(){
        System.out.println(name + " has owner "+ human.getName());
    }

    public void play(){

    }
}
