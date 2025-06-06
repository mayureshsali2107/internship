class room{
   int side ;
   room(int s){ 
    side=s;
   } 

}
    class calculate extends room{
        calculate(int s){
            super(s);
        }
        void cal(){
        
            int area=side*side;
            int volume=side*side*side;
            System.out.println("Area = "+area);
            System.out.println("Volume = "+volume);
        }
    }

public class hello {
    public static void main(String[] args) {
        calculate c = new calculate(5);
        c.cal();
    }
    
}
