class Person{
String Name;
int age;
    public Person() {
        Name ="unknown";
        age =0;
    }
    void display(){
        System.out.println("Name = "+Name);
        System.out.println("Age = "+age);
    }

    
}
public class Assignment2 {
    public static void main(String[] args) {
       Person p =new Person(); 
       p.display();
    }    
}
