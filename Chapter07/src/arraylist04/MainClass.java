package arraylist04;
import java.util.*;
public class MainClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> nicknamelist = new ArrayList<>();
		int[] nameLength = new int[5];
		String name = "";
		int maxLength = 0;
		String maxName = "";
		int cnt = 0;
		for(int i=0;i<5;i++) {
			System.out.println("������ �Է��� �ּ���!");
			name = scan.next();
			nicknamelist.add(name);
		}
		for(int i=0;i<nicknamelist.size();i++) {
			nameLength[i] = nicknamelist.get(i).length(); // ������ ���̸� ��� ���ڷ� �� �迭�� �־��ش�
			if(maxLength<nameLength[i]) {
				maxLength = nameLength[i];
				maxName = nicknamelist.get(i);
			}
			else if(maxLength==nameLength[i]) {
				maxName = maxName+" "+nicknamelist.get(i);
			}
		}
		System.out.println("���� ���̰� �� ������ > "+maxName);
	}
}
