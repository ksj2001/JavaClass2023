package chapter_04_Prob07;

public class GolfClub {
	int number = 7;
	String type = "���̾�";
	
	public GolfClub() {
		
	}
	
	public GolfClub(int number) {
		this.number = number;
	}
	
	public GolfClub(String type) {
		this.type = type;
		number = 0;
	}
	
	public void print() {
		if(number == 0) 
			System.out.println(type+"�Դϴ�.");
		else
			System.out.println(number+"�� "+type+"�Դϴ�.");		
	}
}
