package abstracttest02;

public class MyBank extends Bank{

	@Override
	public void deposit() {
		System.out.println("-- deposit() START --");
	}

	@Override
	public void withdraw() {
		System.out.println("-- withdraw() START --");
	}

	@Override
	public void installmentSavings() {
		System.out.println("-- installmentSavings() START --");
	}

	@Override
	public void cancellation() {
		System.out.println("-- cancellation() START --");
	}

	@Override
	public void getInfo() {
		super.name = "¹ÚÂùÈ£";
		super.account = "1234-123";
		super.totalAmount = 10000;
		
		System.out.println("name : " + name);
		System.out.println("account : " + account);
		System.out.println("totalAmount : " + totalAmount);
	}

}