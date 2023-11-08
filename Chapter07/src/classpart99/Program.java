package classpart99;
import java.util.*;
public class Program {
	Scanner scan = new Scanner(System.in);
	//�������
	public String[] ids;
	public String[] pws;
	public String[] items;
	public int MAX_SIZE;
	public int[][] jang;
	public int menu;
	public boolean run;
	public String inputId; // �Է��� ID
	public String inputPw; // �Է��� PW
	public String currentStatus = new String("�α׾ƿ�"); // ���� ���� (�ʱⰪ: �α׾ƿ�)
	public int log; // �α��� ȸ���� �ε��� ��ȣ (-1�� ��� ���̵�/��й�ȣ ����ġ)
	public int productNum; // ��ǰ��ȣ
	public boolean run_product; // ������ �������� �� ��ǰ��ȣ �Է� �ݺ� key
	public int cnt; // ������ ��ٱ��� �迭�� ����
	public int[] bag1;
	public int[] bag2;
	public int[] bag3;

	//�޼���
	public void selectMenu() {
		while(run) {
			System.out.println("------------");
			System.out.println("���� : "+currentStatus);
			System.out.println("------------");
			System.out.println("[MEGA MART]");
			System.out.println("[1]�α���");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]����");
			System.out.println("[4]��ٱ���");
			System.out.println("[0]����");
			System.out.print("�޴� ���� : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				logIn();
				break;
			case 2:
				logOut();
				break;
			case 3:
				shopping();
				break;
			case 4:
				bag();
				break;
			case 0:
				end();
				break;
			}
		}
	}

	public void logIn() {
		if(currentStatus.equals("�α׾ƿ�")) {
			System.out.print("ID�Է� : ");
			inputId = scan.next();
			System.out.print("PW�Է� : ");
			inputPw = scan.next();
			for(int i=0;i<ids.length;i++) {
				if(ids[i].equals(inputId)&&pws[i].equals(inputPw)) {
					System.out.println(ids[i]+"��, ȯ���մϴ�.");
					currentStatus = ids[i]+" �α���";
					log = i;
					run_product = true;
				}
			}
			if(log==-1) {
				System.out.println("ID�� PW�� Ȯ�����ּ���.");
			}
		}
		else {
			System.out.println("�̹� �α��� �� �����Դϴ�.");
		}
	}

	public void logOut() {
		if(currentStatus.equals("�α׾ƿ�")) {
			System.out.println("�α��� �� �̿� �����մϴ�.");
		}
		else {
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
			currentStatus = "�α׾ƿ�";
			log = -1;
			jang = new int [MAX_SIZE][2];
			cnt = 0;
		}
	}

	public void shopping() {
		if(currentStatus.equals("�α׾ƿ�")) {
			System.out.println("�α��� �� �̿� �����մϴ�.");
		}
		else {
			while(run_product) {
				System.out.println("[��ǰ���]");
				System.out.println("[1]���");
				System.out.println("[2]�ٳ���");
				System.out.println("[3]����");
				System.out.println("[4]�ڷΰ���");
				System.out.print("��ǰ��ȣ�� �����ϼ��� : ");
				productNum = scan.nextInt();
				switch(productNum) {
				case 1:
					if(cnt>=MAX_SIZE) {
						System.out.println("�� �̻� �߰��� �� �����ϴ�.");
						continue; // skip �ؼ� while������ �ٽ� ��
					}
					else {
						jang[cnt][0] = log;
						jang[cnt][1] = 0;
						cnt++;
					}
					break;
				case 2:
					if(cnt>=MAX_SIZE) {
						System.out.println("�� �̻� �߰��� �� �����ϴ�.");
						continue; // skip �ؼ� while������ �ٽ� ��
					}
					else {
						jang[cnt][0] = log;
						jang[cnt][1] = 1;
						cnt++;
					}
					break;
				case 3:
					if(cnt>=MAX_SIZE) {
						System.out.println("�� �̻� �߰��� �� �����ϴ�.");
						continue; // skip �ؼ� while������ �ٽ� ��
					}
					else {
						jang[cnt][0] = log;
						jang[cnt][1] = 2;
						cnt++;
					}
					break;
				case 4:
					run_product = false;
					break;
				}
			}
		}
	}

	public void bag() {
		if(currentStatus.equals("�α׾ƿ�")) {
			System.out.println("�α��� �� �̿� �����մϴ�.");
		}
		else {
			if(log==0) {
				for(int i=0;i<cnt;i++) {
					if(jang[i][1]==0) {
						bag1[0]++;
					}
					else if(jang[i][1]==1) {
						bag1[1]++;
					}
					else if(jang[i][1]==2) {
						bag1[2]++;
					}
				}
				System.out.println("��� : "+bag1[0]+"��");
				System.out.println("�ٳ��� : "+bag1[1]+"��");
				System.out.println("���� : "+bag1[2]+"��");
			}
			else if(log==1) {
				for(int i=0;i<cnt;i++) {
					if(jang[i][1]==0) {
						bag2[0]++;
					}
					else if(jang[i][1]==1) {
						bag2[1]++;
					}
					else if(jang[i][1]==2) {
						bag2[2]++;
					}
				}
				System.out.println("��� : "+bag2[0]+"��");
				System.out.println("�ٳ��� : "+bag2[1]+"��");
				System.out.println("���� : "+bag2[2]+"��");
			}
			else if(log==2) {
				for(int i=0;i<cnt;i++) {
					if(jang[i][1]==0) {
						bag3[0]++;
					}
					else if(jang[i][1]==1) {
						bag3[1]++;
					}
					else if(jang[i][1]==2) {
						bag3[2]++;
					}
				}
				System.out.println("��� : "+bag3[0]+"��");
				System.out.println("�ٳ��� : "+bag3[1]+"��");
				System.out.println("���� : "+bag3[2]+"��");
			}
		}
	}

	public void end() {
		System.out.println("���α׷� ����");
		run = false;
	}
}


