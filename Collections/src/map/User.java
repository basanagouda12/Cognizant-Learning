package map;

public class User {
	@Override
	public String toString() {
		return "user";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called");
	}

}
