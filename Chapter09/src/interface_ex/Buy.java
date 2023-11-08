package interface_ex;

public interface Buy {
	void getBuy();
	default public void customer() {
		System.out.println("±¸¸ÅÀÚ");
	}
}
