package bit;

public class Binary {

	public static void main(String[] args) {

		int num = 10; // 10����
		int bnum = 0B1010; // 2����
		int onum = 012; // 8����
		int xnum = 0xA; // 16����
		System.out.println(num);
		System.out.println(bnum);
		System.out.println(onum);
		System.out.println(xnum);
		int su = 0B00000000000000000000000000001010;
		int su2 = 0B11111111111111111111111111110101;
		//1�� ����
		int su3 = 0B11111111111111111111111111110110;
		//2�� ���� *** �̰� �� ����? ***
		System.out.println(su);
		System.out.println(su3);
		System.out.println(su+su3);
		//������ �� �� ���� ���� 1, ����� ���� 0
		int su4 = 0B1011;
		System.out.println(su4);
		// *** �̰� �տ� 1�� �ִµ��� �� ������ �ƴ��� ***
		int su5 = 0B10000000000000000000000000000000;
		System.out.println(su5);
		// *** int�� 4����Ʈ(32��Ʈ)����?? ***
		
	}

}
