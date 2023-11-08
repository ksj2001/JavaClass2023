package abstracttest02;

public abstract class Bank {
	protected String name; // 예금자
	protected String account; // 계좌번호
	protected int totalAmount; // 예금액
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public abstract void deposit(); // 예금
	public abstract void withdraw(); // 출금
	public abstract void installmentSavings(); // 적금
	public abstract void cancellation(); // 해약
	public abstract void getInfo(); // 정보출력
}

