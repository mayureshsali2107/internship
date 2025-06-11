import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        // Accept a number and check if it is divisible by 5 and 11 using if-else switch-case Statements
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();

        if(num%5==0){
            System.out.println("Number is Divisible by 5");
        }
        else if(num%11==0){
            System.out.println("Number is Divisible by 11");

        }
        else{
            System.out.println("Number Is not Divisible by 5 and 11");
        }

    }
}
