package loop;

public class Loop_Example03 {
	public static void main(String[] args) {
		int num1 = 1;
		int sum1 = 0;
		int count1 = 0;
		while(num1<=10) {
			if(num1>=5 && num1<=9) {
				sum1 += num1;
				count1++;
				System.out.print(num1+" ");
			}
			num1++;
		}
		System.out.println();
		System.out.println(sum1);
		System.out.println(count1);
		System.out.println();
		int num2 = 10;
		while(num2>=1) {
			if(num2>=3 && num2<=6) {
				System.out.print(num2+" ");
			}
			num2--;
		}
		System.out.println();
		int num3 = 1;
		while(num3<=10) {
			if(num3 % 2 == 0) {
				System.out.print(num3+" ");
			}
			num3++;
		}
	}
}
