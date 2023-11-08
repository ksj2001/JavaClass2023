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
			System.out.println("별명을 입력해 주세요!");
			name = scan.next();
			nicknamelist.add(name);
		}
		for(int i=0;i<nicknamelist.size();i++) {
			nameLength[i] = nicknamelist.get(i).length(); // 문자의 길이를 세어서 숫자로 된 배열에 넣어준다
			if(maxLength<nameLength[i]) {
				maxLength = nameLength[i];
				maxName = nicknamelist.get(i);
			}
			else if(maxLength==nameLength[i]) {
				maxName = maxName+" "+nicknamelist.get(i);
			}
		}
		System.out.println("가장 길이가 긴 별명은 > "+maxName);
	}
}
