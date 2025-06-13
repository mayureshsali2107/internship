//create a User base class with username and email, and a subclass Admin that adds adminLevel. Use constructor chaining and print details of the Admin.
class User{
    String Username;
    String email;

    public User(String Username,String email) {
        this.Username=Username;
        this.email=email;
    }

    

}
class Admin extends User{

    public Admin(String Username,String email) {
        super(Username,email);
    }

    void print(){
        System.out.println("Username ="+Username);
        System.out.println("email ="+email);
    }
    

}
public class Assignment2 {
    public static void main(String[] args) {
        Admin a=new Admin("Mayureshsali2107", "mayureshsali392@email.com");
        a.print();
    }
    
}
