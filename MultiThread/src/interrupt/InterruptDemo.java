package interrupt;

public class InterruptDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();
		
		t.interrupt();
		
		System.out.println("End of main");
	}

}
