package arraylist03;
import java.util.*;
public class MainClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> namelist = new ArrayList<>();
		String name = "";
		int cnt = 0;
		for(int i=0;i<5;i++) {
			System.out.println("�̸��� �Է��� �ּ���");
			name = scan.next();
			namelist.add(name);
		}
		System.out.println("���� '��'�� �е��� �̸��� ��� ����մϴ�.");
		for(int i=0;i<namelist.size();i++) {
			if(namelist.get(i).startsWith("��")) {
				System.out.println(namelist.get(i));
				cnt++;
			}
		}
		System.out.println("�达 ���� ���� ���� ��� "+cnt+"�� �Դϴ�.");
	}
}
