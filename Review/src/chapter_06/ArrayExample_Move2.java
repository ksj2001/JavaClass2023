package chapter_06;

import java.util.*;

public class ArrayExample_Move2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] seat = new String[7]; // 좌석
		boolean run = true;
		int menu; // 선택한 메뉴
		int pplNum; // 선택한 예매인원
		int seatNum; // 선택한 좌석번호
		int total = 0; // 총 매출액
		int index = 0; // 예매인원이 2명 이상인 경우에 쓰이는 인덱스

		for (int i = 0; i < 7; i++) {
			seat[i] = " "; // 좌석 배치 기본값 설정
		}

		while (run) {
			for (int i = 0; i < 7; i++) {
				System.out.print("[" + seat[i] + "]"); // 좌석 배치
			}
			System.out.println();
			System.out.println("=메가 영화관=");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				for (int i = 0; i < 3; i++) { // 짝수쪽 자리에 X가 있으면 공백으로 변환
					if (seat[2 * i + 1] == "X")
						seat[2 * i + 1] = " ";
				}
				index = 0; // 인덱스 값 초기화
				
				System.out.print("예매 인원을 입력하세요[1~7] :");
				pplNum = scan.nextInt();
				if (pplNum >= 1 && pplNum <= 7) { // 예매인원 : 1명 이상, 7명 이하
					if (pplNum == 1) { // 예매인원 : 1명
						System.out.print("좌석번호 선택[1~7] : ");
						seatNum = scan.nextInt();
						if (seatNum >= 1 && seatNum <= 7) { // 1~7 사이의 좌석번호 선택
							if (seatNum % 2 == 0) { // 짝수 자리 예매 시도
								System.out.println("예매인원이 1명인 경우 짝수쪽 자리는 예매 불가능합니다.");
								for (int i = 0; i < 3; i++)
									if (seat[2 * i + 1] != "O") // 짝수쪽 자리에 예매완료된 좌석이 없으면
										seat[2 * i + 1] = "X";
							} else {
								if (seat[seatNum - 1] == "O") { // 선택한 좌석번호가 이미 예매완료 상태임
									System.out.println("이미 예매가 완료된 자리입니다.");
								} else { // 예매 성공 (1명)
									seat[seatNum - 1] = "O";
									total += 12000;
								}
							}
						} else { // 좌석번호 범위 초과 (예매인원 1명 case)
							System.out.println("잘못된 좌석번호입니다.");
						}
					} else { // 예매인원 : 2명 이상
						System.out.print("좌석번호 선택[1~7] : ");
						seatNum = scan.nextInt();
						if (seatNum >= 1 && seatNum <= 7) { // 1~7 사이의 좌석번호 선택
							if(pplNum + seatNum - 1 > 7) // 예매 인원이 착석하려는 자리보다 많은 경우
								System.out.println("예매 인원이 착석하려는 자리보다 많습니다.");
							else{
								// 선택한 좌석번호부터 예매 인원을 채워넣을 때, 예매완료된 자리와 겹치는지 확인
								for(int i=seatNum;i<seatNum+pplNum;i++) { 
									if(seat[i-1] == "O") { // 겹치는 경우
										index = -1; // 인덱스값 -1으로 설정
										System.out.println("이미 예매가 완료된 자리입니다.");
									}
								}
								
								if(index == 0) { // 선택한 좌석번호부터 예매 인원을 채워넣을 때, 예매완료된 자리와 겹치는 곳이 하나도 없는 경우
									for(int i=seatNum;i<seatNum+pplNum;i++) { // 선택한 좌석번호부터 예매 인원을 채워넣기
										seat[i-1] = "O";
										total += 12000;
									}
								}
							}
						} else { // 좌석번호 범위 초과 (예매인원 2명 이상 case)
							System.out.println("잘못된 좌석번호입니다.");
						}
					}
				} else { // 예매인원 범위 초과
					System.out.println("예매 인원이 잘못되었습니다.");
				}

				break;
			case 2:
				run = false; // 반복문 종료
				System.out.println("매출액: " + total + "원");
				break;
			default:
				System.out.println("선택할 수 없는 메뉴입니다.");
				break;
			}
		}

		scan.close();
	}
}
