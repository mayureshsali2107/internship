import java.util.*;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int num=sc.nextInt();
        if(num==0){
            System.out.println("Number is Zero");
        }
       else if(num%2==0){
        System.out.println("Number is Even");
    
       }
       else if(num%2!=0){
        System.out.println("Number is Odd");
       }

    }
}
