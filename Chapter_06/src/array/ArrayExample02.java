package array;
import java.util.*;
public class ArrayExample02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] nameArr = {"ȫ�浿","������","���޷�","�����","�ֵ���"};
		int[] scoreArr = new int[5];
		int sum = 0;
		for(int i=0;i<nameArr.length;i++) {
			System.out.print(nameArr[i]+"�� ������ �Է��ϼ���");
			scoreArr[i] = scan.nextInt();
			System.out.println();
			sum += scoreArr[i];
		}
		for(int i=0;i<scoreArr.length;i++) {
			System.out.println(nameArr[i]+"�� ���� : "+scoreArr[i]);
		}
		System.out.println("��� : "+(double)(sum/scoreArr.length));
	}
}
