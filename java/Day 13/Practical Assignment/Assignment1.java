
import java.util.Scanner;

// Write a Java program in the default package that calculates the factorial of a number.


public class Assignment1 {
  public static void main(String[] args) {
   Scanner sc =new Scanner(System.in) ;
   int num = sc.nextInt();
   int fact =1;

   for(int i=0;i<=num;i++){
   fact =fact*i;
  } 
   System.out.println("Factorial = "+fact);
}
