public interface Compiler {
    public default void compiler() {
        System.out.println("Compiles");
    }
}
