package array;
import java.util.*;
public class ArrayExample_ATM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] accs = {1001,1002,0,0,0};
		int[] pws = {1111,2222,0,0,0};
		int cnt = 2;
		boolean run = true; 
		while(run) {
			for(int i=0;i<cnt;i++) {
				System.out.println((i+1)+"."+accs[i]+":"+pws[i]);
			}
			System.out.println();
			System.out.println("1.����");
			System.out.println("2.Ż��");
			System.out.print("�޴� ���� : ");
			int menu = scan.nextInt();
			switch(menu) {
			case 1:
				if(cnt>=5) {
					System.out.println("�� �̻� ������ �� �����ϴ�.");
					continue;
				}
				else {
					System.out.print("[����]���¹�ȣ �Է� : ");
					int input_acc = scan.nextInt();
					
					int confirmAcc = -1; // ���¹�ȣ �ߺ� Ȯ�� Ű
					for(int i=0;i<accs.length;i++) {
						if(accs[i]==input_acc) {
							confirmAcc = i;
						}
					}
					if(confirmAcc!=-1) {
						System.out.println("���¹�ȣ�� �ߺ��˴ϴ�.");
						continue;
					}
					else {
						System.out.print("[����]��й�ȣ �Է� : ");
						int input_pw = scan.nextInt();
						accs[cnt] = input_acc;
						pws[cnt] = input_pw;
						cnt++;
					}
				}
				break;
			case 2:
				if(cnt<0) {
					System.out.println("�� �̻� Ż���� �� �����ϴ�.");
					break;
				}
				else {
					System.out.print("[Ż��]���¹�ȣ �Է� : ");
					int input_acc = scan.nextInt();
					int confirmAcc = -1; // ���¹�ȣ ���� ���� Ȯ�� Ű
					for(int i=0;i<accs.length;i++) {
						if(accs[i]==input_acc) {
							confirmAcc = i;
						}
					}
					if(confirmAcc==-1) {
						System.out.println("�������� �ʴ� ���¹�ȣ�Դϴ�.");
						break;
					}
					else{
						for(int i=confirmAcc;i<cnt-1;i++) {
							accs[i]=accs[i+1];
							pws[i]=pws[i+1];
							cnt--;
						}
					}
				}
				break;
			}		
		}
		
		// break�� ���� ������ �����ϸ� for�� �ٱ����� ������
		// �׷��Ƿ� ���� ��µǴ� ���� �ƹ��͵� ����.
		/*for(int i=1;i<6;i++) {
			if(i % 2 == 1) {
				break;
			}
			System.out.println(i);
		}*/
		
		// continue�� ���� ������ �����ϸ� for�� �������� �б��Ѵ�
		// �׷��Ƿ� ���� ��µǴ� ���� ¦���� 2�� 4�̴�.
		/*for(int i=1;i<6;i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}*/
		scan.close();
	}
}
