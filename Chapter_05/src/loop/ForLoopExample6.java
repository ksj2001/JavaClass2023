package loop;
import java.util.*;
public class ForLoopExample6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ȧ���� �Է��ϼ���: ");
		int num = scan.nextInt();
		if(num%2==0) {
			System.out.println("Ȧ���� �Էµ��� �ʾҽ��ϴ�.");
		}
		else {
			for(int i=1;i<=num;i++) { // ���� �ﰢ��
				for(int j=num;j>i;j--) {
					System.out.print(" ");
				}
				for(int k=1;k<=2*i-1;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=num-1;i>=1;i--) { // �Ʒ��� ���ﰢ�� (���� �ﰢ������ �� �� �� ���;� �ϹǷ� num-1)
				for(int j=num;j>i;j--) {
					System.out.print(" ");
				}
				for(int k=1;k<2*i;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		scan.close();
	}
}
