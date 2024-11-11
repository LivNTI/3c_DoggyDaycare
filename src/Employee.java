public class Employee extends Person {
    //attribute
    private int salary= 0;

    //constructor
    public Employee(String inName){
        name = inName;
    }

    /*
    public void greet(){
        System.out.println("Hello, I work at the daycare and my name is "+ name);

    }

     */

    public void getARaise(int amount){
        salary += amount;
    }
}
