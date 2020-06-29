package chap11;

public class CarEx1 {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		
		car1.setModelName("그랜저");
		car1.setOwners("윤준오");
		
		
		System.out.println("Car1 : "+car1.getModelName()+", "+car1.getOwners());
		
		Car car2 = (Car) car1.clone();
		System.out.println("Car2 : "+car2.getModelName()+", "+car2.getOwners());
		
		car2.setOwners("서지원");
		System.out.println("Car1 : "+car1.getModelName()+", "+car1.getOwners());
		System.out.println("Car2 : "+car2.getModelName()+", "+car2.getOwners());
		
		Car car3 = null;
		car2 = null;
		System.out.println("Car1 : "+car1.getModelName()+", "+car1.getOwners());
		System.out.println("Car2 : "+car2.getModelName()+", "+car2.getOwners());
		
		System.gc();	//가비지 컬렉션 null(쓰레기)값이 되어 버린 car2. car3를 쓰레기 수집 요청 
		System.out.println(car1.toString());	//현재 남아있음
		System.out.println(car2.toString());	//현재 없음
		System.out.println(car3.toString());	//현재 없음

		
		
	}

}
