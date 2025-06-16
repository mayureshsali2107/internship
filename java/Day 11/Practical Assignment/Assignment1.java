
// Create a Pen class with fields brand and color. Initialize the values and display the pen details using a method.

class pen{
    String brand = "Classmate";
    String colour = "Blue";

    void display(){
        System.out.println("Pen Brand = "+brand+"\nPen Colour = "+colour);
    }

}

public class Assignment1 {
    public static void main(String[] args) {
        pen p =new pen();
        p.display();
    }
    
}
