package classpart07_re;
import java.util.*;
public class ClassEx07 {
	Scanner scan = new Scanner(System.in);
	// �������
	// ���� �� ��������� ������ ���������ڸ� �Է��Ͽ� �ڵ��� ������ �ϼ���
	
	private String[]arAcc = {"1111","2222","3333","4444","5555"};
	private String[]arPw = {"1234","2345","3456","4567","5678"};
	public int[] arMoney = {87000,34000,17500,98000,12500};
	public int count = 5;
	public int menu = -1;
	public boolean run = true;
	private String signUpAcc = ""; // ȸ���������� �����Ϸ��� ID
	private String signUpPw = ""; // ȸ������ �����Ϸ��� PW
	public int signUpMoney = 1000; // ȸ���������� �־����� �⺻ ���±ݾ�
	public int cnt = 5; // ���̵�, ��й�ȣ, ���� ���� ����
	private String inputAcc = ""; // �α��� �Ϸ��� ID
	private String inputPw = ""; // �α��� �Ϸ��� PW
	public int inputMoney = 0; // �Ա��� �ݾ�
	public String transferAcc = ""; // ��ü���� ���¹�ȣ
	public int transferLog = -1; // ��ü���� ���¹�ȣ�� ��ġ
	public int transferMoney = 0; // ��ü�� �ݾ�
	public int overlap = 0; // �ߺ� Ȯ�� Ű��. -1�� �ߺ��ȴٴ� ���� ��Ÿ��

	public String[] getArAcc() {
		return arAcc;
	}
	public void setArAcc(String[] arAcc) {
		this.arAcc = arAcc;
	}
	public String[] getArPw() {
		return arPw;
	}
	public void setArPw(String[] arPw) {
		this.arPw = arPw;
	}
	public String getSignUpAcc() {
		return signUpAcc;
	}
	public void setSignUpAcc(String signUpAcc) {
		this.signUpAcc = signUpAcc;
	}
	public String getSignUpPw() {
		return signUpPw;
	}
	public void setSignUpPw(String signUpPw) {
		this.signUpPw = signUpPw;
	}
	public String getInputAcc() {
		return inputAcc;
	}
	public void setInputAcc(String inputAcc) {
		this.inputAcc = inputAcc;
	}
	public String getInputPw() {
		return inputPw;
	}
	public void setInputPw(String inputPw) {
		this.inputPw = inputPw;
	}
	//--------------------------------------------------------------------------------------------
	// 3333 �α��� ��
	int loginCheck = 2;
	String currentStatus = arAcc[loginCheck]+" �α���";

