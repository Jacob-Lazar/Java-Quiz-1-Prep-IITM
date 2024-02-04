package Implementing_Interfaces;

public class Test {
    public static void main(String[] args) {
        Displayable d1 = new Calculator();
        d1.display();
        Displayable d2 = new SmartCalculator();
        d2.display();
    }
}
