package megamart;
import java.util.*;
public class User {
	Scanner scan = new Scanner(System.in);
	// ��� ����
	String[]id = {"qwer","javaking","abcd","kjb","ckr"};
	String[]pw = {"1111","2222","3333","5555","6666"};
	String inputId = null;
	String inputPw = null;
	int log = -1; // �α��� Ȯ�ο� Ű��
	//�Լ�
	public void logIn() { // �α��� �Լ�
		if(log != -1) { // �α��� Ű���� -1�� �ƴϸ� �̹� �α��εǾ��ٴ� ��
			System.out.println("�̹� �α��εǾ� �ֽ��ϴ�.");
		}
		else {
			System.out.print("ID�Է�: ");
			inputId = scan.next();
			System.out.print("PW�Է�: ");
			inputPw = scan.next();
			for(int i=0;i<id.length;i++) {
				if(id[i].equals(inputId) && pw[i].equals(inputPw)) {
					System.out.println("["+id[i]+"]��, ȯ���մϴ�.");
					log = i;
				}
			}
			if(log==-1) {
				System.out.println("���̵�� ��й�ȣ�� �ٽ� Ȯ�����ּ���.");
			}
		}
	}
	
	public void logOut() { // �α׾ƿ� �Լ�
		if(log==-1) {
			System.out.println("�α��� �� �̿� �����մϴ�.");
		}
		else {
			System.out.println("�ȳ����輼��.");
			log = -1;
		}
	}
}
