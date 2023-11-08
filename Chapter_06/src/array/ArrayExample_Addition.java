package array;
import java.util.*;
public class ArrayExample_Addition {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {10, 20, 0, 0, 0};
		int cnt = 2;
		int menu;
		
		boolean run = true;
		while(run) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			System.out.println("[1].추가");
			System.out.println("[0].종료");
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				if(cnt>=5) {
					System.out.println("더 이상 추가할 수 없습니다.");
					continue; // skip 해서 while문으로 다시 감
				}
				else {
					System.out.println("추가할 값을 입력하세요.");
					int data = scan.nextInt();
					arr[cnt] = data;
					cnt++;
				}
				
				break;
			case 0:
				run = false;
				break;
			}
		}
	}
}
