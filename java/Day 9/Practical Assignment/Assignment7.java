

public class Assignment7 {
    public static void main(String[] args) {
        int x=15;
        int y=20;
        
        System.out.println("Before Swap a="+x+" b="+y);
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("After Swap a="+x+" b="+y);

    }
    
}
