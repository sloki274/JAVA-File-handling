package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filewrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File f = new File("C:\\Users\\varun\\Documents\\Project\\varuntest.txt\\");
	FileWriter fw = new FileWriter(f);
	try(BufferedWriter br= new BufferedWriter(fw))
	{
		br.write("hi");
        br.newLine();
		br.write("welcome");
		
	
		
	}
	catch(Exception e)
	{
		System.out.println("error");
	}
	

	}

}
