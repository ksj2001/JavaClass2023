package multi_array;
import java.util.*;
public class String_Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String myName = "ȫ�浿";
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = scan.next(); // ���ڸ� �Է��� �� ���� �Լ�
		//System.out.println(name);
		/*
		 * if(name == myName) { System.out.println("true"); } else {
		 * System.out.println("false"); }
		 * 
		 * if(name.equals(myName)) { System.out.println("true"); } else {
		 * System.out.println("false"); }
		 */
		
		String a = new String(" hongpossible");
		String b = new String(" hongpossible");
		
		if(a==b) {
			System.out.println("true");
		}
		if(a.equals(b)) {
			System.out.println("A�� B�� ����");
		}
	}

}
