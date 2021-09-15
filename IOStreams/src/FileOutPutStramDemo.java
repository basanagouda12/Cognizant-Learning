import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStramDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fi = null;
		FileOutputStream fo = null;
		try {
			fi =new FileInputStream("C:\\Users\\HP\\Desktop\\avatar.png");
			fo = new FileOutputStream("C:\\Users\\HP\\Documents\\project\\new.png");
			int data;
			while((data = fi.read())!= -1) {
				fo.write(data);
			}
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fi.close();
				fo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
