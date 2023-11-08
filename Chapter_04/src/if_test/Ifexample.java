package if_test;

public class Ifexample {

	public static void main(String[] args) {
		int age = 30;
		int charge = 0;
		String name;
		if (age<8) {
			name = "취학 전 아동";
			charge = 1000;
		}
		else if (age<14) {
			name = "초등학생";
			charge = 2000;
		}
		else if (age<14) {
			name = "중,고등학생";
			charge = 2500;
		}
		else {
			name = "일반인";
			charge = 3000;
		}
		System.out.println(name+"입니다.");
		System.out.println("입장료는 "+charge+"원 입니다.");
	}
}
