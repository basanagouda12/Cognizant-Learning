
class Add {
	public String add(double a,String b) {
		return a+b;
	}
	
	public double add(double a,double b) {
		return a+b;
	}
	
	public String add(String a,String b) {
		return a+b;
	}
}


public class Test {
	
	
	public static void main(String[] args) {
	
		Add a = new Add();
		System.out.println(a.add(1,3));
		
	}

}
