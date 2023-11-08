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
			if(mi.log==-1) { // 로그아웃 상태일 때 나오는 메뉴
				System.out.println("---[메가박스]---");
				System.out.println("[1]로그인\n[2]회원가입\n[0]종료");
			}
			else if(mi.log==0) { // 관리자 모드일 때 나오는 메뉴
				System.out.println("---[관리자 메뉴]---");
				System.out.println("[1]예매현황\n[2]회원목록\n[3]포인트이용현황\n[4]영화목록\n[5]이전");
			}
			else { // 로그인 상태일 때 나오는 메뉴
				System.out.println("---[메가박스]---");
				System.out.println("[1]로그아웃\n[2]회원탈퇴\n[3]영화예매\n[4]마이페이지\n[0]종료");
			}
			
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			if(menu==1) {
				if(mi.log==-1) {mi.logIn();} // 로그아웃 상태일 경우 로그인
				else if(mi.log==0) {am.showBookingList();} // 관리자 메뉴일 경우 예매현황
				else {mi.logOut();} // 로그인 상태일 경우 로그아웃
			}
			else if(menu==2) {
				if(mi.log==-1) { // 로그아웃 상태일 경우 회원가입
					while(true) {
						int memberCheck = 500;
						memberCheck = mi.signUp();
						// 에러 코드 401: ID 중복
						// 에러 코드 402: 전화번호 중복
						// 에러 코드 403: 이메일 중복
						// 에러 코드 404: ID 범위 초과
						// 에러 코드 405: PW 범위 초과
						// 에러 코드 406: 생년월일 형식 오류
						// 에러 코드 407: 전화번호 형식 오류
						// 에러 코드 408: 지원되지 않는 이메일 양식
						
						// 아이디 오류
						if(memberCheck==404) {System.out.println("ID는 최소 6자, 최대 12자까지 입력 가능합니다.");}
						else if(memberCheck==401) {System.out.println("이미 존재하는 ID입니다.");}
						// 비밀번호 오류
						else if(memberCheck==405) {System.out.println("PW는 최소 6자, 최대 12자까지 입력 가능합니다.");}
						// 생년월일 오류
						else if(memberCheck==406) {System.out.println("생년월일 형식이 올바르지 않습니다.");}
						// 전화번호 오류
						else if(memberCheck==407) {System.out.println("전화번호 형식이 올바르지 않습니다.");}
						else if(memberCheck==402) {System.out.println("이미 존재하는 전화번호입니다.");}
						// 이메일 오류
						else if(memberCheck==408) {System.out.println("지원되지 않는 이메일 양식입니다.");}
						else if(memberCheck==403) {System.out.println("이미 존재하는 이메일입니다.");}
						else {
							System.out.println("회원가입이 완료되었습니다!");
							System.out.println("1000 포인트가 지급되었습니다.");
							mi.pul.addList(new PointUseDTO(mi.inputID,new Date(mi.year,mi.month,mi.date,mi.hour,mi.minute,mi.second),
									 "예매사용",mi.inputPoint,mi.memberList.size()));
							mi.addMember(new MemberDTO(mi.inputID,mi.inputPW,mi.inputBirthDate,mi.inputPhoneNumber,mi.inputEmail,mi.inputPoint));
							System.out.println(mi.pul.pointUseList.size());
							System.out.println(mi.memberList.size());
							break;
						}
					}
					
				}
				else if(mi.log==0) {am.showMemberList();} // 관리자 메뉴일 경우 회원목록
				else {mi.withdraw();} // 로그인 상태일 경우 회원탈퇴
			}
			else if(menu==3) {
				if(mi.log==0) {am.showPointUseList();} // 관리자 메뉴일 경우 포인트이용현황
				else if(mi.log!=-1) {mm.bookMovie();} // 로그인 상태일 경우 영화예매
			}
			else if(menu==4) {
				if(mi.log==0) {am.showMovieList();} // 관리자 메뉴일 경우 영화목록
				else if(mi.log!=-1) {mpm.myPage();} // 로그인 상태일 경우 마이페이지
			}
			else if(menu==5) {
				if(mi.log==0) { // 관리자 메뉴일 경우 이전으로 돌아가기
					System.out.println("관리자 메뉴를 종료합니다.");
					mi.log = -1; 
				} 
			}
			else if(menu==0) {
				if(mi.log!=0) { // 관리자 메뉴일 경우 종료 옵션이 뜨지 않도록
					System.out.println("안녕히 계세요.");
					break;
				}
			}
		}
		scan.close();
	}
}
