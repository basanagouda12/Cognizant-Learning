package webapp;

public class UserValidationService {
	
	public boolean isUserValid(String user,String password) {
		if(user.equals("basu") && password.equals("pass")) {
			return true;
		}
		else {
			return false;
		}
	}
}
