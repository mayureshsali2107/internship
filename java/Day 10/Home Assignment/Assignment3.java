//create a Shape base class. Derive Circle and Rectangle classes from it. Each subclass should have its own method to calculate and print area.

class Shape{
    String colour = "red";
}
class Circle extends Shape{
int radius=7;
void area(){
    System.out.println("Area Of circle = "+3.14*radius*radius);
}

}
class Rectangle extends Shape{
    int l = 4,b=5;
    void area(){
        System.out.println("Area Of rectangle = "+l*b);
    }

}


public class Assignment3 {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.area();
        Rectangle r=new Rectangle();
        r.area();
    }
    
}
