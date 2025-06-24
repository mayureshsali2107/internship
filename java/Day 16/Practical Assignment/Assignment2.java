
import java.util.Scanner;


public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =sc.nextInt();
        int j = sc.nextInt();

        try {
            int Ans = i/j;
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
