package chap06;

public class Member {
	String name;
	String id;
	String password;
	int age;
	Member(){
		this("�ƹ���", "���̵����");
	}
	Member(String name, String id){ 
		this.name = name;
		this.id = id;
	}
}