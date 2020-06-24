package parctice;

public class Member {

	String name = "이름";
	String id = "아이디";
	String password = "패스워드";
	int age;
	Member(){
		
		
		this("홍길동","아이디없음");
	}
	Member(String name, String id){
		
		this.name = name;
		this.id = id;
		
		
	}
	
	
	
	public static void main (String [] args) {
		
		
		Member user1 = new Member("홍길동", "hong");
		Member user2 = new Member("강자바","java");
	
		
		
		
	}
	
	
	

}
