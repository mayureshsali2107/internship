//Create an abstract class Vehicle with an abstract method start(). Create two subclasses Car and Bike that implement start() differently.
abstract class Vehicle{
    abstract void start();

}
class car extends Vehicle{
   public void start(){
        System.out.println("Car is Starting");
    }

}

class Bike extends Vehicle {

   public void start(){
        System.out.println("Bike is starting");
    }
}
public class Assignment3 {
  public static void main(String[] args) {
    car c= new car();
    c.start();
    Bike b=new Bike();
    b.start();
  }  
}
