package bank;

import java.util.*;

public class User {
	
	//�������
	Scanner scan = new Scanner(System.in);
	String[] arAcc = {"1111","2222","3333","",""};
	String[] arPw = {"1234","2345","3456" ,"",""};
	static int[] arMoney = {87000,34000,17500,0,0};
	String signUpAcc = ""; // ȸ���������� �����Ϸ��� ID
	String signUpPw = ""; // ȸ���������� �����Ϸ��� PW
	String inputAcc = ""; // �α��� �Ϸ��� ID
	String inputPw = ""; // �α��� �Ϸ��� PW
	int cnt = 3; // ���� �����ͺ��̽��� �����ϴ� ������ ����
	static int log = -1; // �α��� Ȯ�ο� Ű�� (�αװ��� ������Ű�� ���� static ���)
	int overlap = 0; // �ߺ� Ȯ�� Ű��. -1�� �ߺ��ȴٴ� ���� ��Ÿ��
	
	//�Լ�
	public void signUp() { // ȸ������ �Լ�
		if(log!=-1) {
			System.out.println("�α׾ƿ� �� �̿��� �ֽʽÿ�.");
		}
		else {
			if(cnt>5) {
				System.out.println("�� �̻� ȸ�������� �Ұ����մϴ�. (�ִ� 5����� ���� ����)");
			}
			else {
				System.out.print("������ ���¹�ȣ�� �Է��ϼ��� : ");
				signUpAcc = scan.next();
				for(int i=0;i<arAcc.length;i++) {
					if(signUpAcc.equals(arAcc[i])) {
						overlap = -1;
					}
				}
				if(overlap==-1) {
					System.out.println("�ߺ��Ǵ� ���¹�ȣ�Դϴ�.");
				}
				else {
					System.out.print("�н����带 �Է��ϼ��� : ");
					signUpPw = scan.next();
					arAcc[cnt] = signUpAcc;
					arPw[cnt] = signUpPw;
					arMoney[cnt] = 1000;
					cnt++;
					System.out.println("ȸ�������� ���ϵ帳�ϴ�.");
				}
			}
		}
	}
	
	public void delete() { // ȸ��Ż�� �Լ�
		if(log==-1) {
			System.out.println("�α��� �� �̿� �����մϴ�.");
		}
		else {
			if(cnt<1) {
				System.out.println("�� �̻� ȸ��Ż�� �Ұ����մϴ�. (���� ���� ���� ȸ���� ����)");
			}
			else {
				for(int i=log;i<cnt-1;i++) {
					arAcc[i] = arAcc[i+1];
					arPw[i] = arPw[i+1];
					arMoney[i] = arMoney[i+1];
				}
				cnt--;
				log = -1;
				System.out.println("Ż��Ǿ����ϴ�. �ȳ������ʽÿ�.");
			}
		}
	}
	
	public int logIn() { // �α��� �Լ�
		if(log==-1) {
			System.out.print("���¹�ȣ�� �Է��ϼ��� : ");
			inputAcc = scan.next();
			System.out.print("��й�ȣ�� �Է��ϼ��� : ");
			inputPw = scan.next();
			for(int i=0;i<arAcc.length;i++) {
				if(inputAcc.equals(arAcc[i]) && inputPw.equals(arPw[i])) {
					log = i;
				}
			}
			if(log==-1) {
				System.out.println("���¹�ȣ�� �н����带 �ٽ� �� �� Ȯ�����ּ���.");
			}
			else {
				System.out.println("�α��� ����!");
			}
		}
		else {
			System.out.println("�̹� �α��� �� �����Դϴ�.");
		}
		System.out.println(log);
		return log;
	}
	
	public void logOut() { // �α׾ƿ� �Լ�
		if(log==-1) {
			System.out.println("�α��� �� �̿� �����մϴ�.");
		}
		else {
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
			log = -1;
		}
	}
}
