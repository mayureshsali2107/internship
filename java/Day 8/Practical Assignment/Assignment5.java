
import java.util.Scanner;



public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =sc.next();

        switch(s){
        case "A":System.out.println("Excellent");
                 break;
        case "B":System.out.println("Good");
                 break;
        case "C":System.out.println("Average");
                 break;
        case "D":System.out.println("Below Average");
                 break;
        case "F":System.out.println("Fail");
                 break;
        

        }


    }
}