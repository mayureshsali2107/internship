class Animal{
    String Name = "Kiyo";
    void displayinfo(){
        System.out.println("Name = "+Name);
    }

}
class Dog extends Animal{
    void displayinfo(){
        super.displayinfo();
        System.out.println("Dog is Barking");
    }

}
public class Assignment6 {
    public static void main(String[] args) {
        Dog d =new Dog();
        d.displayinfo();
        
    }
    
}
