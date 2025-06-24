
public class Assignment4 {
    public static void main(String[] args) {
        try {
            int a=1,b=0,c=4;
            System.out.println(a*c);
            System.out.println(a+c);
            System.out.println(a-c);
            System.out.println(a/b);
            
            
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
         
        finally{
            System.out.println("Hello From Finally");
        }
    }    
}
