package array;
import java.util.*;
public class ArrayExample03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {87,11,45,98,23};
		int index;
		int score;
		System.out.print("�ε��� �Է� : ");
		index = scan.nextInt();
		System.out.println("���� : "+arr[index]+"��");
		System.out.print("���� �Է� : ");
		score = scan.nextInt();
		for(int i=0;i<5;i++) {
			if(arr[i]==score) {
				System.out.println("�ε��� : "+i);
			}
		}
	}
}
