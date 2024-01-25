public class Test {
    public static void main(String[] args) {
        Compiler c1 = new Language();
        c1.compiler();

        Interpreter c2 = new Language();
        c2.interpret();
    }
}
