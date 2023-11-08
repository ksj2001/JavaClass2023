package classpart05;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		//인스턴스
		Random ran = new Random();
		ClassEx05 e = new ClassEx05();
		int size = e.answer.length;
		for(int i=0;i<size;i++) {
			e.hgd[i] = ran.nextInt(5)+1;
		}
		for(int i=0;i<size;i++) {
			if(e.answer[i]==e.hgd[i]) {
				e.cnt++;
				e.score += 20;
				e.cr = "○";
			}
			else {
				e.ns = "X";
			}
		}
		e.answerInfo();
		e.totalScore();
		System.out.println(e);
	}

}
