import java.io.File;

import java.io.*;
public class LexicalAnalyzer {
    public String fileString;

    LexicalAnalyzer(File file) {
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            stringifyBufferReader(buffer);
        } catch (Exception e) {
            //TODO: handle exception
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