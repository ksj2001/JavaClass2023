package returnPackage;
import java.util.*;
public class MainClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // System.in : �ֿܼ� ����ϼ���.
		//Test2 t2 = new Test2();
		//int arr[] = {10,20,30,40,50};
		//System.out.println(t2.multiple(arr));
		/*Test3 t3 = new Test3();
		while(true) {
			System.out.print("�޴� �Է� : ");
			int sel = scan.nextInt();
			if(sel==1) {
				t3.test5();
			}
			else {
				System.out.println("����");
				return;
			}
		}*/
		This t = new This("ȫ�浿","�ߵ�",30,100);
		System.out.println(t.name);
		System.out.println(t.address);
		System.out.println(t.age);
		System.out.println(t.total);
	}
}
