package megabox_Movie;

//import java.io.File;
//import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberInfo {
	// ȸ������(���̵�, �н�����, �������, ��ȭ��ȣ, �̸���) ��
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	Calendar cal = Calendar.getInstance();
	int year = cal.get(Calendar.YEAR)-1900;
	int month = cal.get(Calendar.MONTH)+1;
	int date = cal.get(Calendar.DATE);
	int hour = cal.get(Calendar.HOUR);
	int minute = cal.get(Calendar.MINUTE);
	int second = cal.get(Calendar.SECOND);
	PointUseList pul = new PointUseList();
	
	ArrayList<MemberDTO> memberList = new ArrayList<>();
	public MemberInfo() {
		if(memberList.size()==0) {
			addMember(new MemberDTO("admin","12345","010507","010-7777-7777","admin@naver.com",0));
			addMember(new MemberDTO("cheolsu","55555","020502","010-5555-5555","iron@gmail.com",1000));
			addMember(new MemberDTO("flower","33333","990105","010-3333-3333","flower@daum.net",5000));
		}	
	}
	
	int log = -1; // (-1 : �α׾ƿ� ����, �� �� : �α��� ���� - id.get(log)�� ���� �α����� id�̴�.)
	String inputID = ""; // �Է��� ID
	String inputPW = ""; // �Է��� PW
	String inputBirthDate =""; // �Է��� �������
	String inputPhoneNumber =""; // �Է��� ��ȭ��ȣ
	String inputEmail =""; // �Է��� �̸���
	int inputPoint = 0;
	
	//ȸ������, �α���, �α׾ƿ�, ȸ��Ż��
	public int signUp() { // ȸ������
		String myID = "";
		System.out.print("ID(6~12�� �̳�): ");
		inputID = scan.next();
		
		// ID ���ڼ� ���� üũ
		if(inputID.length()<6 || inputID.length()>12) {
			return 404; // ���� �ڵ� 404: ���̵� ����(6~12) �ʰ�	
		} else {
			// ID �ߺ� üũ
			for(MemberDTO m : memberList) {
				if(m.getId().equals(inputID)) {
					return 401; // ���� �ڵ� 401: �̹� �����ϴ� ID
				}
			}
			myID = inputID;
		}
		
		String myPW = "";
		System.out.print("PW(6~12�� �̳�): ");
		inputPW = scan.next();
		
		// PW ���ڼ� ���� üũ
		if(inputPW.length()<6 || inputPW.length()>12) {
			return 405; // ���� �ڵ� 405: �н����� ����(6~12) �ʰ�	
		} else {
			myPW = inputPW;
		}
		
		String myBirthDate = "";
		System.out.print("�������(ex.800205): ");
		inputBirthDate = scan.next();
		
		// ��������� ���ڷ� ��ȯ �� ������ �߻��ϴ��� üũ
		try {
			int intBirthDate = Integer.parseInt(inputBirthDate);
			myBirthDate = inputBirthDate;
		} catch(NumberFormatException nfe) {
			return 406; // ���� �ڵ� 406: ������� ���� ����
		}
		
		String myPhoneNumber = "";
		System.out.print("��ȭ��ȣ(ex.010-1234-5678): ");
		inputPhoneNumber = scan.next();
		
		// ��ȭ��ȣ�� ���ڷ� ��ȯ �� ������ �߻��ϴ��� üũ
		try {
			StringTokenizer pn = new StringTokenizer(inputPhoneNumber,"-");
			String stringPN1 = pn.nextToken();
			String stringPN2 = pn.nextToken();
			String stringPN3 = pn.nextToken();
			Integer.parseInt(stringPN1);
			Integer.parseInt(stringPN2);
			Integer.parseInt(stringPN3);
			if((stringPN1.length()==3 && stringPN2.length()==4 && stringPN3.length()==4)==false) {
				// ���� 3�ڸ�, 4�ڸ�, 4�ڸ��� �ƴ� ��� ���� ����
				return 407;
			}
		} catch(Exception e) {
			System.out.println(e);
			return 407; // ���� �ڵ� 407: ��ȭ��ȣ ���� ����
		}
		
		// ��ȭ��ȣ �ߺ� üũ
		for(MemberDTO m : memberList) {
			if(m.getPhoneNumber().equals(inputPhoneNumber)) {
				return 402; // ���� �ڵ� 402: �̹� �����ϴ� ��ȭ��ȣ
			}
		}
		myPhoneNumber = inputPhoneNumber;
		
		String myEmail = "";
		System.out.print("email(���̹�, ����, ���� �̸��ϸ� �ν� ����): ");
		inputEmail = scan.next();
		
		// �̸��� ��� üũ
		if((inputEmail.contains("@naver.com")||inputEmail.contains("@daum.net")
		 ||inputEmail.contains("@hanmail.net")||inputEmail.contains("@gmail.com"))==false) {
			return 408; // ���� �ڵ� 408: �������� �ʴ� �̸��� ���
		}
		else {
			// �̸��� �ߺ� üũ
			for(MemberDTO m : memberList) {
				if(m.getEmail().equals(inputEmail)) {
					return 403; // ���� �ڵ� 401: �̹� �����ϴ� �̸���
				}
			}
			myEmail = inputEmail;
		}
		
		inputPoint = 1000;
		return 500;
	}
	
	public void memberMenu() {
		
	}
	
	public void logIn() { // �α���
		int loginFailCount = 0; // �α����� ������ Ƚ�� (5ȸ �̻��� �Ǹ� 6�ڸ� ���� �ڵ带 �Է��ؾ� ��)
		while(true) {
			System.out.print("id �Է�(�ڷΰ���:-1): ");
			inputID = scan.next();
			System.out.print("pw �Է�(�ڷΰ���:-1): ");
			inputPW = scan.next();
			
			String inputCode = "";
			String code ="";
			System.out.println("�����ο�"+memberList.size());
			if(loginFailCount >= 5) { 
				int codeNum = ran.nextInt()*26+97;
				for(int i=0;i<6;i++) {
					code += (char)(codeNum);
				}
				System.out.print("6�ڸ� �ڵ带 ���̴´�� �Է��ϼ��� ("+code+") : ");
				inputCode = scan.next();
			}
			if(inputCode.equals(code)==false) {
				System.out.println("�ڵ尡 ��ġ���� �ʽ��ϴ�.");
			}
			else {
				for(int i=0;i<memberList.size();i++) {
					System.out.println("������  id:"+memberList.get(i).getId());
					if(inputID.equals(memberList.get(i).getId()) &&
					inputPW.equals(memberList.get(i).getPw())) {
						log = i;
					}
				}
				if(log!=-1) {
					System.out.println("�α����� �Ϸ�Ǿ����ϴ�.");
					break;
				}
				else {
					System.out.println("���̵�� ��й�ȣ�� �ٽ� �� �� Ȯ�����ֽʽÿ�.");
					loginFailCount++;
				}
			}
		}
	}
	
	public void logOut() { //�α׾ƿ�
		log = -1;
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
	
	public void withdraw() { //ȸ��Ż��
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		inputPW = scan.next();
		if(memberList.get(log).getPw().equals(inputPW)) {
			System.out.println("ȸ��Ż�� �ϰ� �Ǹ� ���������� ��� �ı�Ǹ�, ������ �Ұ����մϴ�.");
			System.out.println("ȸ��Ż�� �Ͻðڽ��ϱ�?");
			System.out.println("[1]��");
			System.out.println("[2]�ƴϿ�");
			int withdrawMenu = 0; // Ż�� �޴� (1,2 ������ �޴� ���� �� �ݺ� / 1 ���� �� Ż���)
			while(withdrawMenu!=1 || withdrawMenu!=2) {
				withdrawMenu = scan.nextInt();
				if(withdrawMenu==1) {
					memberList.remove(log);
					System.out.println("ȸ��Ż�� �Ϸ�Ǿ����ϴ�.");
				}
			}
		}
	}
	
	// ȸ������ �߰� �޼���
	public void addMember(MemberDTO md) {
		memberList.add(md);
	}
}
