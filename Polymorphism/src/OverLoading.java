
public class OverLoading {

	void add(int a, int b) {
		int result = a + b;
		System.out.println("Result is: " + result);

	}

	void add(float a, float b) {
		float result = a + b;
		System.out.println("Result is: " + result);

	}

	void add(int a, int b, int c) {
		int result = a + b + c;
		System.out.println("Result is: " + result);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverLoading o = new OverLoading();
		o.add(10, 20);
		o.add(30f, 40f);
		o.add(20, 30, 50);

	}

}
