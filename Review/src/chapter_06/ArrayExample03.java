package chapter_06;
import java.util.*;
public class ArrayExample03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {87, 11, 45, 98, 23};
		
		// ����1) �ε����� �Է¹޾� ���� ���
		System.out.print("�ε��� �Է� :");
		int index = scan.nextInt();
		System.out.println("����: "+arr[index]+"��");
		
		// ����2) ������ �Է¹޾� �ε��� ���
		System.out.print("���� �Է� :");
		int score = scan.nextInt();
		for(int i = 0; i < 5 ; i++) {
			if(arr[i]==score)
				index = i;
		}
		System.out.println("�ε���: "+index);
		
		scan.close();
	}
}
