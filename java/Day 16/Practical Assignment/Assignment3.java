
public class Assignment3 {
    public static void main(String[] args) {
        try {
            int i = 100/0;
            System.out.println(i);
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Hello From Finally");
        }
    }    
}
