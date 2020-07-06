package chap15_1;

import java.util.*;

public class Vector1 {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		list.add(new Board("겁쟁이","버즈","빽이 부릅니다."));
		list.add(new Board("실연","코요태","신지가 부릅니다"));
		list.add(new Board("아로하","쿨","파카가 부릅니다"));
		list.add(new Board("it's u","버즈","랄로가 부릅니다"));
		
		
		for(int i=0;i<list.size(); i++) {
			
			Board brd = list.get(i);
			System.out.println(i+" "+brd.subject+brd.content+" "+brd.writer);
			
		}
	}

}
