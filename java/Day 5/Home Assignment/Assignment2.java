
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
//Accept age from the user and check if the person is eligible to vote (age ≥ 18). Print appropriate messages using logical operators.
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter Your Age = ");
     int age=sc.nextInt();
     if(age==18||age>=18){
        System.out.println("You Are Eligible For Vote");
     }    
     else{
        System.out.println("You Are Not Eligible");
     }


    }
}
