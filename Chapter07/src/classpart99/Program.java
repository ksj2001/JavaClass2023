package classpart99;
import java.util.*;
public class Program {
	Scanner scan = new Scanner(System.in);
	//멤버변수
	public String[] ids;
	public String[] pws;
	public String[] items;
	public int MAX_SIZE;
	public int[][] jang;
	public int menu;
	public boolean run;
	public String inputId; // 입력한 ID
	public String inputPw; // 입력한 PW
	public String currentStatus = new String("로그아웃"); // 현재 상태 (초기값: 로그아웃)
	public int log; // 로그인 회원의 인덱스 번호 (-1일 경우 아이디/비밀번호 불일치)
	public int productNum; // 상품번호
	public boolean run_product; // 쇼핑을 선택했을 때 상품번호 입력 반복 key
	public int cnt; // 생성된 장바구니 배열의 개수
	public int[] bag1;
	public int[] bag2;
	public int[] bag3;

	//메서드
	public void selectMenu() {
		while(run) {
			System.out.println("------------");
			System.out.println("상태 : "+currentStatus);
			System.out.println("------------");
			System.out.println("[MEGA MART]");
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
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
		if(currentStatus.equals("로그아웃")) {
			System.out.print("ID입력 : ");
			inputId = scan.next();
			System.out.print("PW입력 : ");
			inputPw = scan.next();
			for(int i=0;i<ids.length;i++) {
				if(ids[i].equals(inputId)&&pws[i].equals(inputPw)) {
					System.out.println(ids[i]+"님, 환영합니다.");
					currentStatus = ids[i]+" 로그인";
					log = i;
					run_product = true;
				}
			}
			if(log==-1) {
				System.out.println("ID와 PW를 확인해주세요.");
			}
		}
		else {
			System.out.println("이미 로그인 된 상태입니다.");
		}
	}

	public void logOut() {
		if(currentStatus.equals("로그아웃")) {
			System.out.println("로그인 후 이용 가능합니다.");
		}
		else {
			System.out.println("로그아웃 되었습니다.");
			currentStatus = "로그아웃";
			log = -1;
			jang = new int [MAX_SIZE][2];
			cnt = 0;
		}
	}

	public void shopping() {
		if(currentStatus.equals("로그아웃")) {
			System.out.println("로그인 후 이용 가능합니다.");
		}
		else {
			while(run_product) {
				System.out.println("[상품목록]");
				System.out.println("[1]사과");
				System.out.println("[2]바나나");
				System.out.println("[3]딸기");
				System.out.println("[4]뒤로가기");
				System.out.print("상품번호를 선택하세요 : ");
				productNum = scan.nextInt();
				switch(productNum) {
				case 1:
					if(cnt>=MAX_SIZE) {
						System.out.println("더 이상 추가할 수 없습니다.");
						continue; // skip 해서 while문으로 다시 감
					}
					else {
						jang[cnt][0] = log;
						jang[cnt][1] = 0;
						cnt++;
					}
					break;
				case 2:
					if(cnt>=MAX_SIZE) {
						System.out.println("더 이상 추가할 수 없습니다.");
						continue; // skip 해서 while문으로 다시 감
					}
					else {
						jang[cnt][0] = log;
						jang[cnt][1] = 1;
						cnt++;
					}
					break;
				case 3:
					if(cnt>=MAX_SIZE) {
						System.out.println("더 이상 추가할 수 없습니다.");
						continue; // skip 해서 while문으로 다시 감
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
		if(currentStatus.equals("로그아웃")) {
			System.out.println("로그인 후 이용 가능합니다.");
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
				System.out.println("사과 : "+bag1[0]+"개");
				System.out.println("바나나 : "+bag1[1]+"개");
				System.out.println("딸기 : "+bag1[2]+"개");
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
				System.out.println("사과 : "+bag2[0]+"개");
				System.out.println("바나나 : "+bag2[1]+"개");
				System.out.println("딸기 : "+bag2[2]+"개");
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
				System.out.println("사과 : "+bag3[0]+"개");
				System.out.println("바나나 : "+bag3[1]+"개");
				System.out.println("딸기 : "+bag3[2]+"개");
			}
		}
	}

	public void end() {
		System.out.println("프로그램 종료");
		run = false;
	}
}


