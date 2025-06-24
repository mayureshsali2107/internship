//Write a Java program to synchronize access to a shared resource using the synchronized keyword. Demonstrate how race conditions can be avoided.
class Demo {
  void run(){
        System.out.println("Synchronized method");
    }

}
class Demo1 extends Thread{

     Demo s;

    public Demo1(Demo s) {
        this.s=s;
    }
    
   public void run(){
    s.run();
        System.out.println("Not synchronized Method");
   
}
}
public class Assignment3 {
 
   
 public static void main(String[] args) {
    Demo s= new Demo();
    Demo1 a= new Demo1(s);
    a.start();

 }    
}
