import java.io.File;
import java.util.LinkedList;
import java.io.*;
public class LexicalAnalyzer {
    public String fileString;
    public LinkedList<Token> tokens;

    LexicalAnalyzer(File file) {
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            tokens = new LinkedList<Token>();
            stringifyBufferReader(buffer);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    public void tokenize() {
        Token t = new Token();
        tokens.add(t);
        // for (char c : fileString.toCharArray()) {
        for (int i = 0; i < fileString.length(); i++) {
            char c = fileString.toCharArray()[i];
            if(t.type==TokenType.COMMENT) {
                if (c!='\n') {
                    t.value=t.value.concat(""+c);
                } 
            } else if (t.type==TokenType.NEWLINE) {
                NewLineToken nlt = (NewLineToken) t;
                if(c==' ') {
                    nlt.indention++;
                    nlt.value=nlt.value.concat(""+c);
                }
            }
            if(c=='\n'){
                t=new NewLineToken();
                tokens.add(t);
            }
            if(c=='#') {
                if(t.type==TokenType.UNKNOWN && t.value.length() == 0) {
                    t.type=TokenType.COMMENT;
                    t.value=""+c;
                } else {
                    t = new Token();
                    tokens.add(t);
                    t.type=TokenType.COMMENT;
                    t.value=""+c;
                }
            }
        }
    }

    private void stringifyBufferReader(BufferedReader buffer) {
        try {
            fileString = new String();
            char c = (char) buffer.read();
            while(c != (char) -1) {
                fileString = fileString.concat(""+c);
                c = (char) buffer.read();
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}