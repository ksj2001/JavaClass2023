package variable;

public class Operator {

	public static void main(String[] args) {
		int num = 10;
		int mathnum = ++num;
		System.out.println(mathnum);
		System.out.println(num);
		System.out.println();
		int mathnum2 = num++;
		System.out.println(mathnum2);
		System.out.println(num);
		//i = ++num : num���� +1 ���� i�� num���� ����
		//i = num++ : i�� num���� ���� ���� num���� +1
		
		System.out.println((5>3) && (3>10)); // �� �� �ϳ��� Ʋ���� false
		System.out.println((5>3) || (3>10)); // �� �� �ϳ��� �¾Ƶ� true
		System.out.println(!(5>3));
		// ���ǽ��� true�� false, false�̸� true ���
	}

}
