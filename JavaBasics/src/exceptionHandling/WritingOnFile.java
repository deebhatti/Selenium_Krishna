package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingOnFile {
	
	public static void main(String[] args) throws FileNotFoundException  {
		File file = new File("D:\\EclipseWorkspace\\s3\\Output.txt");
		PrintWriter output = new PrintWriter(file);
		
		output.print("Today is Friday");
		output.close();
		
		
		if(true){
			System.out.println("Process executed succesfully");
		}
		
		else{
			throw new NullPointerException();
		}
		
	}

}
