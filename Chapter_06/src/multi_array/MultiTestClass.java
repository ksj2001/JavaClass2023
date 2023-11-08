package multi_array;
public class MultiTestClass {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		int k = 1;
		int sum = 0;
		int total = 0;
		int cnt = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = 10*k;
				k++;
				sum += arr[i][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j] % 4 == 0) {
					System.out.print(arr[i][j]+" ");
					total += arr[i][j];
					cnt++;
				}
			}
		}
		System.out.println();
		System.out.println("4의 배수의 합 : "+total);
		System.out.println("4의 배수의 개수: "+cnt);
		//	System.out.println(arr.length); // 행의 길이
		//	System.out.println(arr[0].length); // 열의 길이
	}

}
