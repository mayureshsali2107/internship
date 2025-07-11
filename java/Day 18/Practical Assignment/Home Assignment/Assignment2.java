class Parent{
   void result(){
    System.out.println("Parent Class");
   }

}
class child extends Parent{
    void result(){
        super.result();
        System.out.println("Child Class");
    }
}
public class Assignment2 {
    
    public static void main(String[] args) {
        child a =new child();
        
       a.result();
    }    
}
