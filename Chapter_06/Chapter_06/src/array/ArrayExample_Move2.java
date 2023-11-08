package array;
import java.util.*;
public class ArrayExample_Move2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] seat = new String[7];
		int menu; 
		int ppl; // 예매 인원
		int index; // 좌석 번호
		int total = 0; // 총 매출액
		for(int i=0;i<7;i++) {
			seat[i] = " "; // 좌석
		}
		boolean run = true; // 반복문 기본값
		for(int i=0;i<7;i++) {
			System.out.print("["+seat[i]+"]"); // 좌석 배치 기본값
		}
		while(run) {
			System.out.println();
			System.out.println("=메가 영화관=");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1: // 좌석예매
				System.out.print("예매 인원을 입력하세요[1~7] : ");
				ppl = scan.nextInt();
				if(ppl==1) { // 예매 인원이 1명일 경우
					System.out.print("좌석번호 선택[1~7] : ");
					index = scan.nextInt();
					if(index % 2 == 0) { // 짝수는 예매 불가능
						System.out.println("예매 불가능 (짝수 번호의 좌석에는 예매가 불가능합니다.)");
						// for(int i=0;i<7;i++) {
							for(int j=0;j<3;j++) {
								if(seat[2*j+1] != "O") {
									seat[2*j+1] = "X"; // 예매 불가능 좌석 표시
								}	
							}
							for(int i=0;i<7;i++) {
							System.out.print("["+seat[i]+"]");
							}
							for(int j=0;j<3;j++) {
								if(seat[2*j+1] == "X") {
									seat[2*j+1] = " "; // 예매 불가능 좌석 표시 제거
								}
							}
						// }
					}
					else {
						if(seat[index-1]=="O") { // 예매가 완료된 자리인 경우
							System.out.println("이미 예매가 완료된 자리입니다.");
							for(int i=0;i<7;i++) {
								System.out.print("["+seat[i]+"]");
							}
						}
						else { // 예매 가능
							seat[index-1] = "O";
							total += 12000;
							for(int i=0;i<7;i++) {
								System.out.print("["+seat[i]+"]");
							}
						}
					}
				}
				if(ppl>1) { // 예매 인원이 2명 이상일 경우
					System.out.print("좌석번호 선택: ");
					index = scan.nextInt();
					if(index+ppl>7) {
						System.out.println("예매 불가능 (예매 인원이 착석하려는 자리보다 많습니다.");
						for(int i=0;i<7;i++) {
							System.out.print("["+seat[i]+"]");
						}
					}
					else {
						for(int i=index;i<index+ppl;i++) {
							seat[i-1] = "O";
							total += 12000;
						}
						for(int i=0;i<7;i++) {
							System.out.print("["+seat[i]+"]");
						}
					}
				}
				break;
			case 2: // 종료
				run = false;
				System.out.println("총 매출액 = "+total); // 총 매출액 출력
				break;
			}
		}
		scan.close();
	}
}
