package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import scanner.scanner;

public class Filereadre2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		
		// using file class and scanner class
		
		File f =new File("C:\\Users\\varun\\Documents\\Project\\lokitest.txt\\");
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine())
		{
		String line = sc.nextLine();
		System.out.println(line);
		
	}

}
}