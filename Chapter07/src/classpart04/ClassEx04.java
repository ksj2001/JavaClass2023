package classpart04;
import java.util.*;
class Ex04{
	int[] hakbuns = {1001,1002,1003,1004,1005};
	int[] scores = new int[5];
}
public class ClassEx04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		Ex04 ex = new Ex04();
		int total = 0;
		double avg = 0.0;
		int pass_num = 0;
		int index = 0;
		int grade = 0;
		int hakbun = 0;
		int max_hakbun = 0;
		int max_grade = 0;
		int max_index = 0;
		//문제1
		for(int i=0;i<ex.scores.length;i++) {
			ex.scores[i] = ran.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(ex.scores));
		//문제2
		for(int i=0;i<ex.scores.length;i++) {
			total += ex.scores[i];
		}
		avg = (double)total / (double)ex.scores.length;
		System.out.println("총점("+total+") 평균("+avg+")");
		//문제3
		for(int i=0;i<ex.scores.length;i++) {
			if(ex.scores[i]>=60) {
				pass_num++;
			}
		}
		System.out.println("합격생 수: "+pass_num+"명");
		//문제4
		System.out.print("인덱스 입력 :");
		index = scan.nextInt();
		for(int i=0;i<ex.scores.length;i++) {
			if(index==i) {
				grade = ex.scores[i];
			}
		}
		System.out.println("성적 :"+grade+"점");
		//문제5
		System.out.print("성적 입력 :");
		grade = scan.nextInt();
		for(int i=0;i<ex.scores.length;i++) {
			if(grade==ex.scores[i]) {
				index = i;
			}
		}
		System.out.println("인덱스 :"+index);
		//문제6
		System.out.print("학번 입력 :");
		hakbun = scan.nextInt();
		for(int i=0;i<ex.hakbuns.length;i++) {
			if(hakbun==ex.hakbuns[i]) {
				index = i;
			}
		}
		for(int i=0;i<ex.scores.length;i++) {
			if(index==i) {
				grade = ex.scores[i];
			}
		}
		System.out.println("성적 : "+grade+"점");
		//문제7
		index = -1;
		System.out.print("학번 입력 :");
		hakbun = scan.nextInt();
		for(int i=0;i<ex.hakbuns.length;i++) {
			if(hakbun==ex.hakbuns[i]) {
				index = i;
			}
		}
		if(index == -1) {
			System.out.println("해당학번은 존재하지 않습니다.");
		}
		else {
			for(int i=0;i<ex.scores.length;i++) {
				if(index==i) {
					grade = ex.scores[i];
				}
			}
			System.out.println("성적 : "+grade+"점");
		}
		//문제8
		for(int i=0;i<ex.scores.length;i++) {
			if(ex.scores[i]>max_grade) {
				max_grade = ex.scores[i];
				max_index = i;
			}	
		}
		for(int i=0;i<ex.hakbuns.length;i++) {
			if(max_index==i) {
				max_hakbun = ex.hakbuns[i];
			}
		}
		System.out.println(max_hakbun+"번("+max_grade+")점");
	}
}
