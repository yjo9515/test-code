package chap11;

public class MemberEx1 {

	public static void main(String[] args) {
		Member obj1 = new Member("choi");
		Member obj2 = new Member("kim");
		Member obj3 = new Member("lee");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		}else {
			System.out.println("obj1과 obj2는 서로 동일하지않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다.");
		}else {
			System.out.println("obj1과 obj3는 서로 동일하지않습니다.");
		}
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
	}

}
