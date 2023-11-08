package classpart06;
import java.util.*;
public class ClassEx06 {
	Scanner scan = new Scanner(System.in);
	//멤버변수
	int[] arPrice = {2500,3800,1500,1000};
	String[] arMenu = {"치즈버거  ","불고기버거","감자튀김  ","콜      라"};
	int[] arCount = new int[4];
	int total = 0;
	int menu = 0;
	int input = 0; // 받은 금액
	boolean run = true; // 반복문에 사용
	
	//메서드
	public void selectMenu() {
		while(run) {
			System.out.println("    [맘스터치 햄버거]    ");
			for(int i=0;i<arMenu.length;i++) {
				System.out.println((i+1)+"."+arMenu[i]+"\t"+arPrice[i]+"원");
			}
			System.out.println("----------------------");
			System.out.println("5.주문하기");
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			if(menu>=1 && menu<=4) {
				for(int i=0;i<arCount.length;i++) {
					if(i==(menu-1)) {
						arCount[i]++;
						total += arPrice[i];
					}
				}
			}
			else if(menu==5) {
				System.out.print("총 금액은 "+total+"원 입니다.돈을 입력하세요 : ");
				input = scan.nextInt();
				if(input<total) {
					System.out.println("돈이 부족합니다.");
					continue;
				}
				else {
					System.out.println();
					System.out.println("\t맘스터치");
					System.out.println("----------------------");
					System.out.println("ITEM\tQTY\tAMT");
					for(int i=0;i<arMenu.length;i++) {
						System.out.println(arMenu[i]+"   "+arCount[i]+"\t"+arCount[i]*arPrice[i]);
					}
					System.out.println("----------------------");
					System.out.println("합계금액\t"+total);
					System.out.println("합계금액\t"+input);
					System.out.println("----------------------");
					System.out.println("잔\t돈      "+(input-total));
					run = false;
				}
			}
		}
	}
}
