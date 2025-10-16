class Dog{
    String name;
    byte age;
    boolean vaccinated;
}

public class DogKennel{
public static void main(String[] args){
    Dog dogKennelStep1=new Dog();  
    dogKennelStep1.name="Bruno";
    dogKennelStep1.age=8;
    dogKennelStep1.vaccinated=true;
    System.out.println("Dog name is "+dogKennelStep1.name+" he is "+dogKennelStep1.age+" years old and his vaccination status is: "+dogKennelStep1.vaccinated);
    
    // Creating a 2nd reference variable to understand the concept and working of reference variable.
    Dog dogKennelStep2=dogKennelStep1;
    dogKennelStep2.name="Pow";
    System.out.println(dogKennelStep1.name);//Pow
    System.out.println(dogKennelStep2.name);//Pow
    
    // Creating a 3rd reference variable for object re-assignment and to observe the memory behaviour.
    Dog dogKen=dogKennelStep2;
    dogKen.name="Bolt";
    dogKen.age=4;
    System.out.println(dogKennelStep1.name);//Bolt
    System.out.println(dogKennelStep2.name);//Bolt
    System.out.println(dogKen.name);//Bolt
    }
}
