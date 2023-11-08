package chapter_06;
import java.util.*;
public class Multi_ArrayExample07 {

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
		int index1 = 0; // 교체할 값 1
		int index2 = 0; // 교체할 값 2
		int line1 = -1; // 1번값의 행
		int row1 = -1; // 1번값의 열
		int line2 = -1; // 2번값의 행
		int row2 = -1; // 2번값의 열
		int temp = 0; // 임시값
		
		// 배열 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		// 교체할 값 1의 인덱스 찾기
		System.out.println("교체할 값 1 : ");
		index1 = scan.nextInt();
		/*
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(index1 == arr[i][j])
				line1 = i;
				row1 = j;
			}
		}
		*/
		
		// 교체할 값 2의 인덱스 찾기
		System.out.println("교체할 값 2 : ");
		index2 = scan.nextInt();
		/*
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(index2 == arr[i][j])
				line2 = i;
				row2 = j;
			}
			System.out.println();
		}
		*/
		
		// 테스트
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(index1==arr[i][j]) {
					line1 = i;
					row1 = j;
				}
				else if(index2==arr[i][j]) {
					line2 = i;
					row2 = j;
				}
			}
		}
		
		System.out.println(line1);
		System.out.println(row1);
		System.out.println(line2);
		System.out.println(row2);
		
		// 값 바꾸기
		temp = arr[line1][row1];
		arr[line1][row1] = arr[line2][row2];
		arr[line2][row2] = temp;
		
		// 값이 바뀐 배열 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(line1);
		System.out.println(row1);
		System.out.println(line2);
		System.out.println(row2);
		
		scan.close();
		
		//
		// 모르겠다~~!!!!
		//
	}

}
