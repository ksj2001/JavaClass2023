package interface_ex;

public class CustomerClass implements Buy,Sell{

	@Override
	public void getSell() {
		System.out.println("�Ǹ� �Ϸ�");
	}

	@Override
	public void getBuy() {
		System.out.println("���� �Ϸ�");
	}
	
	public void customer() {
		System.out.println("�Һ���");
	}
}
