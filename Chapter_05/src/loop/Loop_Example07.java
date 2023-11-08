package loop;
import java.util.*;
public class Loop_Example07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bul = 8700; // 불고기버거의 가격
		int sae = 6200; // 새우버거의 가격
		int col = 1500; // 콜라의 가격
		int num_bul = 0; // 불고기버거의 개수
		int num_sae = 0; // 새우버거의 개수
		int num_col = 0; // 콜라의 개수
		int menu = 0; // 입력받은 메뉴
		int total = 0; // 총 금액
		int count = 0;
		int cash; // 입력받은 현금
		System.out.println("=== 롯데리아 ===");
		System.out.println("1. 불고기 버거 : "+bul+"원");
		System.out.println("2. 새우 버거 : "+sae+"원");
		System.out.println("3. 콜라 : "+col+"원");
		while(count<5) {
			System.out.print("메뉴 선택 :");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				num_bul++;
				total += 8700;
				count++;
				break;
			case 2:
				num_sae++;
				total += 6200;
				count++;
				break;
			case 3:
				num_col++;
				total += 1500;
				count++;
				break;
			}	
		}
		System.out.println("총 금액 = "+total+"원");
		System.out.print("현금 입력 : ");
		cash = scan.nextInt();
		System.out.println();
		System.out.println("=== 롯데리아 영수증 ===");
		System.out.println("1. 불고기 버거 : "+num_bul+"개");
		System.out.println("2. 새우 버거 : "+num_sae+"개");
		System.out.println("3. 콜라 : "+num_col+"개");
		System.out.println("4. 총 금액 : "+total+"원");
		System.out.println("5. 잔돈 : "+(cash-total)+"원");
		scan.close();	
	}
}
