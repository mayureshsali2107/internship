class Parent{

    public Parent(int id) {
        
        System.out.println("parent"+id);
    }
    
    

}
class child extends Parent{

    public child() {
        super(21);

        System.out.println("Child");
    }
}
   
public class Assignment4{
    
    public static void main(String[] args) {
        child a =new child();
        
        
    }    
}
