import java.io.File;
import java.util.LinkedList;
import java.io.*;

/**
 * The Lexical Analyzer that is used to read a Python file and 
 * convert it into a set of useful tokens
 */
public class LexicalAnalyzer {
    public String fileString;
    public LinkedList<Token> tokens;

    /**
     * Constructor
     * 
     * Create the LexicalAnalyzer from a file
     * by initializing values and puting the 
     * entire file in a string
     * 
     */
    LexicalAnalyzer(File file) {
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            tokens = new LinkedList<Token>();
            stringifyBufferReader(buffer);
        } catch (Exception e) {
            //TODO: handle exception
            //We need to come to a concensus on how we typically 
        }
    }

    /**
     * Converts the fileString into tokens useful for parsing Python
     */
    public void tokenize() {
        Token t = new Token();
        tokens.add(t);
        for (char c : fileString.toCharArray()) {
            if(t.getType()==TokenType.COMMENT) 
                tokenizeComment(t,c);
            else if (t.getType()==TokenType.NEWLINE)
                tokenizeNewLine(t,c);
            else{ 
                if(c=='\n')
                    initialTokenizeNewLine(c);
            }
            if(c=='#')
                initialTokenizeComment(t, c);
            t = tokens.getLast();
        }
    }

    /**
     * Initialize a new Token of Comment Type and add 
     * it to the Token Linked List
     * 
     * @param t the current token
     * @param c the current character
     */
    private void initialTokenizeComment(Token t, char c) {
        if(t.getType()==TokenType.UNKNOWN && t.getValue().length() == 0) {
            t.setType(TokenType.COMMENT);
            t.setValue(""+c);;
        } else {
            t = new Token();
            tokens.add(t);
            t.setType(TokenType.COMMENT);
            t.setValue(""+c);;
        }
    }

    /**
     * Initialize a new Token of New Line Type and add 
     * it to the Token Linked List
     * 
     * @param c the current character
     */
    private void initialTokenizeNewLine(char c) {
        Token t=new NewLineToken();
        tokens.add(t);
    }

    /**
     * Handles tokenizing while in a token of Comment Type
     * 
     * @param t the current token
     * @param c the current character
     */
    private void tokenizeComment(Token t, char c) {
        if (c!='\n') {
            t.setValue(t.getValue().concat(""+c));
        } else {
            initialTokenizeNewLine(c);
        }
    }
    
    /**
     * Handles tokenizing while in a token of New Line Type
     * 
     * @param t the current token
     * @param c the current character
     */
    private void tokenizeNewLine(Token t, char c) {
        NewLineToken nlt = (NewLineToken) t;
        if(c==' ') {
            nlt.incrementIndention();
            nlt.setValue(nlt.getValue().concat(""+c));;
        }
    }

    /**
     * Reads the file and converts it to a string.
     * 
     * @param buffer the BufferReader assigned to the file from constructor
     */
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