

public class Assignment4 {
    public static void main(String[] args) {
        String Email = "mayureshsali392@gmail.com";
        String[] Words = Email.split("@");

        String Username = "mayureshsali_2107";
        String Domain ="Full Stack Developement Using Java";

        for(String Word:Words){
            System.out.println(Word);
        }
        System.out.println("Username = "+Username);
        System.out.println("Domain = "+Domain);
    }
    
}
