package chap06;

public class MemberService {
	String id;
	String password;
	public boolean login(String id, String password) {
		this.id = id;
		this.password = password;
		if(id!="" && password!="") {
			if(id.contentEquals("hong") && password.equals("12345")) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	public void logout(String id) {
		this.id = id;
	}
}