public interface Interpreter {
    public default void interpret() {
        System.out.println("Interprets");
    }
}
