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
		DecimalFormat d = new DecimalFormat("#,###��");
		int finalPrice = (int)(price*0.9);
		System.out.println();
		System.out.print("���ұݾ��� "+d.format(finalPrice)+"�̰�, ");
		bonuspoint += price*bonusRatio;
		System.out.println("���ʽ� ����Ʈ�� "+bonuspoint+"�Դϴ�.");
		return finalPrice;
	}
}
