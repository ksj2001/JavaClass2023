package chapter_06;
import java.util.*;
public class ArrayExample08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] seat = new String[7]; // �¼�
		int total = 0; // �� �����
		boolean run = true;
		int menu; // ������ �޴�
		int index; // ������ �¼���ȣ
		for(int i=0;i<7;i++)  {
			seat[i] = " ";
		}
		
		while(run) {
			for(int i=0;i<7;i++) {
				System.out.print("["+seat[i]+"]"); // �¼� ��ġ
			}
			System.out.println();
			System.out.println("=�ް� ��ȭ��=");
			System.out.println("1.�¼�����");
			System.out.println("2.����");
			System.out.print("�޴� ���� : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.print("�¼���ȣ ����[1~7] : ");
				index = scan.nextInt();
				if(index>=1 && index<=7) {
					if(seat[index-1] == "O") {
						System.out.println("�̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.");
					}
					else {
						seat[index-1] = "O";
						total += 12000;
					}
				}
				else {
					System.out.println("�߸��� ��ȣ�Դϴ�.");
				}	
				break;
			case 2:
				System.out.println("����� = "+total+"��");
				run = false;
				break;
			default:
				System.out.println("������ �� ���� �޴��Դϴ�.");
				break;
			}
		}
		
		scan.close();
	}
}
