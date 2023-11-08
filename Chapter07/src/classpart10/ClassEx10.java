package classpart10;
import java.util.*;
public class ClassEx10 {
	Scanner scan = new Scanner(System.in);
	//멤버변수
	String name = "";
	int[] arHakbun = {1001,1002,1003,1004,1005};
	int[] arScore = {92,38,87,100,11};
	boolean run = true;
	int menu = 0;
	int maxScore = 0;
	int maxIndex = -1; // 최고점을 받은 학생의 학번 위치
	int minScore = 100;
	int minIndex = -1; // 최하점을 받은 학생의 학번 위치
	int inputHakbun = 0;
	int inputIndex = -1; // 입력된 학번에 해당되는 학생의 성적 위치
	//메서드
	public void run() { // 출력 함수
		while(run) {
			System.out.println("=== 메가IT 고등학교 ===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.(학번을 입력받아)성적확인하기");
			System.out.println("5.종료하기");
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				schoolScore();
				break;
			case 2:
				firstScore();
				break;
			case 3:
				lastScore();
				break;
			case 4:
				inputScore();
				break;
			case 5:
				break;
			default:
				System.out.println("없는 메뉴입니다.");
				break;
			}
		}
	}
	public void schoolScore() {
		for(int i=0;i<arScore.length;i++) {
			System.out.println((i+1)+"."+arHakbun[i]+"학번("+arScore[i]+"점)");
		}
	}
	public void firstScore() {
		for(int i=0;i<arScore.length;i++) {
			if(arScore[i]>maxScore) {
				maxScore = arScore[i];
				maxIndex = i;
			}
		}
		System.out.println("1등 학생 = "+arHakbun[maxIndex]+"학번("+maxScore+"점)");
	}
	public void lastScore() {
		for(int i=0;i<arScore.length;i++) {
			if(arScore[i]<minScore) {
				minScore = arScore[i];
				minIndex = i;
			}
		}
		System.out.println("꼴등 학생 = "+arHakbun[minIndex]+"학번("+minScore+"점)");
	}
	public void inputScore() {
		System.out.print("학번을 입력하세요 : ");
		inputHakbun = scan.nextInt();
		for(int i=0;i<arHakbun.length;i++) {
			if(inputHakbun==arHakbun[i]) {
				inputIndex = i;
			}
		}
		if(inputIndex == -1) {
			System.out.println("해당 학번은 존재하지 않습니다.");
		}
		else {
			System.out.println(arScore[inputIndex]);
		}
	}
}
