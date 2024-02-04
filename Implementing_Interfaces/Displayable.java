package Implementing_Interfaces;

public interface Displayable {
    public default void display() {
        System.out.println("Displays digits");
    }   
}