package array;
import java.util.*;
public class ArrayExample05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] hakbuns = {1001,1002,1003,1004,1005};
		int[] scores = {87,11,45,98,23};
		int hakbun;
		int check = -1; // �������� �ʴ� �й��� index ��ȣ
		System.out.print("�й� �Է� : ");
		hakbun = scan.nextInt();
		for(int i=0;i<5;i++) {
			if(hakbun==hakbuns[i]) {
			//	System.out.println("���� : "+scores[i]+"��");
				//break;
				check = i;
			}
		//	else if(hakbun!=hakbuns[i] && i==4) {
			//	System.out.println("�ش��й��� �������� �ʽ��ϴ�.");
			//}
		}
		
		if(check == -1) {
			System.out.println("�ش��й��� �������� �ʽ��ϴ�.");
		}else {
			System.out.println("���� : "+scores[check]+"��");
		}
	}
}
