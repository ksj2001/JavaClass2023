package bank;
import java.util.*;
public class DepoTrans {
	
	//�������
	Scanner scan = new Scanner(System.in);
	User user = new User();
	public int inputMoney = 0; // �Ա��� �ݾ�
	public String transferAcc = ""; // ��ü���� ���¹�ȣ
	public int transferLog = -1; // ��ü���� ���¹�ȣ�� ��ġ
	public int transferMoney = 0; // ��ü�� �ݾ�
	
	//�Լ�
	public void deposit() { // �Ա� �Լ�
		if(user.log==-1) {
			System.out.println(user.log);
			System.out.println("�α��� �� �̿� �����մϴ�.");
		}
		else {
			System.out.print("�Ա��� �ݾ��� �Է��ϼ��� : ");
			inputMoney = scan.nextInt();
			user.arMoney[user.log] += inputMoney; 
			System.out.println("�Ա��� �Ϸ��Ͽ����ϴ�.");
		}
	}
	
	public void transfer() { // ��ü �Լ�
		transferLog = -1; // ��ġ �ʱ�ȭ
		if(user.log==-1) {
			System.out.println("�α��� �� �̿� �����մϴ�.");
		}
		else {
			System.out.print("��ü�� ���¹�ȣ�� �Է��ϼ��� : ");
			transferAcc = scan.next();
			for(int i=0;i<user.arAcc.length;i++) {
				if(user.arAcc[i].equals(transferAcc)) {
					transferLog = i;
				}
			}
			if(transferLog==-1) {
				System.out.println("�������� �ʴ� ���¹�ȣ�Դϴ�.");
			}
			else {
				System.out.print("��ü�� �ݾ��� �Է��ϼ��� : ");
				transferMoney = scan.nextInt();
				if(transferMoney>user.arMoney[user.log]) {
					System.out.println("��ü�� �Ұ����մϴ�. (��ü�Ϸ��� �ݾ��� ���� �ܰ��� �� ����)");
				}
				else {
					System.out.println(transferLog);
					System.out.println(user.log);
					user.arMoney[transferLog] += transferMoney;
					user.arMoney[user.log] -= transferMoney;
					System.out.println("��ü�� �Ϸ��Ͽ����ϴ�.");
				}
			}
		}	
	}
}
