class car{
String Veh_NO;
    public car(String Veh_NO) {
        this.Veh_NO=Veh_NO;
    }

    car(car c){
        this(c.Veh_NO);
        System.out.println("Vehicle Number = "+Veh_NO);

    }
    
}
public class Assignment5 {
    public static void main(String[] args) {
        car c =new car("MH 17 AZ 0001");
        car c1=new car(c);
    }
    
}
