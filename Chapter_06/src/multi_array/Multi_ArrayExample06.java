package multi_array;
import java.util.*;
public class Multi_ArrayExample06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[3][3];
		int k = 1;
		int index1;
		int index2;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = k * 10;
				k++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.print("인덱스1 입력 : ");
		index1 = scan.nextInt();
		System.out.print("인덱스2 입력 : ");
		index2 = scan.nextInt();
		System.out.println("값 출력 : "+arr[index1][index2]);
		scan.close();
	}
}
