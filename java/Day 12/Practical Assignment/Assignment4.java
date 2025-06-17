//Define an interface Printable with a method print(). Implement it in classes Document and Photo.
interface Printable{
    public void print();

}
class Document implements Printable{
    public  void print(){
        System.out.println("Documment");
    }
}
class Photo implements Printable{
  public void print(){
    System.out.println("Photo");
  }
}

public class Assignment4 {
 public static void main(String[] args) {
    Document d= new Document();
    d.print();
    Photo p =new Photo();
    p.print();
 }    
}
