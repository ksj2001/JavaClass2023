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
		//����1
		System.out.print("�ε���1 �Է� : ");
		index1 = scan.nextInt();
		System.out.print("�ε���2 �Է� : ");
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
		//����2
		System.out.print("��1 �Է� : ");
		value1 = scan.nextInt();
		for(int i=0;i<5;i++) {
			if(arr[i]==value1) {
			// if(value1==arr[i]) { ... �� �Ǵ� ����?
				index1 = i;
			}
		}
		System.out.print("��2 �Է� : ");
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
