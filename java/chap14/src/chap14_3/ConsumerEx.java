package chap14_3;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjLongConsumer;

public class ConsumerEx {

	public static void main(String[] args) {
		Consumer<String> con = t -> System.out.println(t + "1.8");
		con.accept("자바");
		
		BiConsumer<String, String> biCon = (t, u) -> System.out.println(t+" : "+u);
		biCon.accept("자바", "1.8");
		
		DoubleConsumer doubleCon = d -> System.out.println("JAVA "+d);
		doubleCon.accept(1.8);
		
		IntConsumer intCon = i -> System.out.println("JAVA "+i);
		intCon.accept(2);
		
		ObjIntConsumer<String> objIntCon = (t, i) -> System.out.println(t + i);
		objIntCon.accept("JAVA", 2);
		
		ObjDoubleConsumer<String> objDoubleCon = (t, i) -> System.out.println(t+i);
		objDoubleCon.accept("Java", 5);
	}

}
