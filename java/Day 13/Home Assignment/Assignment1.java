//. Write a Java program that prints the factorial of number 5 using a simple for loop.


public class Assignment1 {
    public static void main(String[] args) {
       
   int num = 5;
   int fact =1;

   for(int i=0;i<=num;i++){
   fact =fact*i;
  } 
   System.out.println("Factorial = "+fact);
    }
}
