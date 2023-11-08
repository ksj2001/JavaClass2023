package megamart;
import java.util.*;
public class Shopping {
	Scanner scan = new Scanner(System.in);
	//멤버 변수
	User user = new User();
	Basket basket = new Basket();
	String currentStatus = "로그아웃";
	boolean run = true;
	int menu = -1;
	int productNum = -1; // 상품번호
	
	//함수
	public void menu() { // MEGA MART 메뉴 출력 함수
		while(run) {
			System.out.println("-------------------------");
			status();
			System.out.println("-------------------------");
			System.out.println("[MEGA MART]");
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종료하기");
			System.out.print("메뉴선택: ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				user.logIn();
				break;
			case 2:
				user.logOut();
				break;
			case 3:
				shopping();
				break;
			case 4:
				basket.basket();
				break;
			case 0:
				end();
				break;
			default:
				System.out.println("없는 메뉴입니다.");
			}
		}
	}

	public void status() { // 로그인상태 함수
		if(user.log==-1) {
			currentStatus = "로그아웃";
			System.out.println("상태: "+currentStatus);
		}
		else {
			for(int i=0;i<user.id.length;i++) {
				if(user.log==i) {
					currentStatus = user.id[i]+"님 로그인";
					System.out.println("상태: "+currentStatus);
				}
			}
		}
	}

	public void shopping() { // 상품목록 함수
		if(user.log==-1) {
			System.out.println("로그인 후 이용 가능합니다.");
		}
		else {
			while(true) {
				System.out.println("[상품목록]");
				for(int i=0;i<basket.item.length;i++) {
					System.out.println("["+(i+1)+"]"+basket.item[i]
							+"\t"+basket.price[i]+"원");
				}
				System.out.println("[0]뒤로가기");
				System.out.print("상품번호 선택:");
				productNum = scan.nextInt();
				if(productNum==0) {
					System.out.println();
					break;
				}
				else if(productNum>4) {
					System.out.println("유효하지 않은 상품번호입니다.");
				}
				else {
					for(int i=1;i<basket.item.length+1;i++) {
						if(i==productNum) {
							basket.count(i-1);
						}
					}
				}
			}
		}
	}
	
	public void end() { // 프로그램 종료 함수
		System.out.println("쇼핑몰 종료");
		run = false;
	}
}
