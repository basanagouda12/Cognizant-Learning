import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stubIn
		FileInputStream f = null;
		try {
			f = new FileInputStream(new File("C:\\Users\\HP\\Desktop\\ioStream.txt"));
			int i;
			while((i = f.read())!=-1) {
				System.out.print((char) i);
			}
			
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				f.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("File Closed");
		}

	}

}
