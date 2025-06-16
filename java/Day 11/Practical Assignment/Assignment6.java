//Define a base class Device with a method powerOn(). Derive two classes Smartphone and Tablet, each overriding the powerOn() method with their own messages.
class Device{
    void powerOn(){
        System.out.println("Device Is Power On");
    }
}
class Smartphone extends Device{
    void powerOn(){
        System.out.println("Smartphone Is Power On");
    }
}

class Tablet extends Device{
    void powerOn(){
        System.out.println("Tablet Is Power On");
    }
}


public class Assignment6 {
public static void main(String[] args) {
    Smartphone s = new Smartphone();
    s.powerOn();
    Tablet t =new Tablet();
    t.powerOn();
}    
}
