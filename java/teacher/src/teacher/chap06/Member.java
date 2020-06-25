package chap06;

public class Member {
	String name;
	String id;
	String password;
	int age;
	Member(){
		this("아무개", "아이디없음");
	}
	Member(String name, String id){ 
		this.name = name;
		this.id = id;
	}
}