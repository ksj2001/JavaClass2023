package megabox_Movie_Renew;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

import megabox_Movie.MemberDTO;

public class Menu {
	MovieMenu movieMenu = new MovieMenu();
	SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-MM-dd(E)");
	SimpleDateFormat sd2 = new SimpleDateFormat("HH:mm");
	SimpleDateFormat sd3 = new SimpleDateFormat("yyyy-MM-dd(E) HH:mm:ss");
	DecimalFormat d = new DecimalFormat("#,##0");
	Calendar cal = Calendar.getInstance();
	int year = cal.get(Calendar.YEAR)-1900;
	int month = cal.get(Calendar.MONTH)+1;
	int date = cal.get(Calendar.DATE);
	int hour = cal.get(Calendar.HOUR);
	int minute = cal.get(Calendar.MINUTE);
	int second = cal.get(Calendar.SECOND);
	
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	String outMenu = "---[�ް��ڽ�]---\n[1]�α���\n[2]ȸ������\n[0]����"; // �α׾ƿ� ������ �� ����� �޴�
	String inMenu = "---[�ް��ڽ�]---\n[1]�α׾ƿ�\n[2]ȸ��Ż��\n[3]��ȭ����\n[4]����������\n[0]����"; // �α��� ������ �� ����� �޴�
	String adMenu = "---[������ �޴�]---\n[1]������Ȳ\n[2]ȸ�����\n[3]����Ʈ�̿���Ȳ\n[4]��ȭ���\n[5]����"; // ������ ����� �� ����� �޴�
	static int log = -1; // (-1 : �α׾ƿ� ����)
	int menu = -1;
	String inputID = ""; // �Է��� ID
	String inputPW = ""; // �Է��� PW
	String inputBirthDate =""; // �Է��� �������
	String inputPhoneNumber =""; // �Է��� ��ȭ��ȣ
	String inputEmail =""; // �Է��� �̸���
	int inputPoint = 0;
	
	public void menu() {
		setDefaultUser();
		while(true) {
			if(log==-1) {System.out.println(outMenu);} // �α׾ƿ� ����
			else if(log==0) {System.out.println(adMenu);} // ������ ���
			else {System.out.println(inMenu);} // �α��� ����
			
			System.out.print("�޴� ���� : ");
			menu = scan.nextInt();
			if(menu==1) {
				if(log==-1) {logIn();} // �α׾ƿ� ������ ��� �α���
				else if(log==0) {ticket();} // ������ �޴��� ��� ������Ȳ
				else {logOut();} // �α��� ������ ��� �α׾ƿ�
			}
			else if(menu==2) {
				if(log==-1) { // �α׾ƿ� ������ ��� ȸ������
					while(true) {
						int memberCheck = 500;
						memberCheck = signUp();
						// ���� �ڵ� 401: ID �ߺ�
						// ���� �ڵ� 402: ��ȭ��ȣ �ߺ�
						// ���� �ڵ� 403: �̸��� �ߺ�
						// ���� �ڵ� 404: ID ���� �ʰ�
						// ���� �ڵ� 405: PW ���� �ʰ�
						// ���� �ڵ� 406: ������� ���� ����
						// ���� �ڵ� 407: ��ȭ��ȣ ���� ����
						// ���� �ڵ� 408: �������� �ʴ� �̸��� ���
						
						// ���̵� ����
						if(memberCheck==404) {System.out.println("ID�� �ּ� 6��, �ִ� 12�ڱ��� �Է� �����մϴ�.");}
						else if(memberCheck==401) {System.out.println("�̹� �����ϴ� ID�Դϴ�.");}
						// ��й�ȣ ����
						else if(memberCheck==405) {System.out.println("PW�� �ּ� 6��, �ִ� 12�ڱ��� �Է� �����մϴ�.");}
						// ������� ����
						else if(memberCheck==406) {System.out.println("������� ������ �ùٸ��� �ʽ��ϴ�.");}
						// ��ȭ��ȣ ����
						else if(memberCheck==407) {System.out.println("��ȭ��ȣ ������ �ùٸ��� �ʽ��ϴ�.");}
						else if(memberCheck==402) {System.out.println("�̹� �����ϴ� ��ȭ��ȣ�Դϴ�.");}
						// �̸��� ����
						else if(memberCheck==408) {System.out.println("�������� �ʴ� �̸��� ����Դϴ�.");}
						else if(memberCheck==403) {System.out.println("�̹� �����ϴ� �̸����Դϴ�.");}
						else {
							System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�!");
							System.out.println("1000 ����Ʈ�� ���޵Ǿ����ϴ�.");
							MovieMenu.addList(new PointDTO(inputID,new Date(year,month-1,date,hour,minute,second),
									 "ȸ������",inputPoint,MovieMenu.userList.size()));
							MovieMenu.addList(new UserDTO(inputID,inputPW,inputBirthDate,inputPhoneNumber,inputEmail));
							break;
						}
					}
					
				}
				else if(log==0) {userList();} // ������ �޴��� ��� ȸ�����
				else {withdraw();} // �α��� ������ ��� ȸ��Ż��
			}
			else if(menu==3) {
				if(log==0) {point();} // ������ �޴��� ��� ����Ʈ�̿���Ȳ
				else if(log!=-1) {movieMenu.bookMovie();} // �α��� ������ ��� ��ȭ����
			}
			else if(menu==4) {
				if(log==0) {movieList();} // ������ �޴��� ��� ��ȭ���
				else if(log!=-1) {myPage();} // �α��� ������ ��� ����������
			}
			else if(menu==5) {
				if(log==0) { // ������ �޴��� ��� �������� ���ư���
					System.out.println("������ �޴��� �����մϴ�.");
					log = -1; 
				} 
			}
			else if(menu==0) {
				if(log!=0) { // ������ �޴��� ��� ���� �ɼ��� ���� �ʵ���
					System.out.println("�ȳ��� �輼��.");
					break;
				}
			}
		}
	}
	
