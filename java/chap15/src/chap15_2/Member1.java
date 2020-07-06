package chap15_2;

import java.lang.reflect.Member;

public class Member1 {
	public String name;
	public int age;
	public Member1(String name, int age) {
	
		this.name = name;
		this.age = age;
		
	}
	public boolean equals(Object obj) {
		if(obj instanceof Member1) {
			Member1 member = (Member1) obj;
			return member.name.equals(name) &&(member.age == age);
		}else {
			return false;
		}
		
	}
	public int hashCode() {
		return name.hashCode()+age;
 		
	}

}
