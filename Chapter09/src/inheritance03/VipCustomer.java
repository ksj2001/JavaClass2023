package inheritance03;

import java.text.*;

public class VipCustomer extends Customer{
	private int vipNum;
	
	public int getVipNum() {
		return vipNum;
	}
	public void setVipNum(int vipNum) {
		this.vipNum = vipNum;
	}
	
	public VipCustomer() {}
	public VipCustomer(int customerID, String customerName, int bonuspoint, int vipNum) {
		super.customerID = customerID;
		super.customerName = customerName;
		super.bonuspoint = bonuspoint;
		this.vipNum = vipNum;
		customerGrade = "VIP";
		bonusRatio = 0.05;
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
	
	@Override
	public void showCustomerInfo() {
		super.showCustomerInfo();
		System.out.println(" ��� ���� ����� "+vipNum+"���Դϴ�.");
	}
}
