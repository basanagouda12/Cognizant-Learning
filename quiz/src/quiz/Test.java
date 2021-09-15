package quiz;

class Test {
	private static void display() {
		System.out.println("Display()");
	}

	private static void show() {
		display();
		System.out.println("show()");
	}

	public static void main(String arg[]) {
		show();
	}
}
