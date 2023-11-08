package megabox_Movie;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MyPageMenu {
	Scanner scan = new Scanner(System.in);
	DecimalFormat d = new DecimalFormat("#,###");
	SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd(E) HH:mm:ss");
	MemberInfo mi = new MemberInfo();
	PointUseList pul = new PointUseList();
	
	int select = 0; // �޴�
	String inputPW = ""; // ������ PW
	String inputPhoneNumber =""; // ������ ��ȭ��ȣ
	String inputEmail =""; // ������ �̸���
	
	public void myPage() {
		while(true) {
			System.out.println();
			System.out.println("[1]�� ���� ����");
			System.out.println("[2]����/���ų���");
			System.out.println("[3]����Ʈ �̿볻��");
			System.out.println("[4]����");
			System.out.print("�޴� ����: ");
			select = scan.nextInt();
			if(select==1) { 
				myInfo();
			}
			else if(select==2) {
				reservation();
			}
			else if(select==3) {
				pointUse();
			}
			else if(select==4) {
				break;
			}
			else {
				System.out.println("��ȿ�� �޴��� �ƴմϴ�. �ٽ� �������ֽʽÿ�.");
			}
		}
	}
	
	public void myInfo() {
		while(true) {
			System.out.println();
			System.out.println("----------------------------");
			System.out.println("ID:      "+mi.memberList.get(mi.log).getId());
			System.out.println("�������:  "+mi.memberList.get(mi.log).getBirthDate());
			System.out.println("��ȭ��ȣ:  "+mi.memberList.get(mi.log).getPhoneNumber());
			System.out.println("�̸���:    "+mi.memberList.get(mi.log).getEmail());
			System.out.println("�� ����Ʈ: "+d.format(mi.memberList.get(mi.log).getPoint())+"p");
			System.out.println("----------------------------");
			System.out.println("[1]��������");
			System.out.println("[2]����");
			System.out.print("�޴� ����: ");
			select = scan.nextInt();
			if(select==1) { 
				while(true) {
					System.out.println();
					System.out.println("[1]PW");
					System.out.println("[2]��ȭ��ȣ");
					System.out.println("[3]�̸���");
					System.out.println("[4]����");
					System.out.print("������ ����: ");
					select = scan.nextInt();
					if(select==1) {
						System.out.print("PW ����(6~12�� �̳�): ");
						inputPW = scan.next();
						
						if(inputPW.length()<6 || inputPW.length()>12) {
							System.out.println("PW�� �ּ� 6��, �ִ� 12�ڱ��� �Է� �����մϴ�.");
						} else {
							mi.memberList.get(mi.log).setPw(inputPW);
							System.out.println("����Ǿ����ϴ�.");
						}
						break;
					}
					else if(select==2) {
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
								for(MemberDTO m : mi.memberList) {
									if(m.getPhoneNumber().equals(inputPhoneNumber)) {
										System.out.println("�̹� �����ϴ� ��ȭ��ȣ�Դϴ�.");
										break;
									}
								}
								mi.memberList.get(mi.log).setPhoneNumber(inputPhoneNumber);
								System.out.println("����Ǿ����ϴ�.");
								break;
							}
						} catch(Exception e) {
							System.out.println("��ȿ���� ���� ��ȭ��ȣ �����Դϴ�.");
							break;
						}
					}
					else if(select==3) {
						if((inputEmail.contains("@naver.com")||inputEmail.contains("@daum.net")
						||inputEmail.contains("@hanmail.net")||inputEmail.contains("@gmail.com"))==false) {
							System.out.println("�������� �ʴ� �̸��� ����Դϴ�.");
							break;
						}
						else {
							for(MemberDTO m : mi.memberList) {
								if(m.getEmail().equals(inputEmail)) {
									System.out.println("�̹� �����ϴ� �̸����Դϴ�.");
									break;
								}
							}
							mi.memberList.get(mi.log).setEmail(inputEmail);
							System.out.println("����Ǿ����ϴ�.");
							break;
						}
					}
					else if(select==4) {
						break;
					}
					else {
						System.out.println("��ȿ�� �޴��� �ƴմϴ�. �ٽ� �������ֽʽÿ�.");
					}
				}
			}
			else if(select==2) {
				break;
			}
			else {
				System.out.println("��ȿ�� �޴��� �ƴմϴ�. �ٽ� �������ֽʽÿ�.");
			}
		}
	}
	
	public void reservation() {
		
	}
	
	public void pointUse() {
		System.out.println("--------------------------------------------");
		System.out.println("��ȣ\tȸ��ID\t����\t\t\t����\t����Ʈ");
		for(int i=0;i<pul.pointUseList.size();i++) {
			if(pul.pointUseList.get(i).getLog()==mi.log) { // pointUseList�� ��� ������ �α��� �� ȸ���� ���̶�� ���
				System.out.print("["+(i+1)+"]\t");
				System.out.print(pul.pointUseList.get(i).getId()+"\t");
				System.out.print(sd.format(pul.pointUseList.get(i).getDate())+"\t");
				System.out.print(pul.pointUseList.get(i).getDetail()+"\t");
				System.out.println(d.format(pul.pointUseList.get(i).getPoint())+"p");
			}
		}
		System.out.println("--------------------------------------------");
		//pointUseList.showMyInfo();
		System.out.println();
	}
}
