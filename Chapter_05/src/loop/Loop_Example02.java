package loop;

public class Loop_Example02 {
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 1;
		int result = 0;
		
		while(num1<=9) {
			num2 = 1; // �ʱⰪ num2�� while�� �ȿ� �־�� �� ��° while���� num2=1�� �ٽ� �ʱ�ȭ�ż� 1���� 9���� ������ ������ �� �ֱ� ���� 
			while(num2<=9) {
				result = num1*num2;
				System.out.println(num1+" ���ϱ� "+num2+"�� "+result);
				num2++; // num2 = 2;
			}
			System.out.println();
			num1++;
			System.out.println(num1);
			System.out.println(num2);
		}
		
	}
}
