import java.util.*;


public class temperature {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Temperature =");
        int temp =sc.nextInt();
       

        if(temp>35){
            System.out.println("Hot Day");
             }
             else{
                System.out.println("Normal Day");
             }

    }
    
}

