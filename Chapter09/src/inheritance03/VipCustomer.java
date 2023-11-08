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
		DecimalFormat d = new DecimalFormat("#,###원");
		int finalPrice = (int)(price*0.9);
		System.out.println();
		System.out.print("지불금액은 "+d.format(finalPrice)+"이고, ");
		bonuspoint += price*bonusRatio;
		System.out.println("보너스 포인트는 "+bonuspoint+"입니다.");
		return finalPrice;
	}
	
	@Override
	public void showCustomerInfo() {
		super.showCustomerInfo();
		System.out.println(" 담당 전문 상담은 "+vipNum+"번입니다.");
	}
}
