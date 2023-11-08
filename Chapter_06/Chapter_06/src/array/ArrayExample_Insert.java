package array;
import java.util.*;
public class ArrayExample_Insert {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {10, 20, 0, 0, 0};
		int cnt = 2;
		int menu;
		
		boolean run = true;
		while(run) {
			for(int i=0;i<cnt;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			System.out.println("[3].����");
			System.out.println("[0].����");
			System.out.print("�޴� ���� : ");
			menu = scan.nextInt();
			switch(menu) {
			case 3:
				if(cnt>=5) {
					System.out.println("�� �̻� ������ �� �����ϴ�.");
					continue;
				}
				System.out.print("������ ��ġ�� �Է��ϼ��� : ");
				int index = scan.nextInt();
				if(index<0 || index>cnt) {
					System.out.println("�� ��ġ�� ������ �� �����ϴ�.");
					continue;
				}
				System.out.print("������ ���� �Է��ϼ��� : ");
				int data = scan.nextInt();
				for(int i=cnt;i>index;i--) {
					arr[i] = arr[i-1];	
				}
				arr[index] = data;
				cnt++;
				break;
			case 0:
				run = false;
				break;
			}
			
		}
	}
}
