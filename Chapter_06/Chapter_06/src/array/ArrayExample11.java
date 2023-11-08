package array;
import java.util.*;
public class ArrayExample11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] hakbuns = {1001,1002,1003,1004,1005};
		int[] scores = {87,11,45,98,23};
		int hakbun1;
		int hakbun2;
		int hakbun1_index = 0;
		int hakbun2_index = 0;
		int temp;
		System.out.print("학번1 입력 : ");
		hakbun1 = scan.nextInt();
		for(int i=0;i<5;i++) {
			if(hakbuns[i]==hakbun1) {
				hakbun1_index = i;
			}
		}
		System.out.print("학번2 입력 : ");
		hakbun2 = scan.nextInt();
		for(int i=0;i<5;i++) {
			if(hakbuns[i]==hakbun2) {
				hakbun2_index = i;
			}
		}
		temp = scores[hakbun1_index];
		scores[hakbun1_index] = scores[hakbun2_index];
		scores[hakbun2_index] = temp;
		System.out.print("{ ");
		for(int i=0;i<5;i++) {
			System.out.print(scores[i]+" ");
		}
		System.out.print("}");
		System.out.println();
		scan.close();
	}
}
