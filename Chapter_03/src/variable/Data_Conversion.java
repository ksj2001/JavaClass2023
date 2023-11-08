package variable;

public class Data_Conversion {

	public static void main(String[] args) {
		double pi = 3.14;
		int pi2 = (int)pi;
		System.out.println(pi + " " + pi2);
		//명시적 형변환
		//(더 정밀한 수에서 덜 정밀한 수로, 큰 수에서 작은 수로)
		int s = 10;
		double b = s;
		System.out.println(b);
		//묵시적 형변환
		//(덜 정밀한 수에서 더 정밀한 수로, 작은 수에서 큰 수로)
	}

}
