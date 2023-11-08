package chapter_06_Prob05;

public class PhoneTest {

	public static void main(String[] args) {
		Phone[] phones = { new Phone("황진이"), new Telephone("길동이", "내일"),
				new Smartphone("민국이", "갤러그") };
		
		for(int i=0;i<phones.length;i++) {
			if(phones[i] instanceof Smartphone) {
				((Smartphone)phones[i]).playGame();					
			}
			else if(phones[i] instanceof Telephone) {
				// (Telephone)phones[i].autoAnswering();
				((Telephone)phones[i]).autoAnswering();
			}
			else if(phones[i] instanceof Phone) {
				phones[i].talk();
			}
		}
	}
}
