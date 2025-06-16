//Create a class Mobile with fields modelName and price. Create two objects and display their details.
class Mobile{
    String Modelname;
    int price;

    public Mobile(String Modelname,int price) {

        this.Modelname=Modelname;
        this.price=price;
    }
    
    void display(){
        System.out.println("Mobile Brand = "+Modelname+"\nPrice = "+price);
    }


}

public class Assignment2 {
    public static void main(String[] args) {
        Mobile m1=new Mobile("Samsung S25",79000);
        Mobile m2 =new Mobile("Samsung s25 Ultra", 159000);
        m1.display();
        m2.display();
        
    }
}
