package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Desrialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\emp.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Object o = ois.readObject();
		Employee emp = (Employee) o;
		System.out.println("Empoyee id:" + emp.id);
		System.out.println("Empoyee name:" + emp.name);

		System.out.println("Empoyee salary:" + emp.salary);
		System.out.println("Empoyee ssn:" + emp.ssn);

	}

}
