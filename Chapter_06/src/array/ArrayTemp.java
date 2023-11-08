package array;

public class ArrayTemp {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for(int i=0;i<5;i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		arr = new int[5];
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
