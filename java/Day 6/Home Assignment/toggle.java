import java.util.*;
public class toggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

        int togglednum = num^1;
        System.out.println("Original Number ="+num);
        System.out.println("Toggled Number = "+togglednum);
    }
    
}
