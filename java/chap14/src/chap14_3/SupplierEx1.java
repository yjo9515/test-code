package chap14_3;
import java.util.function.IntSupplier;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.LongSupplier;
public class SupplierEx1 {

	public static void main(String[] args) {
		IntSupplier intSup = () -> {
			int num = (int) (Math.random()*6)+1;
			return num;
			
		};
		int num = intSup.getAsInt();
		System.out.println("주사위의 눈의 수 : "+num);
		
		BooleanSupplier boolSup = () -> {
			boolean bool = true;
			return bool;
		};
		boolean yesno = boolSup.getAsBoolean();
		System.out.println("남성입니까? "+yesno);
		
		
		
		
	}
}
