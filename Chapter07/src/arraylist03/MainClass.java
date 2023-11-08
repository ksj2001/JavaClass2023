package arraylist03;
import java.util.*;
public class MainClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> namelist = new ArrayList<>();
		String name = "";
		int cnt = 0;
		for(int i=0;i<5;i++) {
			System.out.println("이름을 입력해 주세요");
			name = scan.next();
			namelist.add(name);
		}
		System.out.println("성이 '김'인 분들의 이름을 모두 출력합니다.");
		for(int i=0;i<namelist.size();i++) {
			if(namelist.get(i).startsWith("김")) {
				System.out.println(namelist.get(i));
				cnt++;
			}
		}
		System.out.println("김씨 성을 가진 분은 모두 "+cnt+"명 입니다.");
	}
}
