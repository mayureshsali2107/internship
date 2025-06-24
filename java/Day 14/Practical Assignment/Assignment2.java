//Write a Java program where a class implements the Runnable interface and prints "Hello from thread!" five times.

public class Assignment2 implements Runnable {
    public void run(){
        for(int i=0;i<5;i++);
        System.out.println("Hello from thread!");

    }


 public static void main(String[] args) {
    Assignment2 a =new Assignment2();
    Thread t =new Thread(a);
    t.start();

    
 }    
}
