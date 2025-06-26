class Demo{
    static int count;
    Demo(){
        count++;
        System.out.println(count);
    }
}

public class Assignment5 {
    public static void main(String[] args) {
        Demo d =new Demo();
        Demo d1 = new Demo();
        Demo d2 = new Demo();
    }    
}
