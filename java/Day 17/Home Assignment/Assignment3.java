
import java.io.FileReader;


public class Assignment3 {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("Hello.txt");
            System.out.println(f);
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
