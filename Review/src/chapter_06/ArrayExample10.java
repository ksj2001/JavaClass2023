package chapter_06;
import java.util.*;
public class ArrayExample10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {10,20,30,40,50};
		int index1 = -1; // 인덱스1
		int index2 = -1; // 인덱스2
		int value1 = 0; // 값1
		int value2 = 0; // 값2
		
		// 문제1) 인덱스 2개를 입력받아 값 교체하기
		System.out.print("인덱스1 입력 : ");
		index1 = scan.nextInt();
		System.out.print("인덱스2 입력 : ");
		index2 = scan.nextInt();
		
		int temp = 0; // 임시값 설정
		temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		
		for(int i=0 ; i<5 ; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		// 문제2) 값 2개를 입력받아 값 교체하기
		System.out.print("값1 입력 : ");
		value1 = scan.nextInt();
		System.out.print("값2 입력 : ");
		value2 = scan.nextInt();
		
		for(int i=0 ; i<5 ; i++) { 
			if(arr[i]==value1) {
				index1 = i;  // 일치하는 값의 인덱스를 인덱스1로 설정
			}
		}
		
		for(int i=0 ; i<5 ; i++) {
			if(arr[i]==value2) {
				index2 = i; // 일치하는 값의 인덱스를 인덱스2로 설정
			}
		}
		
		temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		
		for(int i=0 ; i<5 ; i++) {
			System.out.print(arr[i]+" ");
		}
		
		scan.close();
	}
}
