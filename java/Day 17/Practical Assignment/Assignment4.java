
public class Assignment4 {
    public static void main(String[] args) {
        String str = null;
        try {
            if(str.equals(null)){
                System.out.println("String is null");
            }
            else{
                System.out.println(str);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
