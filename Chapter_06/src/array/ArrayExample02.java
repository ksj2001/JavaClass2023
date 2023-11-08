package array;
import java.util.*;
public class ArrayExample02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] nameArr = {"홍길동","개나리","진달래","김백합","최동훈"};
		int[] scoreArr = new int[5];
		int sum = 0;
		for(int i=0;i<nameArr.length;i++) {
			System.out.print(nameArr[i]+"의 점수를 입력하세요");
			scoreArr[i] = scan.nextInt();
			System.out.println();
			sum += scoreArr[i];
		}
		for(int i=0;i<scoreArr.length;i++) {
			System.out.println(nameArr[i]+"의 점수 : "+scoreArr[i]);
		}
		System.out.println("평균 : "+(double)(sum/scoreArr.length));
	}
}