	// ȸ������
	public int signUp() {
		System.out.print("ID(6~12�� �̳�): ");
		inputID = scan.next();
		
		// ID ���ڼ� ���� üũ
		if(inputID.length()<6 || inputID.length()>12) {
			return 404; // ���� �ڵ� 404: ���̵� ����(6~12) �ʰ�	
		} else {
			// ID �ߺ� üũ
			for(UserDTO u : MovieMenu.userList) {
				if(u.getId().equals(inputID)) {
					return 401; // ���� �ڵ� 401: �̹� �����ϴ� ID
				}
			}
		}
		
		System.out.print("PW(6~12�� �̳�): ");
		inputPW = scan.next();
		
		// PW ���ڼ� ���� üũ
		if(inputPW.length()<6 || inputPW.length()>12) {
			return 405; // ���� �ڵ� 405: �н����� ����(6~12) �ʰ�	
		}
		
		System.out.print("�������(ex.800205): ");
		inputBirthDate = scan.next();
		
		// ��������� ���ڷ� ��ȯ �� ������ �߻��ϴ��� üũ
		try {
			int intBirthDate = Integer.parseInt(inputBirthDate);
		} catch(NumberFormatException nfe) {
			return 406; // ���� �ڵ� 406: ������� ���� ����
		}
		
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
			return 407; // ���� �ڵ� 407: ��ȭ��ȣ ���� ����
		}
		
		// ��ȭ��ȣ �ߺ� üũ
		for(UserDTO u : MovieMenu.userList) {
			if(u.getPhoneNumber().equals(inputPhoneNumber)) {
				return 402; // ���� �ڵ� 402: �̹� �����ϴ� ��ȭ��ȣ
			}
		}
		
		System.out.print("email(���̹�, ����, ���� �̸��ϸ� �ν� ����): ");
		inputEmail = scan.next();
		
		// �̸��� ��� üũ
		if((inputEmail.contains("@naver.com")||inputEmail.contains("@daum.net")
		 ||inputEmail.contains("@hanmail.net")||inputEmail.contains("@gmail.com"))==false) {
			return 408; // ���� �ڵ� 408: �������� �ʴ� �̸��� ���
		}
		else {
			// �̸��� �ߺ� üũ
			for(UserDTO u : MovieMenu.userList) {
				if(u.getEmail().equals(inputEmail)) {
					return 403; // ���� �ڵ� 401: �̹� �����ϴ� �̸���
				}
			}
		}
		
