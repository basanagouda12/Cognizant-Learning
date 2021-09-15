import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class ReaderWriterDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr =null;
		FileWriter fw = null;
		
		fr = new FileReader("C:\\Users\\HP\\Desktop\\ioStream.txt");
		fw = new FileWriter("C:\\Users\\HP\\Desktop\\newfile.txt");
		
		int ch;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
	}

}
