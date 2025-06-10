

public class split {
    public static void main(String[] args) {
        String Data ="101,Ravi,78,85,90";
        String[] output=Data.split(",");
        for(String word:output){
        System.out.println(word);}
    }
    
}
