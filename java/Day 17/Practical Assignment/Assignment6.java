
import java.io.FileReader;


public class Assignment6 {
    public static void main(String[] args) {
        try {
           FileReader reader = new FileReader("Demo.txt") ;
           System.out.println(reader.read());
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
