package filehandling;

import java.io.File;

public class filerenamedelette {
	
	
	public static void main(String[] args) {
		
		File f =new File("C:\\Users\\varun\\Documents\\Project\\lokitest.txt\\");
	    File f1 = new File("C:\\Users\\varun\\Documents\\Project\\renametest.txt\\");
		File f2 =new File("C:\\Users\\varun\\Documents\\Project\\tiger.txt");
	    f.renameTo(f1);
		
		System.out.println(f.exists());
		System.out.println(f.canRead());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.isFile());
		System.out.println(f1.getName());
		System.out.println(f1.isHidden());
		System.out.println(f1.getPath());
		System.out.println(f1.getClass());
		System.out.println(f1.getFreeSpace());
		System.out.println(f1.getParent());
		System.out.println(f1.lastModified());
		System.out.println(f1.length());
		
		System.out.println(f2.delete());
		System.out.println(f2.exists());
	}
	
      
}
 