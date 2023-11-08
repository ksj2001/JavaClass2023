package chapter_04_Prob08;

public class Dice {
	double num = Math.random() * 6 ;
	
	public int roll() {
		switch((int)num % 6) {
		case 0:
			return 1;
		case 1:
			return 2;
		case 2:
			return 3;
		case 3:
			return 4;
		case 4:
			return 5;
		case 5:
			return 6;
		default:
			return 0;
		}
	}
}
