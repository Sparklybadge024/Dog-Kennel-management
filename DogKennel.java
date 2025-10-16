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
    }
}
