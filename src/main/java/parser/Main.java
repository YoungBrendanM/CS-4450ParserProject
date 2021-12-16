package parser;


import java.io.*;
import java.util.Arrays;
import java.awt.*;
import javax.swing.*;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
 
    public static void main(String[] args) {

    	//Open a file explorer 
        JFrame uselessJF = new JFrame("Parser");
        uselessJF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        uselessJF.pack();
        JFileChooser fileExplorer = new JFileChooser();
        int returnVal = fileExplorer.showOpenDialog(uselessJF);
        uselessJF.dispose();
        
        //If file was chosen
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File inputfile = fileExplorer.getSelectedFile();
            File middleWareFile = new File("out.py");
            try {
            	//Initiate Pre-Processing  step. This step is used to help handle pythons indention
            	preProcess(inputfile, middleWareFile);
            	
            	//Convert file into stream suitable for ANTLR
				CharStream stream = CharStreams.fromFileName(middleWareFile.getAbsolutePath());
				//Split the file into tokens using the lexer
				AppLexer lexer  = new AppLexer(stream);   
				//Create a TokenStream for the parser.
	            TokenStream ts = new CommonTokenStream(lexer);
	            //parse the tokens
	            AppParser parser = new AppParser(ts);
	            //put tokens into a tree format
	            ParseTree tree = parser.s();
	            //delete middleware file
	            middleWareFile.delete();
	            // Print out the parse tree in console
	            System.out.println(tree.toStringTree(parser));
	
	            //Set up Tree Graph UI
	            JFrame frame = new JFrame("Parser");
	            TreeViewer viewer = new TreeViewer(Arrays.asList(
	                    parser.getRuleNames()),tree);
	            JScrollPane scrollBar=new JScrollPane(viewer,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	            frame.add(scrollBar);
	            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            
	            //Make frame take up most of screen
	            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	            frame.setSize(screenSize.width/10*9, screenSize.height/10*9);
	            frame.setVisible(true);
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
        //If no file is chosen close the program.
        else {
        	System.exit(returnVal);
        }
    }
    
    public static void preProcess(File inputFile, File outputFile) {
		
		try {
			//to write output file
			FileOutputStream fos = new FileOutputStream(outputFile);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
			//to read input file
			BufferedReader br;
			br = new BufferedReader(new FileReader(inputFile.getAbsolutePath()));
		    //read first line of file
			String line = br.readLine();
			//set indentions to zero and initial indention
			int prevIndention = 0;
			int indention = 0;
			while (line != null) {
				//update indention and prevIndention
				prevIndention = indention;
				indention = getFirstNonSpaceInd(line);
				//if file dedented add END identifier
				while(prevIndention>indention) {
					prevIndention-=4;
					bw.write("END");
		            bw.newLine();
				} 
				//write line to file
				bw.write(line);
				bw.newLine();
				
				// read next line
				line = br.readLine();
			}
			//If at the end of the file there are any dedents implied add END identifier
			while(indention>0) {
				indention-=4;
				bw.write("END");
	            bw.newLine();
			}
			//close input and output files
			br.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    

	public static int getFirstNonSpaceInd(CharSequence charArray) {
		//gets first non space character index
        int i = 0;
        while (charArray.length() > i) {
            char c = charArray.charAt(i);
            if (!Character.isSpaceChar(c) && !Character.isWhitespace(c))
                break;
            i++;
        }
        return i;
    }

}
