package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		try {
			fos = new FileOutputStream("C:\\Users\\HP\\Desktop\\emp.ser");
			oos = new ObjectOutputStream(fos);
			
			Employee emp = new Employee(1, "john", 10000, 12345);
			oos.writeObject(emp);
			System.out.println("Emplyee object");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
