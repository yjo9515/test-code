package test1;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;
import java.util.ArrayList;

public class String3 {
	public static void main(String []args) {
		
		StringClass1 sangpoom1 = new StringClass1();
		sangpoom1.setItemName("쌀5kg");
		sangpoom1.setAmount(new BigDecimal(20000));
		StringClass1 sangpoom2 = new StringClass1();
		sangpoom2.setItemName("쇠고기 5kg");
		sangpoom2.setAmount(new BigDecimal(90000));
	
		List<StringClass1> lst = new ArrayList<>();
		lst.add(sangpoom1);
		lst.add(sangpoom2);
		
		String lineForm1 = "%-10s%10d원";
		String lineForm2 = "%-10s%10s원";
		//format : 특정 형태의 폼으로 데이터를 저장하거나 처리
		
		DecimalFormat df = new DecimalFormat("###,##0"); 
		
		String disAmt1 = df.format(sangpoom1.getAmount().longValue());
		String disAmt2 = df.format(sangpoom2.getAmount().longValue());

		String res1 = String.format(lineForm1, 
				sangpoom1.getItemName(),sangpoom1.getAmount(),disAmt1);
		String res2 = String.format(lineForm1,
				sangpoom2.getItemName(),sangpoom1.getAmount(),disAmt2);
		
		String res3 = String.format(lineForm2, 
				sangpoom1.getItemName(),disAmt1);
		String res4 = String.format(lineForm2,
				sangpoom2.getItemName(),disAmt2);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		
		
	}
}
