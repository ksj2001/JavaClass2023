package abstracttest02;

public class MainClass {

	public static void main(String[] args) {
		Bank bank = new MyBank();
		
		System.out.println("=== Bank constructor ===");
		bank.deposit();
		bank.withdraw();
		bank.installmentSavings();
		bank.cancellation();
		System.out.println();
		
		System.out.println("=== ���� ������� ===");
		bank.getInfo();

	}

}
