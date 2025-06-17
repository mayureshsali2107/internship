//Create a class Student with private fields name and age. Provide getter and setter methods to access and modify the values.
class Student{
    private String Name;
    private int age;

    void setdata(String Name,int age){
        this.Name=Name;
        this.age=age;
    }
    void getdata(){
        System.out.println("Name"+Name);
        System.out.println("Age"+age);
    }
}

public class Assignment5 {
    public static void main(String[] args) {
        Student s= new Student();
        s.setdata("Mayuresh",18);
        s.getdata();
    }
    
}
