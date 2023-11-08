package array;

import java.util.Arrays;

public class ArrayTest01 {

	public static void main(String[] args) {
		int[] arr = new int[3]; // 배열을 선언하는 방식
		System.out.println(arr); // [I@626b2d4a : arr의 주소
		int[] arr1 = null; // null = 값이 없다
		System.out.println(arr1);
		int[] arr2 = null;
		int[] arr3 = {10,20,30}; // 배열 선언과 동시에 초기화
		
		double[] arr4 = new double[3];
		char[] arr5 = new char[26];
		int alpha = 65;
		for(int i=0;i<arr5.length;i++) {
			//arr5[i] = (char)alpha;
			//alpha++;
			arr5[i] = (char)(65 + i);

			System.out.println("알파벳 출력: "+arr5[i]);
		}
        String[] arr6 = {"개나리","진달래","홍길동"};
        for(int i=0;i<3;i++) {
        	System.out.println(arr6[i]);
        }
		
		
		for(int i=0;i<3;i++) {
			arr4[i] = 10 * (i+1);
			System.out.println(arr4[i]);
		}
		// 배열의 함수 종류
		System.out.println(arr.length); // 배열의 길이를 나타내는 함수
		System.out.println(Arrays.toString(arr)); // 배열의 요소를 나타내는 함수
		arr1 = Arrays.copyOf(arr,arr.length);
		System.out.println(arr1); // 배열을 복사하는 함수 [I@5e91993f copyOf 함수는 새로운 배열을 만든다.
		arr2 = arr;
		System.out.println(arr2); //[I@626b2d4a
		System.out.println(arr3[0]);
	}

}
