package megamart;

public class Basket {
	// ��� ����
	int[] price = {1500,2500,3000,4000,5000};
	String[] item = {"����","��ġ","����","��ġ","����"};
	int[][] cart = new int [100][3];
	
	//�Լ�
	
	//�߰�
	public void initialize() { // cart �迭�� �ʱⰪ ����
		for(int i=0;i<item.length;i++) {
			cart[i][0] = i;
		}
		
		for(int i=0;i<item.length;i++) {
			cart[i][1] = price[i];
		}
		
		for(int i=0;i<item.length;i++) {
			cart[i][2] = 0;
		}
	}
	//�߰�
	
	public void count(int n) { // ������ ��ǰ�� ���� �Լ�
		cart[n][2] += 1;
	}
	
	public void basket() { // ��ٱ��� ��� �Լ�
		System.out.println("-------------------");
		System.out.println("ǰ��    �ܰ�    ����  ");
		System.out.println("-------------------");
		for(int i=0;i<item.length;i++) {
			if(cart[i][2]!=0)
			System.out.println(item[cart[i][0]]+":\t"+cart[i][1]+"��\t"+cart[i][2]+"��");
		}
	}
}
