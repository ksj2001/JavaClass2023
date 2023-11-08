package if_test;
import java.util.*; //Scanner 클래스, Random 클래스 import해오기
public class Switch_test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String grade;
		System.out.println("점수 입력: ");
		
		int score = scan.nextInt();
		
		switch(score) {
			case 90 :
				grade = "수";
				break;
			case 80 :
				grade = "우";
				break;
			case 70 :
				grade = "미";
				break;
			case 60 :
				grade = "양";
				break;
			default:
				grade = "가";
				break;
						}
		System.out.println(score+"점은 "+grade+"입니다");
		scan.close();
	}
	
}