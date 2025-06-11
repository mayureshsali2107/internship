
import java.util.Scanner;



public class Assignment2 {
    public static void main(String[] args) {
// Accept currency code (INR, USD, EUR, GBP) and print its symbol (₹, $, €, £) using switch-case.

      Scanner sc= new Scanner(System.in);
      String currency = sc.next();

      switch(currency){
       
        case "INR":System.out.println("₹");
                   break;
        case "USD":System.out.println("$");
                   break;
        case "EUR":System.out.println("€");       
                   break;
        case "GBP":System.out.println("£");  
                   break;                        

      }

    }
    
}
