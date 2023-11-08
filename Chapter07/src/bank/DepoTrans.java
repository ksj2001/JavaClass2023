package bank;
import java.util.*;
public class DepoTrans {
	
	//멤버변수
	Scanner scan = new Scanner(System.in);
	User user = new User();
	public int inputMoney = 0; // 입금할 금액
	public String transferAcc = ""; // 이체받을 계좌번호
	public int transferLog = -1; // 이체받을 계좌번호의 위치
	public int transferMoney = 0; // 이체할 금액
	
	//함수
	public void deposit() { // 입금 함수
		if(user.log==-1) {
			System.out.println(user.log);
			System.out.println("로그인 후 이용 가능합니다.");
		}
		else {
			System.out.print("입금할 금액을 입력하세요 : ");
			inputMoney = scan.nextInt();
			user.arMoney[user.log] += inputMoney; 
			System.out.println("입금을 완료하였습니다.");
		}
	}
	
	public void transfer() { // 이체 함수
		transferLog = -1; // 위치 초기화
		if(user.log==-1) {
			System.out.println("로그인 후 이용 가능합니다.");
		}
		else {
			System.out.print("이체할 계좌번호를 입력하세요 : ");
			transferAcc = scan.next();
			for(int i=0;i<user.arAcc.length;i++) {
				if(user.arAcc[i].equals(transferAcc)) {
					transferLog = i;
				}
			}
			if(transferLog==-1) {
				System.out.println("존재하지 않는 계좌번호입니다.");
			}
			else {
				System.out.print("이체할 금액을 입력하세요 : ");
				transferMoney = scan.nextInt();
				if(transferMoney>user.arMoney[user.log]) {
					System.out.println("이체가 불가능합니다. (이체하려는 금액이 계좌 잔고보다 더 많음)");
				}
				else {
					System.out.println(transferLog);
					System.out.println(user.log);
					user.arMoney[transferLog] += transferMoney;
					user.arMoney[user.log] -= transferMoney;
					System.out.println("이체를 완료하였습니다.");
				}
			}
		}	
	}
}
