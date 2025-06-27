class Employee{
int id;
String name;
    public Employee(int id,String name) {
        this.id=id;
        this.name=name;
    }

    public Employee(Employee e) {
        this(e.id,e.name);
        System.out.println("Id = "+id);
        System.out.println("Name = "+name);
    }
    
    
}
public class Assignment4 {
    public static void main(String[] args) {
        Employee e = new Employee(3276, "Mayuresh Sali");
        Employee e1=new Employee(e);
    }    
}
