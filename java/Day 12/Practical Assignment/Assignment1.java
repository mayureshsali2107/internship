//Create a class Animal with a method makeSound(). Override it in subclasses Dog and Cat to print different sounds.
class Animal{
    void makeSound(){
        System.out.println("Animal Is Eating");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog is Barking");
    }
}
class cat extends Animal{
    void makeSound(){
        System.out.println("Cat is Makinsound");
    }
}
public class Assignment1 {
  public static void main(String[] args) {
    Dog d =new Dog();
    d.makeSound();
    cat c= new cat();
    c.makeSound();
  }  
}
