package chapter_06;
import java.util.*;
public class Multi_ArrayExample06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[3][3];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		arr[2][0] = 70;
		arr[2][1] = 80;
		arr[2][2] = 90;
		int index1 = 0;
		int index2 = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.print("인덱스1 입력 : ");
		index1 = scan.nextInt();
		System.out.print("인덱스2 입력 : ");
		index2 = scan.nextInt();
		System.out.println("값 출력 : " + arr[index1][index2]);
		
		scan.close();
		
	}

}
