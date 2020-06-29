package chap11;

public class Member {
	
	public String id;
	public String company = "ezen";
	public Member(String id) {
		this.id = id;
	}

	
	@Override
	public boolean equals(Object obj) {
		//equals메소드 성능개선을 위한 오버라이딩
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(id.contentEquals(member.id)){
				
				return true;
			}
	}	
		return false;
	}
	@Override
	public int hashCode() {
		//동일한 id에 대한 해시코드를 여러 개 발생시키지 않도록 성능개선을 위한 오버라이딩
		return id.hashCode();
	}


	@Override
	public String toString() {
		//클래스 이름과 해시코드 출력부분을 본인이 원하는 형식으로 출력하도록 오버라이딩
		return company;
	}
	
	
}
