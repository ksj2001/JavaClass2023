package shopmol;

import java.util.*;

public class Shopping extends User {
	Scanner scan = new Scanner(System.in);
	ItemManager im = new ItemManager();
	boolean run = true;
	int menu = -1;

	public void menu() {
		while (run) {
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[0]종료");
			System.out.print("메뉴선택: ");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				login();
				run = true;
				break;
			case 2:
				logout();
				break;
			case 3:
				shopMenu();
				run = true;
				break;
			case 0:
				run = false;
				System.out.println("쇼핑몰 종료");
				break;
			}
		}
		scan.close();
	}

	public void shopMenu() {
		if (log == -1) {
			System.out.println("로그인 후 이용해주십시오.");
		} 
		else {
			run = true;
			while (run) {
				System.out.println("[1]쇼핑목록");
				System.out.println("[2]장바구니");
				System.out.println("[0]뒤로가기");
				System.out.println();
				System.out.println("메뉴 선택");
				menu = scan.nextInt();
				switch (menu) {
				case 1:
					im.printCategory();
					System.out.println("쇼핑목록 선택 [뒤로가기: -1] :");
					menu = scan.nextInt();
					for (int i = 0; i < im.category.size(); i++) {
						if (menu == i) {
							im.printItemList(menu);
							System.out.println("항목을 선택 : ");
							menu = scan.nextInt();
							im.addBasket(menu);
							menu = -1;
						}
					}
					break;
				case 2:
					im.printBasket();
					break;
				case 0:
					run = false;
					break;
				}
			}
		}
	}

	public void login() {
		if (log != -1) {
			System.out.println("이미 로그인된 상태입니다.");
		}
		else {
			System.out.print("ID입력: ");
			String inputId = scan.next();
			System.out.print("PW입력: ");
			String inputPw = scan.next();
			for (int i = 0; i < id.length; i++) {
				if (id[i].equals(inputId) && pw[i].equals(inputPw))
					log = i;
			}
			if (log == -1)
				System.out.println("아이디와 비밀번호를 다시 확인해주세요.");
			else if (log == 0) {
				System.out.println("관리자입니다.");
				adminMenu();
			}
			else {
				im.fillBasket(log);
				System.out.println("[" + id[log] + "]님, 환영합니다.");
			}	
		}

	}
	
	public void adminMenu() {
		while (run) {
			System.out.println("[1]로그아웃");
			System.out.println("[2]아이템관리");
			System.out.println("[3]장바구니 출력");
			System.out.println();
			System.out.println("메뉴 선택");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				log = -1;
				System.out.println("안녕히계세요.");
				run = false;
				break;
			case 2:
				adminItem(); // 아이템 추가, 삭제, 수정
				run = true;
				break;
			case 3:
				im.printUserBasket();
				break;
			}
		}
	}
	
	public void adminItem() { // 아이템관리 (아이템 추가, 삭제, 수정)
		run = true;
		while (run) {
			System.out.println("[1]아이템 추가");
			System.out.println("[2]아이템 삭제");
			System.out.println("[3]아이템 수정");
			System.out.println("[0]뒤로가기");
			System.out.println();
			System.out.println("메뉴 선택");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				System.out.print("추가할 item의 이름 입력 : ");
				String name = scan.next();
				System.out.print("추가할 item의 가격 입력 : ");
				int price = scan.nextInt();
				System.out.println();
				im.printCategory();
				System.out.println();
				System.out.print("추가할 item의 카테고리 입력 : ");
				int categoryNum = scan.nextInt();
				im.addItem(name, price, categoryNum);
				break;
			case 2:
				for(int i=0;i<im.itemList.size();i++) {
					System.out.print("["+i+"]");
					im.itemList.get(i).printInfo();
				}
				System.out.print("삭제할 item의 번호 입력 : ");
				int num = scan.nextInt();
				im.removeItem(num);
				break;
			case 3:
				for(int i=0;i<im.itemList.size();i++) {
					System.out.print("["+i+"]");
					im.itemList.get(i).printInfo();
				}
				System.out.print("수정할 item의 번호 입력 : ");
				num = scan.nextInt();
				System.out.print("수정할 item의 이름 입력 : ");
				String updateName = scan.next();
				System.out.print("수정할 item의 가격 입력 : ");
				int updatePrice = scan.nextInt();
				im.updateItem(num,updateName,updatePrice);
				break;
			case 0:
				run = false;
				break;
			}
		}
	}
	
	public void logout() {
		if (log == -1) {
			System.out.println("로그인 후 이용해주십시오.");
		}
		else {
			im.saveUserBasket(log);
			im.clearBasket();
			log = -1;
			System.out.println("안녕히계세요.");
		}
	}

}
