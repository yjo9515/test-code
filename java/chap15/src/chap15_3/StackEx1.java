package chap15_3;
import java.util.*;
public class StackEx1 {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		//LIFO 컬렉션 = 스택
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(100));	
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : "+coin.getValue()+"원");
			
		}
		System.out.println();
		
		Queue<Coin> coinBox2 = new LinkedList<Coin>();
		coinBox2.offer(new Coin(500));
		coinBox2.offer(new Coin(100));
		coinBox2.offer(new Coin(50));
		coinBox2.offer(new Coin(10));
		coinBox2.offer(new Coin(100));
		
		while(!coinBox2.isEmpty()) {
			Coin coin2 = coinBox2.poll();
			System.out.println("꺼내온 동전 : "+coin2.getValue()+"원");
			
		}
		
		
		
		
	}

}
