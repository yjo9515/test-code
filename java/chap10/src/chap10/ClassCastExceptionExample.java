package chap10;

class Animal {
	int leg=4;
	
}
class Dog extends Animal{
	void bite(){
	System.out.println("멍 멍");
	}
}
class Cat extends Animal{
	void bite(){
		System.out.println("냐옹");
		}
	
}
public class ClassCastExceptionExample {

	public static void main(String[] args) {
		//참조 에러 -> 클래스캐스팅(형변환) 예외
//			Dog dog = new Dog();
//			jjangDog(dog);
//			Cat cat = new Cat();
//			jjangDog(cat);
//			
//			
//			public static void jjangdog(Animal animal) {
//				Dog dog = (Dog) animal;
//				
				
			}

	}

//}
