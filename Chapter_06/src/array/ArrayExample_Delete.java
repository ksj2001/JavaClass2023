package array;
import java.util.*;
public class ArrayExample_Delete {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {10, 20, 30, 40, 50};
		int cnt = 5;
		int menu;
		
		boolean run = true;
		while(run) {
			for(int i=0;i<cnt;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			System.out.println(Arrays.toString(arr));
			System.out.println();
			System.out.println("[2].����");
			System.out.println("[0].����");
			System.out.print("�޴� ���� : ");
			menu = scan.nextInt();
			switch(menu) {
			case 2:
				if(cnt<1) {
					System.out.println("�� �̻� ������ �� �����ϴ�.");
				}
				else {
					System.out.println("������ ���� �Է��ϼ���.");
					int data = scan.nextInt();
					
					int delIndex = -1; // ���� ���� ������ üũ�ϴ� Ű. -1�� ���� ������ ��Ÿ��
					for(int i=0;i<arr.length;i++) {
						if(arr[i]==data) {
							delIndex = i; // ���� ���� �����Ѵٴ� ��
						}
					}
					if(delIndex == -1) {
						System.out.println("�������� �ʴ� ���Դϴ�.");
						break;
					}
					else {
						for(int i=delIndex;i<cnt-1;i++) {
							arr[i] = arr[i+1];
						}
					}
					cnt--;
				}
				
				break;
			case 0:
				run = false;
				break;
			}
			
		}
	}
}
