package exp.iodemos.charstream;

import java.io.*;

import exp.iodemos.FileCopyEx1;

public class FileReadWriteVowels {
	public static void main(String args[]) {
		FileReadWriteVowels demo = new FileReadWriteVowels();
		demo.execute();

	}

	public void execute() {
		File readFile = new File("/home/vineet/Documents/wipro/mydir/names.txt");
		File writeFile = new File("/home/vineet/Documents/wipro/mydir/namescopy.txt");
		FileReader reader = null;
		FileWriter writer = null;
		try {
			reader = new FileReader(readFile);
			writer = new FileWriter(writeFile);
			int charRed;
			int vowelsCount = 0;
			while ((charRed = reader.read()) != -1) {
				char iterated = (char) charRed;
				if (iterated == '\n') {
					writer.write('\n');
				}
				if (iterated == 'a' || iterated == 'e' || iterated == 'i' || iterated == 'o' || iterated == 'u') {
					writer.write(charRed);
					vowelsCount++;
				}
			}
			System.out.println("vowels copy done");
			System.out.println("vowels count=" + vowelsCount);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			close(reader);
			close(writer);

		}

	}

	void close(Writer writer) {
		try {
			if (writer != null) {
				writer.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void close(Reader reader) {
		try {
			if (reader != null) {
				reader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
