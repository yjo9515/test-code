package chap13;

public class ProductEx1 {

	public static void main(String[] args) {	//파라미터가 객체타입으로 여러 개 일경우
		Product<Tv, String> pro1 = new Product<Tv, String>();
		pro1.setKind(new Tv());
		pro1.setModel("인터넷TV");
		Tv tv = pro1.getKind();
		String tvModel = pro1.getModel();
		
		Product<Car, String> pro2 = new Product<Car, String>();
		pro2.setKind(new Car());
		pro2.setModel("람보르기니");
		Car car = pro2.getKind();
		String CarModel = pro2.getModel();
		
		System.out.println("TV는 "+tvModel+"이며, 자동차는 "+CarModel+"입니다.");
		
	}

}
