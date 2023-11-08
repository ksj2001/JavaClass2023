package classpart05;

public class ClassEx05 {
//멤버변수
	int[] answer = {1,3,4,2,5};
	int[] hgd = new int[5];
	int cnt = 0;
	int score = 0;
	String cr = ""; // "O"가 들어갈 변수
	String ns = ""; // "X"가 들어갈 변수
	
//메서드
	public void answerInfo() {
		System.out.print("answer = ");
		for(int i=0;i<answer.length;i++) {
			System.out.print(answer[i]+" ");
		}
		System.out.println();
		System.out.print("hgd = ");
		for(int i=0;i<answer.length;i++) {
			System.out.print(hgd[i]+" ");
		}
		System.out.println();
		System.out.print("정오표 = ");
		for(int i=0;i<answer.length;i++) {
			if(answer[i]==hgd[i]) {
				System.out.print(cr+" ");
			}
			else {
				System.out.print(ns+" ");
			}
		}
		System.out.println();	
	}
	public void totalScore() {
		System.out.println("성적 : "+score);
	}
}
