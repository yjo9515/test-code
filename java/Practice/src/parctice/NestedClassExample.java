package parctice;

public class NestedClassExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
	
		Car.Tire tire2 = myCar.new Tire();
		
		Car.Engine engine = new Car.Engine(); 
		
		
//		static -> Car.Engine.cylinder

	}

}
