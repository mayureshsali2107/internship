class Employee{
    int id;
    double salary;
    String name;

    public Employee(int id,double salary,String name) {
        this.id=id;
        this.name=name;
        this.salary=salary;
        
        System.out.println("ID = "+id+"\nSalary = "+salary+"\nName = "+name);
    }

    
}
public class Assignment1 {
    public static void main(String[] args) {
        Employee e =new Employee(312921, 3212143, "Mayuresh Sali");
    }
    
}
