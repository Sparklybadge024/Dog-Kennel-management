// encoding: UTF-8

class Dog{
    String name;
    byte age;
    boolean vaccinated;

    void bark(){
      System.out.println(this.name+" is barking.");
    }

    void vaccination(){
      this.vaccinated=true;
      System.out.println("Vaccination status of "+this.name+" is "+this.vaccinated);
    }

    void meet(Dog otherDog){
      System.out.println(this.name+" & "+otherDog.name+" are friends");
      this.name=this.name+" & "+otherDog.name;
      System.out.println(this.name);
    }

    void feed(){
      System.out.println(this.name+" is eating"+ "🦴🦴🦴");
    }

    void walk(){
      System.out.println(this.name+" is walking happily🐕🐕🐕");
    }

    void sleep(){
      System.out.println(this.name+" is sleeping 🐕‍🦺🐕‍🦺🐕‍🦺");
    }
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

    // Added a method bark and using it to see the results.
    dogKen.bark();//Bolt is barking.

    // Added a vaccination method in dog class 
    dogKen.vaccination();

    // Adding 2 separate dog objects
    Dog dog1=new Dog();
    Dog dog2=new Dog();

    dog1.name="Pepper";
    dog1.age=2;
    dog1.vaccinated=false;

    dog2.name="Tucker";
    dog2.age=3;
    dog2.vaccinated=false;
    System.out.println(dog1.name);//Pepper
    System.out.println(dog2.name);//Tucker

    dog1.name="Bryan";
    System.out.println(dog1.name);//Bryan
    System.out.println(dog2.name);//Tucker

    dog1.bark();//Bryan is barking.
    dog2.bark();//Tucker is barking.

    dog1.vaccination();//Vaccination status of Bryan is true
    dog2.vaccination();//Vaccination status of Tucker is true

    // Helping 2 dogs to meet each other and befriend each other
    dog2.meet(dog1);
    // Tucker & Bryan are friends
    // Tucker & Bryan

    // Now we will track dogs activities
    dog1.feed();//Bryan is eating???

    dogKen.walk();//Bolt is walking happily???
    dog2.name="Tucker";
    dog2.sleep();//Tucker is sleeping ?????????

    // I guess Java don't recognise emojis
    }
  }
