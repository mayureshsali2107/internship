class Calculator {

    // Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Add an integer and a double
    public double add(int a, double b) {
        return a + b;
    }
}
 
class Assignment1{
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("add(int, int): " + calc.add(10, 20));
        System.out.println("add(int, int, int): " + calc.add(10, 20, 30));
        System.out.println("add(double, double): " + calc.add(5.5, 4.5));
        System.out.println("add(int, double): " + calc.add(10, 5.5));
    }
}
