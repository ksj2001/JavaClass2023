package chapter_04;

public class Ifexample {
	public static void main(String[] args) {
		int age = 9;
		int charge = 0;
		String group = "";
		
		if(age<8) {
			group = "취학 전 아동";
			charge = 1000;
		}
		else if(age<14) {
			group = "초등학생";
			charge = 2000;
		}
		else if(age<20) {
			group = "중,고등학생";
			charge = 2500;
		}
		else {
			group = "일반인";
			charge = 3000;
		}
		
		System.out.println(
		 "\""+group+"입니다.\", \"입장료는 "
		+charge+"원 입니다.\"");
	}
}
