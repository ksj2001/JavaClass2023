package if_test;

public class If_test {

	public static void main(String[] args) {
		int score = 75;
		String grade;
		//90점 이상은 수
		//80점 이상은 우
		//70점 이상은 미
		//60점 이상은 양
		//그 이외에는 가
		if (score>=90) {
			grade = "수";
		}
		else if (score>=80) {
			grade = "우";
		}
		else if (score>=70) {
			grade = "미";
		}
		else if (score>=60) {
			grade = "양";
		}
		else {
			grade = "가";
		}
		System.out.println(score+"점은 "+grade+"입니다");
	}
}
