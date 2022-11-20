package exp.iodemos;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class FileApiEx {

	public static void main(String args[]) {
		File dir = new File("/home/vineet/Documents/wipro/mydir");
		boolean isDir1 = dir.isDirectory();
		boolean exists1 = dir.exists();
		System.out.println("mydir is dir=" + isDir1 + " exists=" + exists1);

		File file = new File("/home/vineet/Documents/wipro/mydir/names.txt");
		boolean isDir2 = file.isDirectory();
		boolean exists2 = file.exists();
		System.out.println("names.txt is dir=" + isDir2);
		System.out.println("names.txt is exists" + exists2);
		
		System.out.println("files inside mydir");
		File files[]=dir.listFiles();
	    for(File iterated:files) {
	    	String fileName=iterated.getName();
	    	System.out.println("file name in mydir= "+fileName);
	    }
	}

}
