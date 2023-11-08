package chapter_04;
import java.util.*;
public class Ifexample5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bul = 8700; // 불고기버거 가격
		int sae = 6200; // 새우버거 가격
		int col = 1500; // 콜라 가격
		
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : 8700원");
		System.out.println("2.새우 버거 : 6200원");
		System.out.println("3.콜라 : 1500원");
		
		System.out.print("메뉴를 선택하세요 : ");
		int menu = scan.nextInt(); // 메뉴 번호 입력
		if(menu!=1 && menu!=2 && menu!=3) { // 1,2,3이 아닌 메뉴번호를 입력했을 경우
			System.out.println("유효하지 않은 메뉴입니다.");
			scan.close();
			return; // 프로그램 종료
		}
		else if(menu==1) {
			menu = bul; // 메뉴값 = 불고기버거 가격
		}
		else if(menu==2) {
			menu = sae; // 메뉴값 = 새우버거 가격
		}
		else {
			menu = col; // 메뉴값 = 콜라 가격
		}
		
		System.out.print("현금을 선택하세요 : ");
		int cash = scan.nextInt(); // 보유한 현금
		if(cash<menu) { // 보유한 현금보다 시키려는 메뉴값이 비싸면
			System.out.println("현금이 부족합니다.");
			scan.close();
			return; // 프로그램 종료
		}
		else {
			int change = cash-menu; // 잔돈
			System.out.println("잔돈 : "+change+"원");
		}
		
		scan.close();
	}
}
