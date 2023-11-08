package array;
import java.util.*;
public class ArrayExample05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] hakbuns = {1001,1002,1003,1004,1005};
		int[] scores = {87,11,45,98,23};
		int hakbun;
		int check = -1; // 존재하지 않는 학번의 index 번호
		System.out.print("학번 입력 : ");
		hakbun = scan.nextInt();
		for(int i=0;i<5;i++) {
			if(hakbun==hakbuns[i]) {
			//	System.out.println("성적 : "+scores[i]+"점");
				//break;
				check = i;
			}
		//	else if(hakbun!=hakbuns[i] && i==4) {
			//	System.out.println("해당학번은 존재하지 않습니다.");
			//}
		}
		
		if(check == -1) {
			System.out.println("해당학번은 존재하지 않습니다.");
		}else {
			System.out.println("성적 : "+scores[check]+"점");
		}
	}
}
