package classpart11;

public class ClassEx11 {
	String name;
	static int atm = 0; // 인스턴스의 종류가 다를 때 static이라는 레퍼런스에 들어있는 값을 공유한다
	 // int atm = 0; 인스턴스의 종류가 달라도 atm의 초기값은 늘 0으로 사용
	public ClassEx11(String name) {
		this.name = name;
	}
	
	public void saveMoney(int money) {
		atm += money;
		System.out.println("atm = "+atm);
	}
	public void transMoney(int money) {
		atm -= money;
		System.out.println("atm = "+atm);
	}
	public void getInfo() {
		System.out.println(this.name+" = "+atm);
	}
}
