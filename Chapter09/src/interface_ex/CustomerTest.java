package interface_ex;

public class CustomerTest {

	public static void main(String[] args) {
		// CustomerClass�� �����ϰ� �̸� buy�� ���� �� Buy�� �ڷ������� ��ȯ�Ͽ� �ִ´�. (��ĳ����) 
		Buy buy = new CustomerClass();
		buy.getBuy();
		
		Sell sell = new CustomerClass();
		sell.getSell();
		CustomerClass cust = new CustomerClass();
		cust.getBuy();
		cust.getSell();
		buy.customer();
		sell.customer();
		cust.customer();
		

	}

}
