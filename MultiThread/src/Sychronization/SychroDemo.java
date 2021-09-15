package Sychronization;

public class SychroDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayMessage dm = new DisplayMessage();
		
		MyThread t1 = new MyThread(dm, "Steve");
		MyThread t2 = new MyThread(dm, "mark");
		
		t1.start();
		t2.start();

	}

}
