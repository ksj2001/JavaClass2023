package interface_ex;

public class CustomerClass implements Buy,Sell{

	@Override
	public void getSell() {
		System.out.println("판매 완료");
	}

	@Override
	public void getBuy() {
		System.out.println("구매 완료");
	}
	
	public void customer() {
		System.out.println("소비자");
	}
}
