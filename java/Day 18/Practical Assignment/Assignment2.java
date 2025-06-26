class Employee{
    int id;
    double salary;
    String name;

    public Employee(int id) {
        this.id=id;
        System.out.println("ID = "+id);
    }
    

    public Employee(double salary,String name) {
        
        this.name=name;
        this.salary=salary;
        
        System.out.println("Salary = "+salary+"\nName = "+name);
    }

    
}
public class Assignment2 {
    public static void main(String[] args) {
        Employee e = new Employee(21321);
        Employee e1 =new Employee(3212312, "Mayuresh Sali");
    }
    
}
