//Create a base class Teacher with fields name and subject. Create a subclass MathTeacher that adds a field experienceYears. Print all details using constructor chaining.
class Teacher{
    String name = "john doe";
    String subject = "C programming";
}


class MathTeacher extends Teacher{
    int experienceYears =12;

    void display(){
        System.out.println("Name = "+name+"\nSubject = "+subject+"\nExperience = "+experienceYears);
    }
}

public class Assignment4 {
    public static void main(String[] args) {
        MathTeacher m= new MathTeacher();
        m.display();
        
    }
}
