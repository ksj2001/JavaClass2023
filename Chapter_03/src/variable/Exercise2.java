package variable;

public class Exercise2 {

	public static void main(String[] args) {
		//����1
		int sal = 100;
		double asal = sal*0.9*12;
		System.out.println(asal);
		//����2
		int money = 1850;
		int cheonwon = money/1000;
		int baekwon = (money%1000)/100;
		int ohsibwon = ((money%1000)%100)/50;
		System.out.println("1000��: "+cheonwon
				+", 100��: "+baekwon
				+", 50��: "+ohsibwon);
	}

}
