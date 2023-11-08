package loop;
import java.util.*;
public class ForLoopExample6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("홀수를 입력하세요: ");
		int num = scan.nextInt();
		if(num%2==0) {
			System.out.println("홀수가 입력되지 않았습니다.");
		}
		else {
			for(int i=1;i<=num;i++) { // 위쪽 삼각형
				for(int j=num;j>i;j--) {
					System.out.print(" ");
				}
				for(int k=1;k<=2*i-1;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=num-1;i>=1;i--) { // 아래쪽 역삼각형 (위쪽 삼각형보다 한 줄 덜 나와야 하므로 num-1)
				for(int j=num;j>i;j--) {
					System.out.print(" ");
				}
				for(int k=1;k<2*i;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		scan.close();
	}
}
