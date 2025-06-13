// Create a Movie class with fields title, director, and releaseYear. Create two movie objects and display their details using a method.
class Movie{
    String Title;
    String Director;
    String Date;

    public Movie(String Title,String Director,String Date) {
        this.Title=Title;
        this.Director=Director;
        this.Date=Date;
    }
    

    void print(){
        System.out.println("Movie Title = "+Title);
        System.out.println("Director = "+Director);
        System.out.println("Date = "+Date);
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        Movie m1=new Movie("Pushpa","Sukumar","17-12-2021");
        Movie m2=new Movie("Pushpa2","Sukumar","04-12-2024");
        m1.print();
        m2.print();
        

        
    }
    
}
