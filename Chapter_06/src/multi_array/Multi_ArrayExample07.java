package multi_array;
import java.util.*;
public class Multi_ArrayExample07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[3][3];
		int k = 1;
		int value1 = 0;
		int value2 = 0;
		int index1_1 = 0;
		int index1_2 = 0;
		int index2_1 = 0;
		int index2_2 = 0;
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = k * 10;
				k++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.print("값1 입력 : ");
		value1 = scan.nextInt();
		System.out.print("값2 입력 : ");
		value2 = scan.nextInt();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(value1==arr[i][j]) {
					index1_1 = i;
					index1_2 = j;
				}
				else if(value2==arr[i][j]) {
					index2_1 = i;
					index2_2 = j;
				}
			}
		}
		temp = arr[index1_1][index1_2];
		arr[index1_1][index1_2] = arr[index2_1][index2_2];
		arr[index2_1][index2_2] = temp;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		scan.close();
	}
}
