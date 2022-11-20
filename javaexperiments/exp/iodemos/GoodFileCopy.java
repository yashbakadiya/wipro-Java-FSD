package exp.iodemos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class GoodFileCopy {
	
	public static void main(String args[]) {
		GoodFileCopy demo=new GoodFileCopy();
		demo.execute();
	}

	public void execute() {
		File readFile = new File("/home/vineet/Documents/wipro/mydir/names.txt");
		File writeFile = new File("/home/vineet/Documents/wipro/mydir/namescopy.txt");
		FileInputStream inputStream = null;
		BufferedInputStream bufferedInputStream=null;
		FileOutputStream outputStream = null;
		BufferedOutputStream bufferedOutputStream=null; 
		try {
			inputStream = new FileInputStream(readFile);
			bufferedInputStream=new BufferedInputStream(inputStream);
			outputStream = new FileOutputStream(writeFile);
			bufferedOutputStream=new BufferedOutputStream(outputStream);
			byte bytesRed[]=new byte[1024];
			int bytesRedCount=0;
			int totalBytesRedCount=0;
			while ((bytesRedCount = inputStream.read(bytesRed)) >0) {
				bufferedOutputStream.write(bytesRed,0,bytesRedCount);
				totalBytesRedCount=totalBytesRedCount+ bytesRedCount;
			}
			System.out.println("file copy done");
			System.out.println("bytes count=" + totalBytesRedCount);
			bufferedOutputStream.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			close(inputStream);
			close(outputStream);

		}

	}

	void close(OutputStream stream) {
		try {
			if (stream != null) {
				stream.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void close(InputStream stream) {
		try {
			if (stream != null) {
				stream.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
