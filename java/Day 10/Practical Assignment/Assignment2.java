
class Book{
String name;
String author;
Book(String name,String author){
    this.name =name;
    this.author=author;
}
void print(){
    System.out.println("Name = "+name);
    System.out.println("Author = "+author);
}

}
public class Assignment2 {
    public static void main(String[] args) {

        Book b1 = new Book("Maths","John");
        Book b2 = new Book("English","Newton");

        b1.print();
        b2.print();



        
    }
    
}
