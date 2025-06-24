//Write a Java program to create a thread by extending the Thread class. The thread should print numbers from 1 to 5 with a delay of 1 second between each number.


public class Assignment1 extends Thread {

  public void run(){

        try {
            for(int i=1 ;i<=5;i++){
            System.out.println(i);
            sleep(1000);
        }
        } catch (Exception e) {
        }
  }

 public static void main(String[] args) {
    Assignment1 a= new Assignment1();
    a.start();
 }    
}
