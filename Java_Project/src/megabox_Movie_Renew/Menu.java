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
	String outMenu = "---[메가박스]---\n[1]로그인\n[2]회원가입\n[0]종료"; // 로그아웃 상태일 때 출력할 메뉴
	String inMenu = "---[메가박스]---\n[1]로그아웃\n[2]회원탈퇴\n[3]영화예매\n[4]마이페이지\n[0]종료"; // 로그인 상태일 때 출력할 메뉴
	String adMenu = "---[관리자 메뉴]---\n[1]예매현황\n[2]회원목록\n[3]포인트이용현황\n[4]영화목록\n[5]이전"; // 관리자 모드일 때 출력할 메뉴
	static int log = -1; // (-1 : 로그아웃 상태)
	int menu = -1;
	String inputID = ""; // 입력한 ID
	String inputPW = ""; // 입력한 PW
	String inputBirthDate =""; // 입력한 생년월일
	String inputPhoneNumber =""; // 입력한 전화번호
	String inputEmail =""; // 입력한 이메일
	int inputPoint = 0;
	
	public void menu() {
		setDefaultUser();
		while(true) {
			if(log==-1) {System.out.println(outMenu);} // 로그아웃 상태
			else if(log==0) {System.out.println(adMenu);} // 관리자 모드
			else {System.out.println(inMenu);} // 로그인 상태
			
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			if(menu==1) {
				if(log==-1) {logIn();} // 로그아웃 상태일 경우 로그인
				else if(log==0) {ticket();} // 관리자 메뉴일 경우 예매현황
				else {logOut();} // 로그인 상태일 경우 로그아웃
			}
			else if(menu==2) {
				if(log==-1) { // 로그아웃 상태일 경우 회원가입
					while(true) {
						int memberCheck = 500;
						memberCheck = signUp();
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
							MovieMenu.addList(new PointDTO(inputID,new Date(year,month-1,date,hour,minute,second),
									 "회원가입",inputPoint,MovieMenu.userList.size()));
							MovieMenu.addList(new UserDTO(inputID,inputPW,inputBirthDate,inputPhoneNumber,inputEmail));
							break;
						}
					}
					
				}
				else if(log==0) {userList();} // 관리자 메뉴일 경우 회원목록
				else {withdraw();} // 로그인 상태일 경우 회원탈퇴
			}
			else if(menu==3) {
				if(log==0) {point();} // 관리자 메뉴일 경우 포인트이용현황
				else if(log!=-1) {movieMenu.bookMovie();} // 로그인 상태일 경우 영화예매
			}
			else if(menu==4) {
				if(log==0) {movieList();} // 관리자 메뉴일 경우 영화목록
				else if(log!=-1) {myPage();} // 로그인 상태일 경우 마이페이지
			}
			else if(menu==5) {
				if(log==0) { // 관리자 메뉴일 경우 이전으로 돌아가기
					System.out.println("관리자 메뉴를 종료합니다.");
					log = -1; 
				} 
			}
			else if(menu==0) {
				if(log!=0) { // 관리자 메뉴일 경우 종료 옵션이 뜨지 않도록
					System.out.println("안녕히 계세요.");
					break;
				}
			}
		}
	}
	
	// 회원가입
	public int signUp() {
		System.out.print("ID(6~12자 이내): ");
		inputID = scan.next();
		
		// ID 글자수 제한 체크
		if(inputID.length()<6 || inputID.length()>12) {
			return 404; // 에러 코드 404: 아이디 범위(6~12) 초과	
		} else {
			// ID 중복 체크
			for(UserDTO u : MovieMenu.userList) {
				if(u.getId().equals(inputID)) {
					return 401; // 에러 코드 401: 이미 존재하는 ID
				}
			}
		}
		
		System.out.print("PW(6~12자 이내): ");
		inputPW = scan.next();
		
		// PW 글자수 제한 체크
		if(inputPW.length()<6 || inputPW.length()>12) {
			return 405; // 에러 코드 405: 패스워드 범위(6~12) 초과	
		}
		
		System.out.print("생년월일(ex.800205): ");
		inputBirthDate = scan.next();
		
		// 생년월일을 숫자로 변환 시 오류가 발생하는지 체크
		try {
			int intBirthDate = Integer.parseInt(inputBirthDate);
		} catch(NumberFormatException nfe) {
			return 406; // 에러 코드 406: 생년월일 형식 오류
		}
		
		System.out.print("전화번호(ex.010-1234-5678): ");
		inputPhoneNumber = scan.next();
		
		// 전화번호를 숫자로 변환 시 오류가 발생하는지 체크
		try {
			StringTokenizer pn = new StringTokenizer(inputPhoneNumber,"-");
			String stringPN1 = pn.nextToken();
			String stringPN2 = pn.nextToken();
			String stringPN3 = pn.nextToken();
			Integer.parseInt(stringPN1);
			Integer.parseInt(stringPN2);
			Integer.parseInt(stringPN3);
			if((stringPN1.length()==3 && stringPN2.length()==4 && stringPN3.length()==4)==false) {
				// 각각 3자리, 4자리, 4자리가 아닌 경우 형식 오류
				return 407;
			}
		} catch(Exception e) {
			return 407; // 에러 코드 407: 전화번호 형식 오류
		}
		
		// 전화번호 중복 체크
		for(UserDTO u : MovieMenu.userList) {
			if(u.getPhoneNumber().equals(inputPhoneNumber)) {
				return 402; // 에러 코드 402: 이미 존재하는 전화번호
			}
		}
		
		System.out.print("email(네이버, 다음, 구글 이메일만 인식 가능): ");
		inputEmail = scan.next();
		
		// 이메일 양식 체크
		if((inputEmail.contains("@naver.com")||inputEmail.contains("@daum.net")
		 ||inputEmail.contains("@hanmail.net")||inputEmail.contains("@gmail.com"))==false) {
			return 408; // 에러 코드 408: 지원되지 않는 이메일 양식
		}
		else {
			// 이메일 중복 체크
			for(UserDTO u : MovieMenu.userList) {
				if(u.getEmail().equals(inputEmail)) {
					return 403; // 에러 코드 401: 이미 존재하는 이메일
				}
			}
		}
		
		inputPoint = 1000;
		return 500;
	}
	
	// 회원탈퇴
	public void withdraw() {
		System.out.print("비밀번호를 입력하세요 : ");
		inputPW = scan.next();
		if(MovieMenu.userList.get(log).getPw().equals(inputPW)) {
			System.out.println("회원탈퇴를 하게 되면 개인정보는 즉시 파기되며, 복구가 불가능합니다.");
			System.out.println("회원탈퇴 하시겠습니까?");
			System.out.println("[1]예");
			System.out.println("[2]아니요");
			int withdrawMenu = 0; // 탈퇴 메뉴 (1,2 제외한 메뉴 선택 시 반복 / 1 선택 시 탈퇴됨)
			while(withdrawMenu!=1 || withdrawMenu!=2) {
				withdrawMenu = scan.nextInt();
				if(withdrawMenu==1) {
					// TicketingList에서 삭제
					while(true) {
						int ticketingListSize = MovieMenu.ticketingList.size(); // 기존 pointList의 크기
						for(int i=0;i<MovieMenu.ticketingList.size();i++) {
							if(MovieMenu.ticketingList.get(i).getId().equals(MovieMenu.userList.get(log).getId())) {
								MovieMenu.ticketingList.remove(i);
								break; // ticketingList의 크기가 줄어든 경우, for문을 나오고 다시 for문을 돌린다.
							}
						}
						// 탈퇴할 회원의 정보가 ticketingList에 더 이상 없을 경우, ticketingList의 크기는 더 이상 줄어들지 않는다. 
						if(ticketingListSize==MovieMenu.ticketingList.size()) {
							break;
						}
					}
					// pointList에서 삭제
					while(true) {
						int pointListSize = MovieMenu.pointList.size(); // 기존 pointList의 크기
						for(int i=0;i<MovieMenu.pointList.size();i++) {
							if(MovieMenu.pointList.get(i).getId().equals(MovieMenu.userList.get(log).getId())) {
								MovieMenu.pointList.remove(i);
								break; // pointList의 크기가 줄어든 경우, for문을 나오고 다시 for문을 돌린다.
							}
						}
						// 탈퇴할 회원의 정보가 pointList에 더 이상 없을 경우, pointList의 크기는 더 이상 줄어들지 않는다. 
						if(pointListSize==MovieMenu.pointList.size()) {
							break;
						}
					}
					// userList에서 삭제
					MovieMenu.userList.remove(log);
					System.out.println("회원탈퇴가 완료되었습니다.");
					log = -1;
					break;
				}
			}
		}
		else {
			System.out.println("비밀번호가 맞지 않습니다.");
		}
	}
	
	// 로그인
	public void logIn() {
		int loginFailCount = 0; // 로그인을 실패한 횟수 (5회 이상이 되면 6자리 랜덤 코드를 입력해야 함)
		while(true) {
			System.out.print("id 입력(뒤로가기:-1): ");
			inputID = scan.next();
			System.out.print("pw 입력(뒤로가기:-1): ");
			inputPW = scan.next();
			
			String inputCode = "";
			String code ="";
			if(loginFailCount >= 5) { 
				int codeNum = ran.nextInt()*26+97;
				for(int i=0;i<6;i++) {
					code += (char)(codeNum);
				}
				System.out.print("6자리 코드를 보이는대로 입력하세요 ("+code+") : ");
				inputCode = scan.next();
			}
			if(inputCode.equals(code)==false) {
				System.out.println("코드가 일치하지 않습니다.");
			}
			else {
				for(int i=0;i<MovieMenu.userList.size();i++) {
					if(inputID.equals(MovieMenu.userList.get(i).getId()) &&
					inputPW.equals(MovieMenu.userList.get(i).getPw())) {
						log = i;
					}
				}
				if(log!=-1) {
					System.out.println("로그인이 완료되었습니다.");
					break;
				}
				else {
					System.out.println("아이디와 비밀번호를 다시 한 번 확인해주십시오.");
					loginFailCount++;
				}
			}
		}
	}
	
	// 로그아웃
	public void logOut() {
		log = -1;
		System.out.println("로그아웃 되었습니다.");
	}
	
	// 마이페이지
	public void myPage() {
		while(true) {
			System.out.println();
			System.out.println("[1]내 정보 보기");
			System.out.println("[2]예매/구매내역");
			System.out.println("[3]포인트 이용내역");
			System.out.println("[4]이전");
			System.out.print("메뉴 선택: ");
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
				System.out.println("유효한 메뉴가 아닙니다. 다시 선택해주십시오.");
			}
		}
	}
		
	// 내 정보 보기
	public void myInfo() {
		while(true) {
			System.out.println();
			System.out.println("----------------------------");
			System.out.println("ID:      "+MovieMenu.userList.get(log).getId());
			System.out.println("생년월일:  "+MovieMenu.userList.get(log).getBirthDate());
			System.out.println("전화번호:  "+MovieMenu.userList.get(log).getPhoneNumber());
			System.out.println("이메일:    "+MovieMenu.userList.get(log).getEmail());
			System.out.println("내 포인트: "+d.format(MovieMenu.userList.get(log).getPoint())+"p");
			System.out.println("----------------------------");
			System.out.println("[1]정보수정");
			System.out.println("[2]이전");
			System.out.print("메뉴 선택: ");
			menu = scan.nextInt();
			if(menu==1) { 
				changeMyInfo();
			}
			else if(menu==2) {
				break;
			}
			else {
				System.out.println("유효한 메뉴가 아닙니다. 다시 선택해주십시오.");
			}
		}
	}
	
	// 내 정보 수정
	public void changeMyInfo() {
		while(true) {
			System.out.println();
			System.out.println("[1]PW");
			System.out.println("[2]전화번호");
			System.out.println("[3]이메일");
			System.out.println("[4]이전");
			System.out.print("변경할 정보: ");
			menu = scan.nextInt();
			if(menu==1) {
				System.out.print("PW 수정(6~12자 이내): ");
				inputPW = scan.next();
				
				if(inputPW.length()<6 || inputPW.length()>12) {
					System.out.println("PW는 최소 6자, 최대 12자까지 입력 가능합니다.");
				} else {
					MovieMenu.userList.get(log).setPw(inputPW);
					System.out.println("변경되었습니다.");
				}
				break;
			}
			else if(menu==2) {
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
						for(UserDTO u : MovieMenu.userList) {
							if(u.getPhoneNumber().equals(inputPhoneNumber)) {
								System.out.println("이미 존재하는 전화번호입니다.");
								break;
							}
						}
						MovieMenu.userList.get(log).setPhoneNumber(inputPhoneNumber);
						System.out.println("변경되었습니다.");
						break;
					}
				} catch(Exception e) {
					System.out.println("유효하지 않은 전화번호 형식입니다.");
					break;
				}
			}
			else if(menu==3) {
				if((inputEmail.contains("@naver.com")||inputEmail.contains("@daum.net")
				||inputEmail.contains("@hanmail.net")||inputEmail.contains("@gmail.com"))==false) {
					System.out.println("지원되지 않는 이메일 양식입니다.");
					break;
				}
				else {
					for(UserDTO u : MovieMenu.userList) {
						if(u.getEmail().equals(inputEmail)) {
							System.out.println("이미 존재하는 이메일입니다.");
							break;
						}
					}
					MovieMenu.userList.get(log).setEmail(inputEmail);
					System.out.println("변경되었습니다.");
					break;
				}
			}
			else if(menu==4) {
				break;
			}
			else {
				System.out.println("유효한 메뉴가 아닙니다. 다시 선택해주십시오.");
			}
		}
	}
	
	// 내 예매내역
	public void myTicket() {
		ArrayList<Integer> myTicketList = new ArrayList<>();
		for(int i=0;i<MovieMenu.ticketingList.size();i++) {
			if(MovieMenu.ticketingList.get(i).getId().equals(MovieMenu.userList.get(log).getId())) {
				myTicketList.add(i);
			}
		}
		
		while(true) {
			if(myTicketList.size()==0) {
				System.out.println("예매내역이 존재하지 않습니다.");
				break;
			}
			else {
				System.out.println();
				System.out.println("번호\t영화이름\t영화관(지역)\t예매일\t\t\t영화 상영일\t\t상영시간\t\t예매 매수\t총 금액");
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
					System.out.println(d.format(MovieMenu.ticketingList.get(myTicketList.get(i)).getCost())+"원");
				}
				System.out.print("[1]예매취소\n[2]이전\n메뉴 선택 : ");
				menu = scan.nextInt();
				if(menu==1) {
					System.out.print("취소할 번호 : ");
					int cancelNum = scan.nextInt()-1;
					int removeLog = myTicketList.get(cancelNum);
					
					MovieMenu.ticketingList.remove(removeLog);
					//MovieMenu.ticketingList.remove(myTicketList.get(cancelNum));
					System.out.println("취소되었습니다.");
					
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
					System.out.println("유효한 메뉴가 아닙니다.");
				}
			}
		}
	}
		
	// 내 포인트 이용내역
	public void myPoint() {
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("번호\t회원ID\t일자\t\t\t내용\t포인트");
		for(int i=0;i<MovieMenu.pointList.size();i++) {
			if(MovieMenu.pointList.get(i).getLog()==log) { // pointUseList에 담긴 내용이 로그인 된 회원의 것이라면 출력
				System.out.print("["+(i+1)+"]\t");
				System.out.print(MovieMenu.pointList.get(i).getId()+"\t");
				System.out.print(sd3.format(MovieMenu.pointList.get(i).getDate())+"\t");
				System.out.print(MovieMenu.pointList.get(i).getDetail()+"\t");
				System.out.println(d.format(MovieMenu.pointList.get(i).getPoint())+"p");
			}
		}
		System.out.println("--------------------------------------------");
	}
	
	// 예매현황 (관리자메뉴)
	public void ticket() {
		if(MovieMenu.ticketingList.size()==0) {
			System.out.println();
			System.out.println("예매내역이 존재하지 않습니다.");
		}
		else {
			System.out.println();
			System.out.println("번호\t영화이름\t영화관(지역)\t예매일\t\t\t영화 상영일\t\t상영시간\t\t예매 매수\t총 금액");
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
				System.out.println(d.format(MovieMenu.ticketingList.get(i).getCost())+"원");
			}
			System.out.println();
		}
	}
	
	// 회원목록 (관리자메뉴)
	public void userList() {
		if(MovieMenu.userList.size()==1) {
			System.out.println();
			System.out.println("회원이 존재하지 않습니다.");
		}
		else {
			System.out.println();
			System.out.println("\t\t\t--[전체 회원 내역]--");
			System.out.println("-------------------------------------------------");
			System.out.println("ID\tPW\t생년월일\t전화번호\t이메일\t포인트");
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
	
	// 회원 전체의 포인트 이용현황 (관리자메뉴)
	public void point() {
		if(MovieMenu.pointList.size()==0) {
			System.out.println();
			System.out.println("포인트 이용내역이 존재하지 않습니다.");
		}
		else {
			System.out.println();
			System.out.println("\t\t\t--[전체 포인트 이용 내역]--");
			System.out.println("--------------------------------------------");
			System.out.println("번호\t회원ID\t일자\t\t\t내용\t포인트");
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
	
	// 영화목록 (관리자메뉴)
	public void movieList() {
		System.out.println();
		System.out.println("\t\t--[영화 목록]--");
		System.out.println("-------------------------------------------------");
		System.out.println("    영화이름\t상영일");
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
