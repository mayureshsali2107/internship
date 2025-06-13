class vehicle{
 String Num = "MH 17 AZ 0001";

}
class car extends vehicle{
    int eng = 13672;
    String Model ="Fortuner";

    void displayinfo(){
        System.out.println("Vehicle Num ="+Num);
        System.out.println("Engine Number = "+eng);
        System.out.println("Model = "+Model);
    }
}
class bike extends vehicle{
   int eng =7249;
   String Model = "Kawasaki Z9 R";

   void displayinfo(){
         System.out.println("Vehicle Num ="+Num);
        System.out.println("Engine Number = "+eng);
        System.out.println("Model = "+Model);
   }

}

public class Assignment5 {
    public static void main(String[] args) {
        car c =new car();
        bike b=new bike();
        c.displayinfo();
        b.displayinfo();
        
    }
    
}
