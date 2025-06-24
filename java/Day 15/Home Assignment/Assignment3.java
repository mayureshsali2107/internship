
public class Assignment3 {
    public static void main(String[] args) {
        int sum = 0;
        int temp =35;
        do { 
            int digit = temp %10;
            sum+=digit;
            temp/=10;
        } while (temp!=0);
        System.out.println(sum);
    }    
}
