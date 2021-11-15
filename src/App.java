import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("test_code.py");
        LexicalAnalyzer la = new LexicalAnalyzer(file);
        la.tokenize();
        System.out.print(la.tokens);
    }
}
