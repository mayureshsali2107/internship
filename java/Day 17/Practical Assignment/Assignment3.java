class Student{
    String name;
   
    
}
public class Assignment3 {
    public static void main(String[] args) {
        Student s =null;
        
        try {
            System.out.println(s.name);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
