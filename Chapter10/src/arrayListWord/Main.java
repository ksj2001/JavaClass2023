package arrayListWord;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		Vector<Word> wordList = new Vector<>();
		Vector<String> optionList = new Vector<>(); 
		int optionCheck = -1;
		
		wordList.add(new Word("extends","상속"));
		wordList.add(new Word("character","문자"));
		wordList.add(new Word("overriding","재정의"));
		wordList.add(new Word("constructor","생성자"));
		wordList.add(new Word("abstract","추상"));
		wordList.add(new Word("integer","정수"));
		wordList.add(new Word("implement","구현하다"));
		wordList.add(new Word("double","실수"));
		wordList.add(new Word("array","배열"));
		wordList.add(new Word("string","문자열"));
		
		System.out.println("Java 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("현재 "+wordList.size()+"개의 단어가 들어 있습니다.");
		while(true) {
			System.out.println("----------------------------------------");
			int ranNum = ran.nextInt(wordList.size());
			String question = wordList.get(ranNum).getEngWord(); // 질문(영어 단어)
			System.out.println(question+"?");
			String answer = wordList.get(ranNum).getKorWord(); // 정답(한국 단어)
			optionList.clear();
			
			String[] option = new String[4];
			int answerIndex = ran.nextInt(option.length); // 정답이 있는 위치
			option[answerIndex] = answer;
			optionList.add(answer);
			for(int i=0;i<option.length;i++) { // 나머지 부분은 정답 외 다른 단어들로 모두 채운다.
				if(i==answerIndex) { // 정답이 있는 위치는 넘어갈 것
					continue;
				}
				else {
					// 단순화 작업 요망
					while(true) {
						optionCheck = -1;
						option[i] = wordList.get(ran.nextInt(wordList.size())).getKorWord();
						for(int j=0;j<optionList.size();j++) {
							if( option[i] == optionList.get(j)) {
								optionCheck = 0;
							}
						}
						if(optionCheck == -1) {
							optionList.add(option[i]);
							break;
						}
					}
				}
			}
			
			for(int i=0;i<option.length;i++) {
				System.out.print("("+(i+1)+")"+option[i]+" ");
			}
			System.out.print(">> ");
			int userAns = scan.nextInt(); // 유저가 적은 번호
			
			if(userAns == -1) { // -1을 적을 경우 종료
				System.out.println("종료합니다.");
				break;
			}
			else {
				// 유저가 적은 번호에 해당되는 단어가 정답과 일치할 경우
				if(option[userAns-1].equals(option[answerIndex])) {
					System.out.println("Excellent !!");
				}
				else { // 일치하지 않을 경우
					System.out.println("No !!");
				}
			}
		}
	}
}
