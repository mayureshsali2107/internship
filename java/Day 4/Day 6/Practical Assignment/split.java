
import java.util.Scanner;
public class split {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     
     
     System.out.println("Enter Sentence= ");
     String Sen =sc.nextLine();
     String[] words=Sen.split("");
    for(String word:words){
     System.out.println(word);
    }  
    }
    
}
