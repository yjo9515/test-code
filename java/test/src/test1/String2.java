package test1;

import java.math.BigDecimal;

public class String2 {

	public static void main(String[] args) {
		StringClass1 sangpoom = new StringClass1();
		sangpoom.setItemName("쌀5kg");
		sangpoom.setAmount(new BigDecimal(20000));
		StringBuilder sb = new StringBuilder();	//String 데이터를 효과적으로 사용
		sb.append(sangpoom.getItemName());
		sb.append("        ");//문자열 추가 = append
		sb.append(sangpoom.getAmount());
		sb.append("원");
		System.out.println(sb.toString());	//저장된데이터를 불러오는메소드 = toString

	}

}
