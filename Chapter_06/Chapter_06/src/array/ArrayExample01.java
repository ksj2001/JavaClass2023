package array;

public class ArrayExample01 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int sum = 0;
		int count = 0;
		int count1 = 0;
		for(int i=0;i<5;i++) {
			arr[i] = 10 * (i+1);
			//System.out.print(arr[i]+" ");
			//System.out.println();
			if(arr[i]%4==0) {
				System.out.print(arr[i]+" ");
				sum += arr[i];
				count++;
			}
			if(arr[i]%2==0) {
				count1++;
			}
		}
		System.out.println();
		System.out.println(sum);
		System.out.println(count);
		System.out.println(count1);
		
	}

}
