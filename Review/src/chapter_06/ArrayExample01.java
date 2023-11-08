package chapter_06;
public class ArrayExample01 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		for(int i=0 ; i<5 ; i++) {
			arr[i] = 10 * (i+1);
		}
		
		// ����1) 10���� 50���� arr �迭�� ����
		for(int i=0 ; i<5 ; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		// ����2) 4�� ����� ���
		for(int i=0 ; i<5 ; i++) {
			if(arr[i] % 4 == 0)
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		// ����3) 4�� ����� �� ���
		int sum = 0;
		
		for(int i=0 ; i<5 ; i++) {
			if(arr[i] % 4 == 0)
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		// ����4) 4�� ����� ���� ���
		int count = 0;
		
		for(int i=0 ; i<5 ; i++) {
			if(arr[i] % 4 == 0)
			count++;
		}
		
		System.out.println(count);
		
		// ����5) ¦���� ���� ���
		int even_count = 0;
		
		for(int i=0 ; i<5 ; i++) {
			if(arr[i] % 2 == 0)
			even_count++;
		}
		
		System.out.println(even_count);		
	}
}
