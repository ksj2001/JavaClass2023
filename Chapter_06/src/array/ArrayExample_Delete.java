package array;
import java.util.*;
public class ArrayExample_Delete {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {10, 20, 30, 40, 50};
		int cnt = 5;
		int menu;
		
		boolean run = true;
		while(run) {
			for(int i=0;i<cnt;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			System.out.println(Arrays.toString(arr));
			System.out.println();
			System.out.println("[2].삭제");
			System.out.println("[0].종료");
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			switch(menu) {
			case 2:
				if(cnt<1) {
					System.out.println("더 이상 삭제할 수 없습니다.");
				}
				else {
					System.out.println("삭제할 값을 입력하세요.");
					int data = scan.nextInt();
					
					int delIndex = -1; // 값의 존재 유무를 체크하는 키. -1은 값이 없음을 나타냄
					for(int i=0;i<arr.length;i++) {
						if(arr[i]==data) {
							delIndex = i; // 현재 값이 존재한다는 뜻
						}
					}
					if(delIndex == -1) {
						System.out.println("존재하지 않는 값입니다.");
						break;
					}
					else {
						for(int i=delIndex;i<cnt-1;i++) {
							arr[i] = arr[i+1];
						}
					}
					cnt--;
				}
				
				break;
			case 0:
				run = false;
				break;
			}
			
		}
	}
}
