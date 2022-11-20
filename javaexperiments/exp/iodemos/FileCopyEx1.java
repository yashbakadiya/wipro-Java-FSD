package exp.iodemos;

import java.io.*;

public class FileCopyEx1 {
	public static void main(String args[])  {
		FileCopyEx1 demo = new FileCopyEx1();
		demo.execute();

	}

	public void execute() {
		File readFile = new File("/home/vineet/Documents/wipro/mydir/names.txt");
		File writeFile = new File("/home/vineet/Documents/wipro/mydir/namescopy.txt");
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		try {
			inputStream = new FileInputStream(readFile);
			outputStream = new FileOutputStream(writeFile);
			int byteRed;
			int redCount = 0;
			while ((byteRed = inputStream.read()) != -1) {
				outputStream.write(byteRed);
				redCount++;
			}
			System.out.println("file copy done");
			System.out.println("bytes count=" + redCount);
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
