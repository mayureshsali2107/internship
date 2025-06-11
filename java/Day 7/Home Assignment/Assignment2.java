

public class Assignment2 {
    public static void main(String[] args) {
        String input ="Hello? How Are You? Good!";
        String[] parts = input.split("\\?\\s");

        for(String part:parts){
            System.out.println(part);
        }

    }
    
}
