package classpart06;
import java.util.*;
public class ClassEx06 {
	Scanner scan = new Scanner(System.in);
	//�������
	int[] arPrice = {2500,3800,1500,1000};
	String[] arMenu = {"ġ�����  ","�Ұ�����","����Ƣ��  ","��      ��"};
	int[] arCount = new int[4];
	int total = 0;
	int menu = 0;
	int input = 0; // ���� �ݾ�
	boolean run = true; // �ݺ����� ���
	
	//�޼���
	public void selectMenu() {
		while(run) {
			System.out.println("    [������ġ �ܹ���]    ");
			for(int i=0;i<arMenu.length;i++) {
				System.out.println((i+1)+"."+arMenu[i]+"\t"+arPrice[i]+"��");
			}
			System.out.println("----------------------");
			System.out.println("5.�ֹ��ϱ�");
			System.out.print("�޴� ���� : ");
			menu = scan.nextInt();
			if(menu>=1 && menu<=4) {
				for(int i=0;i<arCount.length;i++) {
					if(i==(menu-1)) {
						arCount[i]++;
						total += arPrice[i];
					}
				}
			}
			else if(menu==5) {
				System.out.print("�� �ݾ��� "+total+"�� �Դϴ�.���� �Է��ϼ��� : ");
				input = scan.nextInt();
				if(input<total) {
					System.out.println("���� �����մϴ�.");
					continue;
				}
				else {
					System.out.println();
					System.out.println("\t������ġ");
					System.out.println("----------------------");
					System.out.println("ITEM\tQTY\tAMT");
					for(int i=0;i<arMenu.length;i++) {
						System.out.println(arMenu[i]+"   "+arCount[i]+"\t"+arCount[i]*arPrice[i]);
					}
					System.out.println("----------------------");
					System.out.println("�հ�ݾ�\t"+total);
					System.out.println("�հ�ݾ�\t"+input);
					System.out.println("----------------------");
					System.out.println("��\t��      "+(input-total));
					run = false;
				}
			}
		}
	}
}
