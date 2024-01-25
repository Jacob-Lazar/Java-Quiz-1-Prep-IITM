public class Test2 {
    public static void main(String[] args) {
        Compiler c1 = new Language();
        c1.compiler();
        c1.interpret();
    }
}
/*
  java: cannot find symbol
  symbol:   method interpret()
  location: variable c1 of type Compiler
 */