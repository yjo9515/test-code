package test1;

import java.math.BigDecimal;

public class StringClass1 {	//제품정보

	private String itemName; //상품명
	private BigDecimal amount; //숫자가 큰 금액
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
}
