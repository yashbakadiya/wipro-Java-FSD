package exp.iodemos.charstream;

import java.io.*;

public class ReadWriteLines {
	public static void main(String args[]) {
		ReadWriteLines   demo= new ReadWriteLines();
		demo.execute();
	}

	public void execute() {
		Reader reader = null;
		BufferedReader bufferedReader=null;
		Writer writer = null;
		BufferedWriter bufferedWriter=null;
		try {
			InputStream inputStream = System.in;
			reader = new InputStreamReader(inputStream);
			bufferedReader=new BufferedReader(reader);
			OutputStream outpuStream = System.out;
			writer = new OutputStreamWriter(outpuStream);
			bufferedWriter=new BufferedWriter(writer);
			String redLine = bufferedReader.readLine();	
			System.out.println("line read done, now writing");
		//	int value=Integer.parseInt(redLine);
		//	System.out.println("integer found="+value);
			bufferedWriter.write(redLine);
			bufferedWriter.flush();
		
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
