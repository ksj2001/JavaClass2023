package chapter_06;
public class ArrayExample01 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		for(int i=0 ; i<5 ; i++) {
			arr[i] = 10 * (i+1);
		}
		
		// 문제1) 10부터 50까지 arr 배열에 저장
		for(int i=0 ; i<5 ; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		// 문제2) 4의 배수만 출력
		for(int i=0 ; i<5 ; i++) {
			if(arr[i] % 4 == 0)
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		// 문제3) 4의 배수의 합 출력
		int sum = 0;
		
		for(int i=0 ; i<5 ; i++) {
			if(arr[i] % 4 == 0)
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		// 문제4) 4의 배수의 개수 출력
		int count = 0;
		
		for(int i=0 ; i<5 ; i++) {
			if(arr[i] % 4 == 0)
			count++;
		}
		
		System.out.println(count);
		
		// 문제5) 짝수의 개수 출력
		int even_count = 0;
		
		for(int i=0 ; i<5 ; i++) {
			if(arr[i] % 2 == 0)
			even_count++;
		}
		
		System.out.println(even_count);		
	}
}
