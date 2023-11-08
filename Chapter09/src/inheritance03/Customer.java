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
		DecimalFormat d = new DecimalFormat("#,###��");
		int finalPrice = price;
		System.out.println();
		System.out.print("���ұݾ��� "+d.format(finalPrice)+"�̸�, ");
		bonuspoint += price*bonusRatio;
		System.out.println("���ʽ� ����Ʈ�� "+bonuspoint+"�Դϴ�.");
		return finalPrice;
	}
	
	public void showCustomerInfo() {
		System.out.print(customerName+"���� ����� "+customerGrade+"�̸�, ���ʽ� ����Ʈ�� "+bonuspoint+"�Դϴ�.");
	}
}
