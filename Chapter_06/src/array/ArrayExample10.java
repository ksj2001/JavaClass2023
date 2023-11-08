package array;
import java.util.*;
public class ArrayExample10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {10,20,30,40,50};
		int temp = 0;
		int index1;
		int index2;
		int value1;
		int value2;
		//문제1
		System.out.print("인덱스1 입력 : ");
		index1 = scan.nextInt();
		System.out.print("인덱스2 입력 : ");
		index2 = scan.nextInt();
		temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		System.out.print("{ ");
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("}");
		System.out.println();
		//문제2
		System.out.print("값1 입력 : ");
		value1 = scan.nextInt();
		for(int i=0;i<5;i++) {
			if(arr[i]==value1) {
			// if(value1==arr[i]) { ... 안 되는 이유?
				index1 = i;
			}
		}
		System.out.print("값2 입력 : ");
		value2 = scan.nextInt();
		for(int i=0;i<5;i++) {
			if(arr[i]==value2) {
				index2 = i;
			}
		}
		temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		System.out.print("{ ");
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("}");
		scan.close();
	}
}
