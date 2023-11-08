package multi_array;
import java.util.*;
public class String_Example02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] items = new String[100][2];
		int menu;
		boolean run = true;
		int count = 0;
		int category = 0;
		String item = new String("");
		// 배열 초기화
		for(int i=0;i<items.length;i++) {
			items[i][0]="";
			items[i][1]="";		
		}
		//=============================
		while(run) {
			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아이템 관리");
			System.out.println("[3]전체품목 출력");
			System.out.println("[4]프로그램 종료");
			System.out.print(": ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.print("추가할 카테고리 입력: ");
				items[count][0] = scan.next();
				count++;
				break;
			case 2:
				for(int i=0;i<count;i++) {
					System.out.println("["+i+"] "+items[i][0]);
				}
				System.out.print("카테고리를 선택하세요 : ");
				category = scan.nextInt();
				System.out.print("추가할 아이템을 입력하세요 : ");
				item = scan.next();
				items[category][1] += item+"/";
				break;
			case 3:
				for(int i=0;i<count;i++) {
					System.out.println(items[i][0]+" : "+items[i][1]);
				}
				break;
			case 4:
				run = false;
				break;
			}	
		}
		scan.close();
	}
}
