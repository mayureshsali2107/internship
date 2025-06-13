
import java.util.Scanner;



class student{
    String name = "Mayuresh Sali";
    int age = 18;

    void print(){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
    }
}
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        student s1 =new student();
        s1.print();
    }

    
}
