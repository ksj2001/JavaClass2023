package interface_ex;

public interface Sell {
	void getSell();
	default public void customer() {
		System.out.println("ÆÇ¸ÅÀÚ");
	}
}
