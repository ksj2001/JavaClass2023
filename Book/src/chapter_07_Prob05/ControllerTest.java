package chapter_07_Prob05;

public class ControllerTest {

	public static void main(String[] args) {
		Controller[] c = { new TV(false), new Radio(true) };
		
		for(Controller controller : c) {
			controller.show();
		}
	}
}