package chapter_06;
import java.util.*;
public class ArrayExample08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] seat = new String[7]; // 좌석
		int total = 0; // 총 매출액
		boolean run = true;
		int menu; // 선택한 메뉴
		int index; // 선택한 좌석번호
		for(int i=0;i<7;i++)  {
			seat[i] = " ";
		}
		
		while(run) {
			for(int i=0;i<7;i++) {
				System.out.print("["+seat[i]+"]"); // 좌석 배치
			}
			System.out.println();
			System.out.println("=메가 영화관=");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.print("좌석번호 선택[1~7] : ");
				index = scan.nextInt();
				if(index>=1 && index<=7) {
					if(seat[index-1] == "O") {
						System.out.println("이미 예매가 완료된 자리입니다.");
					}
					else {
						seat[index-1] = "O";
						total += 12000;
					}
				}
				else {
					System.out.println("잘못된 번호입니다.");
				}	
				break;
			case 2:
				System.out.println("매출액 = "+total+"원");
				run = false;
				break;
			default:
				System.out.println("선택할 수 없는 메뉴입니다.");
				break;
			}
		}
		
		scan.close();
	}
}
