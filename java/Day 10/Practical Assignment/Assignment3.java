class car{
    String model = "Fortuner";
    int engnum=4536;
    
    void displayinfo(){
        System.out.println("Model ="+model);
        System.out.println("Engine Number ="+engnum);


    }
}

public class Assignment3 {
    public static void main(String[] args) {
        car c =new car();
        c.displayinfo();
    }
    
}
