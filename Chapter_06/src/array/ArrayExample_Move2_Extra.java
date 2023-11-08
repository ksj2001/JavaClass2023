package array;
import java.util.*;
public class ArrayExample_Move2_Extra {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] seat = new int[7];
		int menu; 
		int ppl; // 예매 인원
		int index; // 좌석 번호
		int total = 0; // 총 매출액
		for(int i=0;i<7;i++) {
			seat[i] = 0; // 좌석
		}
		boolean run = true; // 반복문 기본값
		while(run) {
			/*for(int i=0;i<7;i++) {
				if(seat[i]==0) {
					System.out.print("[ ]");
				}
				if(seat[i]==1) {
					System.out.print("[O]");
				}
				if(seat[i]==2) {
					System.out.print("[X]");
				}
			}*/
			System.out.println();
			for(int j=0;j<3;j++) {
				if(seat[2*j+1] == 2) {
					seat[2*j+1] = 0; // 예매 불가능 좌석 표시 제거
				}
			}
			System.out.println("=메가 영화관=");
			System.out.println("1.좌석예매");
			System.out.println("2.예매취소");
			System.out.println("3.종료");
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1: // 좌석예매
				// 홀수 인원을 입력하면 2명, 2명 ... 1명
				// 2명의 경우 짝수 자리를 입력하면 홀수도 자동으로 채워짐. 반대 경우도 마찬가지 (+24000)
				// 1명의 경우 짝수 자리를 입력하면 홀수 자리를 입력할 때까지 반복해서 입력하라고 나옴 (+12000)
				// 짝수 인원을 입력하면 2명, 2명 ... 2명 
				// 이미 채워진 자리에 중복해서 자리를 채워넣을 때에 대한 코딩은 아직 안 이루어짐
				System.out.print("예매 인원을 입력하세요[1~7] : ");
				ppl = scan.nextInt();
				for(int i=0;i<7;i++) {
					if(seat[i]==0) {
						System.out.print("[ ]");
					}
					if(seat[i]==1) {
						System.out.print("[O]");
					}
					if(seat[i]==2) {
						System.out.print("[X]");
					}
				}
				System.out.println();
				// 예매 인원이 1명일 경우
				if(ppl==1) { 
					System.out.print("좌석번호 선택[1~7] : ");
					index = scan.nextInt();
					// 좌석번호가 짝수인 경우
					if(index % 2 == 0) { // 짝수는 예매 불가능
						System.out.println("예매 불가능 (짝수 번호의 좌석에는 예매가 불가능합니다.)");
						for(int j=0;j<3;j++) {
							if(seat[2*j+1] != 1) {
								seat[2*j+1] = 2; // 예매 불가능 좌석 표시
							}	
						}
					}
					// 좌석번호가 짝수가 아닌 경우(홀수인 경우)
					else {
						if(seat[index-1]==1) { // 예매가 완료된 자리인 경우
							System.out.println("이미 예매가 완료된 자리입니다.");
						}
						else { // 예매 가능
							seat[index-1] = 1;
							total += 12000;
						}
					}
				}
				// 예매 인원이 2명 이상일 경우
				if(ppl>1) { 
					// 예매 인원이 짝수일 경우
					if(ppl%2==0) {
						for(int i=0;i<ppl/2;i++) {
							System.out.print("좌석번호 선택: ");
							index = scan.nextInt();
							// 좌석번호가 짝수일 경우
							if(index%2==0) {
								seat[index-1] = 1;
								seat[index-2] = 1;
								total += 24000;
								//System.out.println("짝수자리");
								for(int j=0;j<7;j++) {
									if(seat[j]==0) {
										System.out.print("[ ]");
									}
									if(seat[j]==1) {
										System.out.print("[O]");
									}
									if(seat[j]==2) {
										System.out.print("[X]");
									}
								}
								System.out.println();
							}
							// 좌석번호가 홀수일 경우
							else {
								System.out.println("홀수자리");
								seat[index-1] = 1;
								seat[index] = 1;
								total += 24000;
								for(int j=0;j<7;j++) {
									if(seat[j]==0) {
										System.out.print("[ ]");
									}
									if(seat[j]==1) {
										System.out.print("[O]");
									}
									if(seat[j]==2) {
										System.out.print("[X]");
									}
								} 
								System.out.println();
							}
						}
					}
					// 예매인원이 홀수일 경우
					else { 
						for(int i=0;i<(ppl-1)/2;i++) {
							System.out.print("좌석번호 선택: ");
							index = scan.nextInt();
							// 좌석번호가 짝수일 경우
							if(index%2==0) {
								seat[index-1] = 1;
								seat[index-2] = 1; // 앞자리
								total += 24000;
								for(int j=0;j<7;j++) {
									if(seat[j]==0) {
										System.out.print("[ ]");
									}
									if(seat[j]==1) {
										System.out.print("[O]");
									}
									if(seat[j]==2) {
										System.out.print("[X]");
									}
								}
								System.out.println();
							} 
							// 좌석번호가 홀수일 경우
							else {
								seat[index-1] = 1;
								seat[index] = 1; // 뒷자리
								total += 24000;
								for(int j=0;j<7;j++) {
									if(seat[j]==0) {
										System.out.print("[ ]");
									}
									if(seat[j]==1) {
										System.out.print("[O]");
									}
									if(seat[j]==2) {
										System.out.print("[X]");
									}
								}
								System.out.println();
							}
						}
						// 마지막에는 1자리 선택
						System.out.print("좌석번호 선택: ");
						index = scan.nextInt();
						// 홀수 번호의 좌석에 예매할 때까지 반복
						while(index%2==0) {
							System.out.println("홀수 번호의 좌석에 예매해주십시오.");
							System.out.print("좌석번호 선택: ");
							index = scan.nextInt();
						}
						seat[index-1] = 1;
						total += 12000;
						for(int i=0;i<7;i++) {
							if(seat[i]==0) {
								System.out.print("[ ]");
							}
							if(seat[i]==1) {
								System.out.print("[O]");
							}
							if(seat[i]==2) {
								System.out.print("[X]");
							}
						}
					}

				}
				break;

			case 2: // 예매취소
				// 홀수를 입력하면 그 뒤에 있는 좌석번호도 0으로 바뀜 (-24000)
				// 짝수를 입력하면 그 앞에 있는 좌석번호도 0으로 바뀜 (-24000)
				// 앞이나 뒤에 있는 좌석번호가 0이라면 입력한 자리만 0으로 바뀜 (-12000)
				System.out.print("취소할 좌석번호 입력 : ");
				index = scan.nextInt();
				// 좌석번호가 짝수일 경우
				if(index%2==0) {
					// 좌석번호, 그 앞자리 둘 다 모두 예매가 되어있으면
					if(seat[index-1]==1 && seat[index-2]==1) { 
						seat[index-1] = 0;
						seat[index-2] = 0;
						total -= 24000;
						for(int i=0;i<7;i++) {
							if(seat[i]==0) {
								System.out.print("[ ]");
							}
							if(seat[i]==1) {
								System.out.print("[O]");
							}
							if(seat[i]==2) {
								System.out.print("[X]");
							}
						}
					}
					// 좌석번호 한 자리에만 예매가 되어있으면 (앞자리 예매 x)
					else {
						seat[index-1] = 0;
						total -= 12000;
						for(int i=0;i<7;i++) {
							if(seat[i]==0) {
								System.out.print("[ ]");
							}
							if(seat[i]==1) {
								System.out.print("[O]");
							}
							if(seat[i]==2) {
								System.out.print("[X]");
							}
						}
					}
				}
				// 좌석번호가 홀수일 경우
				else {
					// 좌석번호, 그 뒷자리 둘 다 모두 예매가 되어있으면
					if(seat[index-1]==1 && seat[index]==1) {
						seat[index-1] = 0;
						seat[index] = 0;
						total -= 24000;
						for(int i=0;i<7;i++) {
							if(seat[i]==0) {
								System.out.print("[ ]");
							}
							if(seat[i]==1) {
								System.out.print("[O]");
							}
							if(seat[i]==2) {
								System.out.print("[X]");
							}
						}
					}
					// 좌석번호 한 자리에만 예매가 되어있으면 (뒷자리 예매 x)
					else {
						seat[index-1] = 0;
						total -= 12000;
						for(int i=0;i<7;i++) {
							if(seat[i]==0) {
								System.out.print("[ ]");
							}
							if(seat[i]==1) {
								System.out.print("[O]");
							}
							if(seat[i]==2) {
								System.out.print("[X]");
							}
						}
					}
				}
				break;
			case 3: // 종료
				run = false;
				System.out.println("총 매출액 = "+total); // 총 매출액 출력
				break;
			}
		}
		scan.close();
	}
}
