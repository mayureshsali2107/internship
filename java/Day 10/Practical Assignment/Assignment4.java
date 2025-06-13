class person{
String name ="Mayuresh Sali";
int age =34;
}

class employee extends person{
double salary = 259000;

void displayinfo(){
    System.out.println("Name = "+name);
    System.out.println("Age = "+age);
    System.out.println("Salary = "+salary);
}

}

public class Assignment4 {
    public static void main(String[] args) {
        employee e1 =new employee();
        e1.displayinfo();
    }
    
}