	//������
	public void menu() { // �޴� �Լ�
		while(run) {
			System.out.println("-------------------------");
			System.out.println("���¹�ȣ   ��й�ȣ   �����ܾ�");
			System.out.println("-------------------------");
			for(int i=0;i<cnt;i++) {
				System.out.println(arAcc[i]+"    "+arPw[i]+"    "+arMoney[i]);
			}
			System.out.println("-------------------------");
			System.out.println("���� : "+currentStatus);
			System.out.println("-------------------------");
			System.out.println("[Mega Bank]");
			System.out.println("[1]ȸ������");
			System.out.println("[2]ȸ��Ż��");
			System.out.println("[3]�α���");
			System.out.println("[4]�α׾ƿ�");
			System.out.println("[5]�Ա��ϱ�");
			System.out.println("[6]��ü�ϱ�");
			System.out.println("[7]�ܾ���ȸ");
			System.out.println("[0]�����ϱ�");
			System.out.print("�޴� ���� : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				signUp();
				break;
			case 2:
				delete();
				break;
			case 3:
				logIn();
				break;
			case 4:
				logOut();
				break;
			case 5:
				deposit();
				break;
			case 6:
				transfer();
				break;
			case 7:
				check();
				break;
			case 0:
				end();
				break;
			}	
		}
	}
	//�޼���
	public void signUp() {
		overlap = 0; // �ߺ��� Ű �ʱ�ȭ
		System.out.print("���¹�ȣ�� �Է��ϼ��� : ");
		signUpAcc = scan.next();
		for(int i=0;i<arAcc.length;i++) {
			if(signUpAcc.equals(arAcc[i])) { // ���¹�ȣ �迭 �߿� �����Ϸ��� ID�� ���� ���� ���� ���
				System.out.println("�ߺ��Ǵ� ���¹�ȣ �Դϴ�.");
				overlap = -1;
			}	
		}
		if(overlap!=-1) { // �ߺ����� �ʾ��� ���
			System.out.print("��й�ȣ�� �Է��ϼ��� : ");
			signUpPw = scan.next();
			String[] newArAcc = new String[arAcc.length + 1]; // ���¹�ȣ �迭 ���� �÷��ֱ�
			for (int i = 0; i < arAcc.length; i++) {
				newArAcc[i] = arAcc[i];
				arAcc[i] = newArAcc[i];
			}
			String[] newArPw = new String[arPw.length + 1]; // ��й�ȣ �迭 ���� �÷��ֱ�
			for (int i = 0; i < arPw.length; i++) {
				newArPw[i] = arPw[i];
				arPw[i] = newArPw[i];
			}
			int[] newArMoney = new int[arMoney.length + 1]; // ���±ݾ� �迭 ���� �÷��ֱ�
			for (int i = 0; i < arMoney.length; i++) {
				newArMoney[i] = arMoney[i];
				arMoney[i] = newArMoney[i];
			}
			//�迭�� �÷��ִ� �Ϳ������� ����
			arAcc[cnt] = signUpAcc;
			arPw[cnt] = signUpPw;
			arMoney[cnt] = signUpMoney;
			cnt++;
		}	
	}
	public void delete() {
		if(loginCheck==-1) {
			System.out.println("�α��� �� �̿� �����մϴ�.");
		}
		else {
			System.out.println("Ż��Ǿ����ϴ�. �ȳ������ʽÿ�.");
			for(int i=loginCheck;i<cnt-1;i++) {
				arAcc[i] = arAcc[i+1];
				arPw[i] = arPw[i+1];
				arMoney[i] = arMoney[i+1];
			}
			cnt--;
			loginCheck = -1;
			System.out.println("�������"+cnt);
			currentStatus = "�α׾ƿ�";
		}
	}
	public void logIn() {
		if(loginCheck==-1) {
			System.out.print("ID�Է� : ");
			inputAcc = scan.next();
			System.out.print("PW�Է� : ");
			inputPw = scan.next();
			for(int i=0;i<arAcc.length;i++) {
				if(arAcc[i].equals(inputAcc)&&arPw[i].equals(inputPw)) {
					System.out.println(arAcc[i]+"��, ȯ���մϴ�.");
					loginCheck = i;
					currentStatus = arAcc[loginCheck]+" �α���";
				}
			}
			if(loginCheck==-1) {
				System.out.println("ID�� PW�� Ȯ�����ּ���.");
			}
		}
		else {
			System.out.println("�̹� �α��� �� �����Դϴ�.");
		}
	}
	
	public void logOut() {
		if(loginCheck==-1) {
			System.out.println("�α��� �� �̿� �����մϴ�.");
		}
		else {
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
			loginCheck = -1;
			currentStatus = "�α׾ƿ�";
		}
	}
	
	public void deposit() { // �Ա��ϱ� �Լ�
		if(loginCheck==-1) {
			System.out.println("�α��� �� �̿� �����մϴ�.");
		}
		else {
			System.out.print("�Ա��� �ݾ��� �Է��ϼ��� : ");
			inputMoney = scan.nextInt();
			arMoney[loginCheck] += inputMoney;		
		}
	}
	public void transfer() { // ��ü�ϱ� �Լ�
		if(loginCheck==-1) {
			System.out.println("�α��� �� �̿� �����մϴ�.");
		}
		else {
			System.out.print("��ü�� ���¹�ȣ�� �Է��ϼ��� : ");
			transferAcc = scan.next();
			for(int i=0;i<cnt;i++) {
				if(transferAcc.equals(arAcc[i])) {
					transferLog = i;
				}
			}
			if(transferLog == -1) {
				System.out.println("��ȿ���� ���� ���¹�ȣ�Դϴ�.");
			}
			else {
				System.out.print("��ü�� �ݾ��� �Է��ϼ��� : ");
				transferMoney = scan.nextInt();
				if(transferMoney>arMoney[loginCheck]) {
					System.out.println("�ܾ��� �����մϴ�.");
				}
				else {
					System.out.println(loginCheck+""+transferLog);
					arMoney[loginCheck] -= transferMoney;
					arMoney[transferLog] += transferMoney;
				}	
			}		
		}
	}
	public void check() { // �ܾ���ȸ �Լ�
		if(loginCheck==-1) {
			System.out.println("�α��� �� �̿� �����մϴ�.");
		}
		else {
			System.out.println("���¹�ȣ: "+arAcc[loginCheck]);
			System.out.println("���� �ܾ�: "+arMoney[loginCheck]);
		}
	}
	public void end() { // �����ϱ� �Լ�
		System.out.println("���α׷� ����");
		run = false;
	}
}
