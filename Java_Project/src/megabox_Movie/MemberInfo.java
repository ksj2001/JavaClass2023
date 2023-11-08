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
	// 회원정보(아이디, 패스워드, 생년월일, 전화번호, 이메일) 등
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
	
	int log = -1; // (-1 : 로그아웃 상태, 그 외 : 로그인 상태 - id.get(log)이 현재 로그인한 id이다.)
	String inputID = ""; // 입력한 ID
	String inputPW = ""; // 입력한 PW
	String inputBirthDate =""; // 입력한 생년월일
	String inputPhoneNumber =""; // 입력한 전화번호
	String inputEmail =""; // 입력한 이메일
	int inputPoint = 0;
	
	//회원가입, 로그인, 로그아웃, 회원탈퇴
	public int signUp() { // 회원가입
		String myID = "";
		System.out.print("ID(6~12자 이내): ");
		inputID = scan.next();
		
		// ID 글자수 제한 체크
		if(inputID.length()<6 || inputID.length()>12) {
			return 404; // 에러 코드 404: 아이디 범위(6~12) 초과	
		} else {
			// ID 중복 체크
			for(MemberDTO m : memberList) {
				if(m.getId().equals(inputID)) {
					return 401; // 에러 코드 401: 이미 존재하는 ID
				}
			}
			myID = inputID;
		}
		
		String myPW = "";
		System.out.print("PW(6~12자 이내): ");
		inputPW = scan.next();
		
		// PW 글자수 제한 체크
		if(inputPW.length()<6 || inputPW.length()>12) {
			return 405; // 에러 코드 405: 패스워드 범위(6~12) 초과	
		} else {
			myPW = inputPW;
		}
		
		String myBirthDate = "";
		System.out.print("생년월일(ex.800205): ");
		inputBirthDate = scan.next();
		
		// 생년월일을 숫자로 변환 시 오류가 발생하는지 체크
		try {
			int intBirthDate = Integer.parseInt(inputBirthDate);
			myBirthDate = inputBirthDate;
		} catch(NumberFormatException nfe) {
			return 406; // 에러 코드 406: 생년월일 형식 오류
		}
		
		String myPhoneNumber = "";
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
			System.out.println(e);
			return 407; // 에러 코드 407: 전화번호 형식 오류
		}
		
		// 전화번호 중복 체크
		for(MemberDTO m : memberList) {
			if(m.getPhoneNumber().equals(inputPhoneNumber)) {
				return 402; // 에러 코드 402: 이미 존재하는 전화번호
			}
		}
		myPhoneNumber = inputPhoneNumber;
		
		String myEmail = "";
		System.out.print("email(네이버, 다음, 구글 이메일만 인식 가능): ");
		inputEmail = scan.next();
		
		// 이메일 양식 체크
		if((inputEmail.contains("@naver.com")||inputEmail.contains("@daum.net")
		 ||inputEmail.contains("@hanmail.net")||inputEmail.contains("@gmail.com"))==false) {
			return 408; // 에러 코드 408: 지원되지 않는 이메일 양식
		}
		else {
			// 이메일 중복 체크
			for(MemberDTO m : memberList) {
				if(m.getEmail().equals(inputEmail)) {
					return 403; // 에러 코드 401: 이미 존재하는 이메일
				}
			}
			myEmail = inputEmail;
		}
		
		inputPoint = 1000;
		return 500;
	}
	
	public void memberMenu() {
		
	}
	
	public void logIn() { // 로그인
		int loginFailCount = 0; // 로그인을 실패한 횟수 (5회 이상이 되면 6자리 랜덤 코드를 입력해야 함)
		while(true) {
			System.out.print("id 입력(뒤로가기:-1): ");
			inputID = scan.next();
			System.out.print("pw 입력(뒤로가기:-1): ");
			inputPW = scan.next();
			
			String inputCode = "";
			String code ="";
			System.out.println("가입인원"+memberList.size());
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
				for(int i=0;i<memberList.size();i++) {
					System.out.println("가입한  id:"+memberList.get(i).getId());
					if(inputID.equals(memberList.get(i).getId()) &&
					inputPW.equals(memberList.get(i).getPw())) {
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
	
	public void logOut() { //로그아웃
		log = -1;
		System.out.println("로그아웃 되었습니다.");
	}
	
	public void withdraw() { //회원탈퇴
		System.out.print("비밀번호를 입력하세요 : ");
		inputPW = scan.next();
		if(memberList.get(log).getPw().equals(inputPW)) {
			System.out.println("회원탈퇴를 하게 되면 개인정보는 즉시 파기되며, 복구가 불가능합니다.");
			System.out.println("회원탈퇴 하시겠습니까?");
			System.out.println("[1]예");
			System.out.println("[2]아니요");
			int withdrawMenu = 0; // 탈퇴 메뉴 (1,2 제외한 메뉴 선택 시 반복 / 1 선택 시 탈퇴됨)
			while(withdrawMenu!=1 || withdrawMenu!=2) {
				withdrawMenu = scan.nextInt();
				if(withdrawMenu==1) {
					memberList.remove(log);
					System.out.println("회원탈퇴가 완료되었습니다.");
				}
			}
		}
	}
	
	// 회원가입 추가 메서드
	public void addMember(MemberDTO md) {
		memberList.add(md);
	}
}
