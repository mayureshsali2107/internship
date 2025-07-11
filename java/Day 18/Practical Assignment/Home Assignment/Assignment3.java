class Parent{

    public Parent() {
        System.out.println("parent");
    }
    
    

}
class child extends Parent{

    public child() {
        super();

        System.out.println("Child");
    }
}
   
public class Assignment3{
    
    public static void main(String[] args) {
        child a =new child();
        
        
    }    
}
