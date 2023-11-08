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
	
	int select = 0; // 메뉴
	String inputPW = ""; // 수정할 PW
	String inputPhoneNumber =""; // 수정할 전화번호
	String inputEmail =""; // 수정할 이메일
	
	public void myPage() {
		while(true) {
			System.out.println();
			System.out.println("[1]내 정보 보기");
			System.out.println("[2]예매/구매내역");
			System.out.println("[3]포인트 이용내역");
			System.out.println("[4]이전");
			System.out.print("메뉴 선택: ");
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
				System.out.println("유효한 메뉴가 아닙니다. 다시 선택해주십시오.");
			}
		}
	}
	
	public void myInfo() {
		while(true) {
			System.out.println();
			System.out.println("----------------------------");
			System.out.println("ID:      "+mi.memberList.get(mi.log).getId());
			System.out.println("생년월일:  "+mi.memberList.get(mi.log).getBirthDate());
			System.out.println("전화번호:  "+mi.memberList.get(mi.log).getPhoneNumber());
			System.out.println("이메일:    "+mi.memberList.get(mi.log).getEmail());
			System.out.println("내 포인트: "+d.format(mi.memberList.get(mi.log).getPoint())+"p");
			System.out.println("----------------------------");
			System.out.println("[1]정보수정");
			System.out.println("[2]이전");
			System.out.print("메뉴 선택: ");
			select = scan.nextInt();
			if(select==1) { 
				while(true) {
					System.out.println();
					System.out.println("[1]PW");
					System.out.println("[2]전화번호");
					System.out.println("[3]이메일");
					System.out.println("[4]이전");
					System.out.print("변경할 정보: ");
					select = scan.nextInt();
					if(select==1) {
						System.out.print("PW 수정(6~12자 이내): ");
						inputPW = scan.next();
						
						if(inputPW.length()<6 || inputPW.length()>12) {
							System.out.println("PW는 최소 6자, 최대 12자까지 입력 가능합니다.");
						} else {
							mi.memberList.get(mi.log).setPw(inputPW);
							System.out.println("변경되었습니다.");
						}
						break;
					}
					else if(select==2) {
						System.out.print("전화번호 수정(ex.010-1234-5678): ");
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
								System.out.println("유효하지 않은 전화번호 형식입니다.");
								break;
							}
							else {
								for(MemberDTO m : mi.memberList) {
									if(m.getPhoneNumber().equals(inputPhoneNumber)) {
										System.out.println("이미 존재하는 전화번호입니다.");
										break;
									}
								}
								mi.memberList.get(mi.log).setPhoneNumber(inputPhoneNumber);
								System.out.println("변경되었습니다.");
								break;
							}
						} catch(Exception e) {
							System.out.println("유효하지 않은 전화번호 형식입니다.");
							break;
						}
					}
					else if(select==3) {
						if((inputEmail.contains("@naver.com")||inputEmail.contains("@daum.net")
						||inputEmail.contains("@hanmail.net")||inputEmail.contains("@gmail.com"))==false) {
							System.out.println("지원되지 않는 이메일 양식입니다.");
							break;
						}
						else {
							for(MemberDTO m : mi.memberList) {
								if(m.getEmail().equals(inputEmail)) {
									System.out.println("이미 존재하는 이메일입니다.");
									break;
								}
							}
							mi.memberList.get(mi.log).setEmail(inputEmail);
							System.out.println("변경되었습니다.");
							break;
						}
					}
					else if(select==4) {
						break;
					}
					else {
						System.out.println("유효한 메뉴가 아닙니다. 다시 선택해주십시오.");
					}
				}
			}
			else if(select==2) {
				break;
			}
			else {
				System.out.println("유효한 메뉴가 아닙니다. 다시 선택해주십시오.");
			}
		}
	}
	
	public void reservation() {
		
	}
	
	public void pointUse() {
		System.out.println("--------------------------------------------");
		System.out.println("번호\t회원ID\t일자\t\t\t내용\t포인트");
		for(int i=0;i<pul.pointUseList.size();i++) {
			if(pul.pointUseList.get(i).getLog()==mi.log) { // pointUseList에 담긴 내용이 로그인 된 회원의 것이라면 출력
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