		inputPoint = 1000;
		return 500;
	}
	
	// ȸ��Ż��
	public void withdraw() {
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		inputPW = scan.next();
		if(MovieMenu.userList.get(log).getPw().equals(inputPW)) {
			System.out.println("ȸ��Ż�� �ϰ� �Ǹ� ���������� ��� �ı�Ǹ�, ������ �Ұ����մϴ�.");
			System.out.println("ȸ��Ż�� �Ͻðڽ��ϱ�?");
			System.out.println("[1]��");
			System.out.println("[2]�ƴϿ�");
			int withdrawMenu = 0; // Ż�� �޴� (1,2 ������ �޴� ���� �� �ݺ� / 1 ���� �� Ż���)
			while(withdrawMenu!=1 || withdrawMenu!=2) {
				withdrawMenu = scan.nextInt();
				if(withdrawMenu==1) {
					// TicketingList���� ����
					while(true) {
						int ticketingListSize = MovieMenu.ticketingList.size(); // ���� pointList�� ũ��
						for(int i=0;i<MovieMenu.ticketingList.size();i++) {
							if(MovieMenu.ticketingList.get(i).getId().equals(MovieMenu.userList.get(log).getId())) {
								MovieMenu.ticketingList.remove(i);
								break; // ticketingList�� ũ�Ⱑ �پ�� ���, for���� ������ �ٽ� for���� ������.
							}
						}
						// Ż���� ȸ���� ������ ticketingList�� �� �̻� ���� ���, ticketingList�� ũ��� �� �̻� �پ���� �ʴ´�. 
						if(ticketingListSize==MovieMenu.ticketingList.size()) {
							break;
						}
					}
					// pointList���� ����
					while(true) {
						int pointListSize = MovieMenu.pointList.size(); // ���� pointList�� ũ��
						for(int i=0;i<MovieMenu.pointList.size();i++) {
							if(MovieMenu.pointList.get(i).getId().equals(MovieMenu.userList.get(log).getId())) {
								MovieMenu.pointList.remove(i);
								break; // pointList�� ũ�Ⱑ �پ�� ���, for���� ������ �ٽ� for���� ������.
							}
						}
						// Ż���� ȸ���� ������ pointList�� �� �̻� ���� ���, pointList�� ũ��� �� �̻� �پ���� �ʴ´�. 
						if(pointListSize==MovieMenu.pointList.size()) {
							break;
						}
					}
					// userList���� ����
					MovieMenu.userList.remove(log);
					System.out.println("ȸ��Ż�� �Ϸ�Ǿ����ϴ�.");
					log = -1;
					break;
				}
			}
		}
		else {
			System.out.println("��й�ȣ�� ���� �ʽ��ϴ�.");
		}
	}
	
	// �α���
	public void logIn() {
		int loginFailCount = 0; // �α����� ������ Ƚ�� (5ȸ �̻��� �Ǹ� 6�ڸ� ���� �ڵ带 �Է��ؾ� ��)
		while(true) {
			System.out.print("id �Է�(�ڷΰ���:-1): ");
			inputID = scan.next();
			System.out.print("pw �Է�(�ڷΰ���:-1): ");
			inputPW = scan.next();
			
			String inputCode = "";
			String code ="";
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
				for(int i=0;i<MovieMenu.userList.size();i++) {
					if(inputID.equals(MovieMenu.userList.get(i).getId()) &&
					inputPW.equals(MovieMenu.userList.get(i).getPw())) {
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
	
	// �α׾ƿ�
	public void logOut() {
		log = -1;
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
	
	// ����������
	public void myPage() {
		while(true) {
			System.out.println();
			System.out.println("[1]�� ���� ����");
			System.out.println("[2]����/���ų���");
			System.out.println("[3]����Ʈ �̿볻��");
			System.out.println("[4]����");
			System.out.print("�޴� ����: ");
			menu = scan.nextInt();
			if(menu==1) { 
				myInfo();
			}
			else if(menu==2) {
				myTicket();
			}
			else if(menu==3) {
				myPoint();
			}
			else if(menu==4) {
				break;
			}
			else {
				System.out.println("��ȿ�� �޴��� �ƴմϴ�. �ٽ� �������ֽʽÿ�.");
			}
		}
	}
		
	// �� ���� ����
	public void myInfo() {
		while(true) {
			System.out.println();
			System.out.println("----------------------------");
			System.out.println("ID:      "+MovieMenu.userList.get(log).getId());
			System.out.println("�������:  "+MovieMenu.userList.get(log).getBirthDate());
			System.out.println("��ȭ��ȣ:  "+MovieMenu.userList.get(log).getPhoneNumber());
			System.out.println("�̸���:    "+MovieMenu.userList.get(log).getEmail());
			System.out.println("�� ����Ʈ: "+d.format(MovieMenu.userList.get(log).getPoint())+"p");
			System.out.println("----------------------------");
			System.out.println("[1]��������");
			System.out.println("[2]����");
			System.out.print("�޴� ����: ");
			menu = scan.nextInt();
			if(menu==1) { 
				changeMyInfo();
			}
			else if(menu==2) {
				break;
			}
			else {
				System.out.println("��ȿ�� �޴��� �ƴմϴ�. �ٽ� �������ֽʽÿ�.");
			}
		}
	}
	
	// �� ���� ����
	public void changeMyInfo() {
		while(true) {
			System.out.println();
			System.out.println("[1]PW");
			System.out.println("[2]��ȭ��ȣ");
			System.out.println("[3]�̸���");
			System.out.println("[4]����");
			System.out.print("������ ����: ");
			menu = scan.nextInt();
			if(menu==1) {
				System.out.print("PW ����(6~12�� �̳�): ");
				inputPW = scan.next();
				
				if(inputPW.length()<6 || inputPW.length()>12) {
					System.out.println("PW�� �ּ� 6��, �ִ� 12�ڱ��� �Է� �����մϴ�.");
				} else {
					MovieMenu.userList.get(log).setPw(inputPW);
					System.out.println("����Ǿ����ϴ�.");
				}
				break;
			}
			else if(menu==2) {
				System.out.print("��ȭ��ȣ ����(ex.010-1234-5678): ");
				inputPhoneNumber = scan.next();
				
				try {
					StringTokenizer pn = new StringTokenizer(inputPhoneNumber,"-");
					String stringPN1 = pn.nextToken();
					String stringPN2 = pn.nextToken();
					String stringPN3 = pn.nextToken();
					Integer.parseInt(stringPN1);
					Integer.parseInt(stringPN2);
					Integer.parseInt(stringPN3);
					if((stringPN1.length()==3 && stringPN2.length()==4 && stringPN3.length()==4)==false) {
						System.out.println("��ȿ���� ���� ��ȭ��ȣ �����Դϴ�.");
						break;
					}
					else {
						for(UserDTO u : MovieMenu.userList) {
							if(u.getPhoneNumber().equals(inputPhoneNumber)) {
								System.out.println("�̹� �����ϴ� ��ȭ��ȣ�Դϴ�.");
								break;
							}
						}
						MovieMenu.userList.get(log).setPhoneNumber(inputPhoneNumber);
						System.out.println("����Ǿ����ϴ�.");
						break;
					}
				} catch(Exception e) {
					System.out.println("��ȿ���� ���� ��ȭ��ȣ �����Դϴ�.");
					break;
				}
			}
			else if(menu==3) {
				if((inputEmail.contains("@naver.com")||inputEmail.contains("@daum.net")
				||inputEmail.contains("@hanmail.net")||inputEmail.contains("@gmail.com"))==false) {
					System.out.println("�������� �ʴ� �̸��� ����Դϴ�.");
					break;
				}
				else {
					for(UserDTO u : MovieMenu.userList) {
						if(u.getEmail().equals(inputEmail)) {
							System.out.println("�̹� �����ϴ� �̸����Դϴ�.");
							break;
						}
					}
					MovieMenu.userList.get(log).setEmail(inputEmail);
					System.out.println("����Ǿ����ϴ�.");
					break;
				}
			}
			else if(menu==4) {
				break;
			}
			else {
				System.out.println("��ȿ�� �޴��� �ƴմϴ�. �ٽ� �������ֽʽÿ�.");
			}
		}
	}
	
	// �� ���ų���
	public void myTicket() {
		ArrayList<Integer> myTicketList = new ArrayList<>();
		for(int i=0;i<MovieMenu.ticketingList.size();i++) {
			if(MovieMenu.ticketingList.get(i).getId().equals(MovieMenu.userList.get(log).getId())) {
				myTicketList.add(i);
			}
		}
		
		while(true) {
			if(myTicketList.size()==0) {
				System.out.println("���ų����� �������� �ʽ��ϴ�.");
				break;
			}
			else {
				System.out.println();
				System.out.println("��ȣ\t��ȭ�̸�\t��ȭ��(����)\t������\t\t\t��ȭ ����\t\t�󿵽ð�\t\t���� �ż�\t�� �ݾ�");
				for(int i=0;i<myTicketList.size();i++) {
					System.out.print("["+(i+1)+"]\t");
					System.out.print(MovieMenu.ticketingList.get(myTicketList.get(i)).getName()+"\t");
					System.out.print(MovieMenu.ticketingList.get(myTicketList.get(i)).getTheater()+"(");
					System.out.print(MovieMenu.ticketingList.get(myTicketList.get(i)).getLocal()+")\t");
					System.out.print(sd3.format(MovieMenu.ticketingList.get(myTicketList.get(i)).getRezTime())+"\t");
					System.out.print(sd1.format(MovieMenu.ticketingList.get(myTicketList.get(i)).getTime())+"\t");
					System.out.print(sd2.format(MovieMenu.ticketingList.get(myTicketList.get(i)).getTime())+"~"
							+sd2.format(MovieMenu.ticketingList.get(myTicketList.get(i)).getEndTime())+"\t");
					System.out.print(MovieMenu.ticketingList.get(myTicketList.get(i)).getCnt()+"\t");
					System.out.println(d.format(MovieMenu.ticketingList.get(myTicketList.get(i)).getCost())+"��");
				}
				System.out.print("[1]�������\n[2]����\n�޴� ���� : ");
				menu = scan.nextInt();
				if(menu==1) {
					System.out.print("����� ��ȣ : ");
					int cancelNum = scan.nextInt()-1;
					int removeLog = myTicketList.get(cancelNum);
					
					MovieMenu.ticketingList.remove(removeLog);
					//MovieMenu.ticketingList.remove(myTicketList.get(cancelNum));
					System.out.println("��ҵǾ����ϴ�.");
					
					myTicketList = new ArrayList<>();
					for(int i=0;i<MovieMenu.ticketingList.size();i++) {
						if(MovieMenu.ticketingList.get(i).getId().equals(MovieMenu.userList.get(log).getId())) {
							myTicketList.add(i);
						}
					}
				}
				else if(menu==2) {
					break;	
				}
				else {
					System.out.println("��ȿ�� �޴��� �ƴմϴ�.");
				}
			}
		}
	}
		
	// �� ����Ʈ �̿볻��
	public void myPoint() {
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("��ȣ\tȸ��ID\t����\t\t\t����\t����Ʈ");
		for(int i=0;i<MovieMenu.pointList.size();i++) {
			if(MovieMenu.pointList.get(i).getLog()==log) { // pointUseList�� ��� ������ �α��� �� ȸ���� ���̶�� ���
				System.out.print("["+(i+1)+"]\t");
				System.out.print(MovieMenu.pointList.get(i).getId()+"\t");
				System.out.print(sd3.format(MovieMenu.pointList.get(i).getDate())+"\t");
				System.out.print(MovieMenu.pointList.get(i).getDetail()+"\t");
				System.out.println(d.format(MovieMenu.pointList.get(i).getPoint())+"p");
			}
		}
		System.out.println("--------------------------------------------");
	}
	
	// ������Ȳ (�����ڸ޴�)
	public void ticket() {
		if(MovieMenu.ticketingList.size()==0) {
			System.out.println();
			System.out.println("���ų����� �������� �ʽ��ϴ�.");
		}
		else {
			System.out.println();
			System.out.println("��ȣ\t��ȭ�̸�\t��ȭ��(����)\t������\t\t\t��ȭ ����\t\t�󿵽ð�\t\t���� �ż�\t�� �ݾ�");
			for(int i=0;i<MovieMenu.ticketingList.size();i++) {
				System.out.print("["+(i+1)+"]\t");
				System.out.print(MovieMenu.ticketingList.get(i).getName()+"\t");
				System.out.print(MovieMenu.ticketingList.get(i).getTheater()+"(");
				System.out.print(MovieMenu.ticketingList.get(i).getLocal()+")\t");
				System.out.print(sd3.format(MovieMenu.ticketingList.get(i).getRezTime())+"\t");
				System.out.print(sd1.format(MovieMenu.ticketingList.get(i).getTime())+"\t");
				System.out.print(sd2.format(MovieMenu.ticketingList.get(i).getTime())+"~"
								+sd2.format(MovieMenu.ticketingList.get(i).getEndTime())+"\t");
				System.out.print(MovieMenu.ticketingList.get(i).getCnt()+"\t");
				System.out.println(d.format(MovieMenu.ticketingList.get(i).getCost())+"��");
			}
			System.out.println();
		}
	}
	
	// ȸ����� (�����ڸ޴�)
	public void userList() {
		if(MovieMenu.userList.size()==1) {
			System.out.println();
			System.out.println("ȸ���� �������� �ʽ��ϴ�.");
		}
		else {
			System.out.println();
			System.out.println("\t\t\t--[��ü ȸ�� ����]--");
			System.out.println("-------------------------------------------------");
			System.out.println("ID\tPW\t�������\t��ȭ��ȣ\t�̸���\t����Ʈ");
			for(int i=1;i<MovieMenu.userList.size();i++) {
				System.out.print(MovieMenu.userList.get(i).getId()+"\t");
				System.out.print(MovieMenu.userList.get(i).getPw()+"\t");
				System.out.print(MovieMenu.userList.get(i).getBirthDate()+"\t");
				System.out.print(MovieMenu.userList.get(i).getPhoneNumber()+"\t");
				System.out.print(MovieMenu.userList.get(i).getEmail()+"\t");
				System.out.println(d.format(MovieMenu.userList.get(i).getPoint())+"\t");
			}
			System.out.println();
		}
	}
	
	// ȸ�� ��ü�� ����Ʈ �̿���Ȳ (�����ڸ޴�)
	public void point() {
		if(MovieMenu.pointList.size()==0) {
			System.out.println();
			System.out.println("����Ʈ �̿볻���� �������� �ʽ��ϴ�.");
		}
		else {
			System.out.println();
			System.out.println("\t\t\t--[��ü ����Ʈ �̿� ����]--");
			System.out.println("--------------------------------------------");
			System.out.println("��ȣ\tȸ��ID\t����\t\t\t����\t����Ʈ");
			for(int i=0;i<MovieMenu.pointList.size();i++) {
				System.out.print("["+(i+1)+"]\t");
				System.out.print(MovieMenu.pointList.get(i).getId()+"\t");
				System.out.print(sd3.format(MovieMenu.pointList.get(i).getDate())+"\t");
				System.out.print(MovieMenu.pointList.get(i).getDetail()+"\t");
				System.out.println(d.format(MovieMenu.pointList.get(i).getPoint())+"p");
			}
			System.out.println("--------------------------------------------");
			System.out.println();
		}
	}
	
	// ��ȭ��� (�����ڸ޴�)
	public void movieList() {
		System.out.println();
		System.out.println("\t\t--[��ȭ ���]--");
		System.out.println("-------------------------------------------------");
		System.out.println("    ��ȭ�̸�\t����");
		for(int i=0;i<movieMenu.movieName.length;i++) {
			System.out.print("["+(i+1)+"]"+movieMenu.movieName[i]+"\t");
			System.out.println(sd1.format(movieMenu.releaseDate[i]));
		}
		System.out.println("-------------------------------------------------");
		System.out.println();
	}
	
	public void setDefaultUser() {
		MovieMenu.addList(new UserDTO("admin","12345","010507","010-7777-7777","admin@naver.com"));
		MovieMenu.addList(new UserDTO("cheolsu","55555","020502","010-5555-5555","iron@gmail.com"));
		MovieMenu.addList(new UserDTO("flower","33333","990105","010-3333-3333","flower@daum.net"));
	}
}
