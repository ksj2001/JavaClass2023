package array;
import java.util.*;
public class ArrayExample_Addition {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {10, 20, 0, 0, 0};
		int cnt = 2;
		int menu;
		
		boolean run = true;
		while(run) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			System.out.println("[1].�߰�");
			System.out.println("[0].����");
			System.out.print("�޴� ���� : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				if(cnt>=5) {
					System.out.println("�� �̻� �߰��� �� �����ϴ�.");
					continue; // skip �ؼ� while������ �ٽ� ��
				}
				else {
					System.out.println("�߰��� ���� �Է��ϼ���.");
					int data = scan.nextInt();
					arr[cnt] = data;
					cnt++;
				}
				
				break;
			case 0:
				run = false;
				break;
			}
		}
	}
}
