//Define a class Employee with a method displayInfo() that prints name and ID. Create an object and call the method.
class Employee{
    String name = "John Doe";
    int id=46378;

    void displayInfo(){
        System.out.println("Name ="+name+"\nId = "+id);
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.displayInfo();
    }
}
