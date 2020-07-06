package chap14_3;

import java.util.function.IntBinaryOperator;

public class OperatorEx1 {
	private static int[] scores = {95,87,94,88,97};
	
	
	public static int maxMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
		
	}
	public static void main(String[] args) {
		//최대값
		int max = maxMin(
				(a,b)->{
					if(a>=b) {
						return a;
					}else {
						return b;
					}
				});
		//최소값
		int min = maxMin(
				(a,b)->{
					if(a<=b) {
						return a;
					}else {
						return b;
					}
				}
			);
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
				

	}

}
