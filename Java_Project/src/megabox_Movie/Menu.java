package megabox_Movie;

import java.util.Date;
import java.util.Scanner;

public class Menu {
	Scanner scan = new Scanner(System.in);
	MemberInfo mi = new MemberInfo();
	MovieMenu mm = new MovieMenu();
	MyPageMenu mpm = new MyPageMenu();
	AdminMenu am = new AdminMenu();
	int menu= -1;
	public void selectMenu() {
		while(true) {
			if(mi.log==-1) { // �α׾ƿ� ������ �� ������ �޴�
				System.out.println("---[�ް��ڽ�]---");
				System.out.println("[1]�α���\n[2]ȸ������\n[0]����");
			}
			else if(mi.log==0) { // ������ ����� �� ������ �޴�
				System.out.println("---[������ �޴�]---");
				System.out.println("[1]������Ȳ\n[2]ȸ�����\n[3]����Ʈ�̿���Ȳ\n[4]��ȭ���\n[5]����");
			}
			else { // �α��� ������ �� ������ �޴�
				System.out.println("---[�ް��ڽ�]---");
				System.out.println("[1]�α׾ƿ�\n[2]ȸ��Ż��\n[3]��ȭ����\n[4]����������\n[0]����");
			}
			
			System.out.print("�޴� ���� : ");
			menu = scan.nextInt();
			if(menu==1) {
				if(mi.log==-1) {mi.logIn();} // �α׾ƿ� ������ ��� �α���
				else if(mi.log==0) {am.showBookingList();} // ������ �޴��� ��� ������Ȳ
				else {mi.logOut();} // �α��� ������ ��� �α׾ƿ�
			}
			else if(menu==2) {
				if(mi.log==-1) { // �α׾ƿ� ������ ��� ȸ������
					while(true) {
						int memberCheck = 500;
						memberCheck = mi.signUp();
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
							mi.pul.addList(new PointUseDTO(mi.inputID,new Date(mi.year,mi.month,mi.date,mi.hour,mi.minute,mi.second),
									 "���Ż��",mi.inputPoint,mi.memberList.size()));
							mi.addMember(new MemberDTO(mi.inputID,mi.inputPW,mi.inputBirthDate,mi.inputPhoneNumber,mi.inputEmail,mi.inputPoint));
							System.out.println(mi.pul.pointUseList.size());
							System.out.println(mi.memberList.size());
							break;
						}
					}
					
				}
				else if(mi.log==0) {am.showMemberList();} // ������ �޴��� ��� ȸ�����
				else {mi.withdraw();} // �α��� ������ ��� ȸ��Ż��
			}
			else if(menu==3) {
				if(mi.log==0) {am.showPointUseList();} // ������ �޴��� ��� ����Ʈ�̿���Ȳ
				else if(mi.log!=-1) {mm.bookMovie();} // �α��� ������ ��� ��ȭ����
			}
			else if(menu==4) {
				if(mi.log==0) {am.showMovieList();} // ������ �޴��� ��� ��ȭ���
				else if(mi.log!=-1) {mpm.myPage();} // �α��� ������ ��� ����������
			}
			else if(menu==5) {
				if(mi.log==0) { // ������ �޴��� ��� �������� ���ư���
					System.out.println("������ �޴��� �����մϴ�.");
					mi.log = -1; 
				} 
			}
			else if(menu==0) {
				if(mi.log!=0) { // ������ �޴��� ��� ���� �ɼ��� ���� �ʵ���
					System.out.println("�ȳ��� �輼��.");
					break;
				}
			}
		}
		scan.close();
	}
}
