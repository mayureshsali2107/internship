
import java.util.Scanner;


public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a[] = {1,2,3,4};
        System.out.println("Enter Index You Want to Access =");
        int n = sc.nextInt();
        try {
            System.out.println(a[n]);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
