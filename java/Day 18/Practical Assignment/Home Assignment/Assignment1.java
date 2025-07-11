
class Parent{
    int id =29;

}
class child extends Parent{
    int id =87;
    int result = super.id;
}
public class Assignment1 {
    
    public static void main(String[] args) {
        child a =new child();
        
        System.out.println(a.result);
    }    
}
