package inheritance03;

import java.text.DecimalFormat;

public class GoldCustomer extends Customer{
	
	public GoldCustomer() {}
	public GoldCustomer(int customerID, String customerName, int bonuspoint) {
		super.customerID = customerID;
		super.customerName = customerName;
		super.bonuspoint = bonuspoint;
		customerGrade = "GOLD";
		bonusRatio = 0.02;
	}
	
	@Override
	public int calcPrice(int price) {
		DecimalFormat d = new DecimalFormat("#,###원");
		int finalPrice = (int)(price*0.9);
		System.out.println();
		System.out.print("지불금액은 "+d.format(finalPrice)+"이고, ");
		bonuspoint += price*bonusRatio;
		System.out.println("보너스 포인트는 "+bonuspoint+"입니다.");
		return finalPrice;
	}
}
