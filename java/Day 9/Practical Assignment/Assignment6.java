import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int age = sc.nextInt();
        if (age==60||age>60) {
            System.out.println("Senior Citizen");
        }
        else if(age>=18||age<60){
            System.out.println("Adult");
        }
        else{
            System.out.println("Child");
        }
    }
    
}
