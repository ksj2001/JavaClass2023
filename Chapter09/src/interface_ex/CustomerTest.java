package interface_ex;

public class CustomerTest {

	public static void main(String[] args) {
		// CustomerClass를 생성하고 이를 buy에 넣을 때 Buy의 자료형으로 변환하여 넣는다. (업캐스팅) 
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
