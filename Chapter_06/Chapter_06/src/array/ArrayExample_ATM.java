package array;
import java.util.*;
public class ArrayExample_ATM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] accs = {1001,1002,0,0,0};
		int[] pws = {1111,2222,0,0,0};
		int cnt = 2;
		boolean run = true; 
		while(run) {
			for(int i=0;i<cnt;i++) {
				System.out.println((i+1)+"."+accs[i]+":"+pws[i]);
			}
			System.out.println();
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			System.out.print("메뉴 선택 : ");
			int menu = scan.nextInt();
			switch(menu) {
			case 1:
				if(cnt>=5) {
					System.out.println("더 이상 가입할 수 없습니다.");
					continue;
				}
				else {
					System.out.print("[가입]계좌번호 입력 : ");
					int input_acc = scan.nextInt();
					
					int confirmAcc = -1; // 계좌번호 중복 확인 키
					for(int i=0;i<accs.length;i++) {
						if(accs[i]==input_acc) {
							confirmAcc = i;
						}
					}
					if(confirmAcc!=-1) {
						System.out.println("계좌번호가 중복됩니다.");
						continue;
					}
					else {
						System.out.print("[가입]비밀번호 입력 : ");
						int input_pw = scan.nextInt();
						accs[cnt] = input_acc;
						pws[cnt] = input_pw;
						cnt++;
					}
				}
				break;
			case 2:
				if(cnt<0) {
					System.out.println("더 이상 탈퇴할 수 없습니다.");
					break;
				}
				else {
					System.out.print("[탈퇴]계좌번호 입력 : ");
					int input_acc = scan.nextInt();
					int confirmAcc = -1; // 계좌번호 존재 유무 확인 키
					for(int i=0;i<accs.length;i++) {
						if(accs[i]==input_acc) {
							confirmAcc = i;
						}
					}
					if(confirmAcc==-1) {
						System.out.println("존재하지 않는 계좌번호입니다.");
						break;
					}
					else{
						for(int i=confirmAcc;i<cnt-1;i++) {
							accs[i]=accs[i+1];
							pws[i]=pws[i+1];
							cnt--;
						}
					}
				}
				break;
			}		
		}
		
		// break는 현재 조건을 만족하면 for문 바깥으로 나간다
		// 그러므로 현재 출력되는 값은 아무것도 없다.
		/*for(int i=1;i<6;i++) {
			if(i % 2 == 1) {
				break;
			}
			System.out.println(i);
		}*/
		
		// continue는 현재 조건을 만족하면 for의 조건으로 분기한다
		// 그러므로 현재 출력되는 값은 짝수로 2와 4이다.
		/*for(int i=1;i<6;i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}*/
		scan.close();
	}
}
