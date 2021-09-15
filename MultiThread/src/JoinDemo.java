import java.util.Scanner;

public class JoinDemo extends Thread{
	static int n,sum =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		System.out.println("Sum of N numbers");
		System.out.println("Enter number:");
		Scanner s = new Scanner(System.in);
		JoinDemo.n = s.nextInt();
		
		JoinDemo jd = new JoinDemo();
		jd.start();
		try {
			jd.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("sum of fist "+JoinDemo.n+" is: "+JoinDemo.sum);
		long end  = System.currentTimeMillis();
		
		System.out.println("total: "+ (end - start)/1000);
	}
	
	public void run() {
		for(int i=1;i<=JoinDemo.n;i++) {
			JoinDemo.sum += i;
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
