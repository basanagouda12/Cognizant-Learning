
public class CheckProcesessor implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Processor checked");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckProcesessor cp = new CheckProcesessor();
		Thread t = new Thread(cp);
		t.start();
	}

}
