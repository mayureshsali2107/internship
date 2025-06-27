class Student{
    int id ;
    String name;
    int M1,M2;

    public Student(int id,String name,int M1,int M2) {
        this.id=id;
        this.name=name;
        int percent = ((M1+M2)*100)/200;
        
        System.out.println("id = "+id+"\nName = "+name+"\nPercent = "+percent);
    }
    
}
public class Assignment3 {
    public static void main(String[] args) {
        
        Student s =new Student(232, "Mayuresh Sali", 97,90);
    }    
}
