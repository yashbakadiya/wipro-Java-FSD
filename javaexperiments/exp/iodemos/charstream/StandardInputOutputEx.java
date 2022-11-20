package exp.iodemos.charstream;

import java.io.*;

public class StandardInputOutputEx {
	
	public static void main(String args[]) {
		StandardInputOutputEx  demo=new StandardInputOutputEx();
		demo.execute();
	}

	public void execute() {
		Reader reader = null;
		Writer writer = null;
		try {
			InputStream inputStream = System.in;
			reader = new InputStreamReader(inputStream);
			OutputStream outpuStream = System.out;
			writer = new OutputStreamWriter(outpuStream);
			int charRed;
			int charsCount = 0;
			System.out.println("Write and finish with z");
			while ((charRed = reader.read()) != -1) {
				char iterated = (char) charRed;
				if (iterated == 'z') {
					break;
				}
				writer.write(charRed);
				charsCount++;

			}
			System.out.println("chars count=" + charsCount);
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
