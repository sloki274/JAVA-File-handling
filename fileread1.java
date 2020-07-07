package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileread1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		  File f=new File("C:\\Users\\varun\\Documents\\Project\\lokitest.txt\\");
	FileReader fr= new FileReader(f);// reads a file
	BufferedReader br = new BufferedReader(fr);// Reads the content of the file
	String line;
	while((line=br.readLine())!=null) //checking wthere any content is there to read or not
	
		{
		System.out.println(line);
		}
	
	
	}

}