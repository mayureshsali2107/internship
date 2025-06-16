//Create a class Animal with a method eat(). Create a subclass Dog that inherits from Animal and adds a method bark(). Call both methods from the Dog object.
class Animal{
    void eat(){
        System.out.println("Animal Is Eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is Barking");
    }
}

public class Assignment5 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.bark();
        
    }
    
}
