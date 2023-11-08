package abstracttest02;

public abstract class Bank {
	protected String name; // ������
	protected String account; // ���¹�ȣ
	protected int totalAmount; // ���ݾ�
	
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
	
	public abstract void deposit(); // ����
	public abstract void withdraw(); // ���
	public abstract void installmentSavings(); // ����
	public abstract void cancellation(); // �ؾ�
	public abstract void getInfo(); // �������
}

