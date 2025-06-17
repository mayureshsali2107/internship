//Write a program where a parent class Shape has a method area(), and subclasses Circle and Rectangle override it to calculate their respective areas.
class Shape{
void area(){

}

}

class Circle extends Shape{
int r = 2;
void area(){
    System.out.println("Area of Circle = "+3.14*r*r);
}
}

class Rectangle extends Shape{
    int l =9,b=48;
    void area(){
    System.out.println("Area of Rectangle = "+l*b);
}}
public class Assignment2 {
    public static void main(String[] args) {
        Circle c= new Circle();
        c.area();
        Rectangle r= new Rectangle();
        r.area();

        
    }
    
}
