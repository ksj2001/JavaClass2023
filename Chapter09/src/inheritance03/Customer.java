package inheritance03;

import java.text.*;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonuspoint;
	protected double bonusRatio;
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getBonuspoint() {
		return bonuspoint;
	}
	public void setBonuspoint(int bonuspoint) {
		this.bonuspoint = bonuspoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	public Customer() {}
	public Customer(int customerID, String customerName, int bonuspoint) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.bonuspoint = bonuspoint;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		DecimalFormat d = new DecimalFormat("#,###원");
		int finalPrice = price;
		System.out.println();
		System.out.print("지불금액은 "+d.format(finalPrice)+"이며, ");
		bonuspoint += price*bonusRatio;
		System.out.println("보너스 포인트는 "+bonuspoint+"입니다.");
		return finalPrice;
	}
	
	public void showCustomerInfo() {
		System.out.print(customerName+"님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonuspoint+"입니다.");
	}
}
