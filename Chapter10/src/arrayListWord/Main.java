package arrayListWord;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		Vector<Word> wordList = new Vector<>();
		Vector<String> optionList = new Vector<>(); 
		int optionCheck = -1;
		
		wordList.add(new Word("extends","���"));
		wordList.add(new Word("character","����"));
		wordList.add(new Word("overriding","������"));
		wordList.add(new Word("constructor","������"));
		wordList.add(new Word("abstract","�߻�"));
		wordList.add(new Word("integer","����"));
		wordList.add(new Word("implement","�����ϴ�"));
		wordList.add(new Word("double","�Ǽ�"));
		wordList.add(new Word("array","�迭"));
		wordList.add(new Word("string","���ڿ�"));
		
		System.out.println("Java �ܾ� �׽�Ʈ�� �����մϴ�. -1�� �Է��ϸ� �����մϴ�.");
		System.out.println("���� "+wordList.size()+"���� �ܾ ��� �ֽ��ϴ�.");
		while(true) {
			System.out.println("----------------------------------------");
			int ranNum = ran.nextInt(wordList.size());
			String question = wordList.get(ranNum).getEngWord(); // ����(���� �ܾ�)
			System.out.println(question+"?");
			String answer = wordList.get(ranNum).getKorWord(); // ����(�ѱ� �ܾ�)
			optionList.clear();
			
			String[] option = new String[4];
			int answerIndex = ran.nextInt(option.length); // ������ �ִ� ��ġ
			option[answerIndex] = answer;
			optionList.add(answer);
			for(int i=0;i<option.length;i++) { // ������ �κ��� ���� �� �ٸ� �ܾ��� ��� ä���.
				if(i==answerIndex) { // ������ �ִ� ��ġ�� �Ѿ ��
					continue;
				}
				else {
					// �ܼ�ȭ �۾� ���
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
			int userAns = scan.nextInt(); // ������ ���� ��ȣ
			
			if(userAns == -1) { // -1�� ���� ��� ����
				System.out.println("�����մϴ�.");
				break;
			}
			else {
				// ������ ���� ��ȣ�� �ش�Ǵ� �ܾ ����� ��ġ�� ���
				if(option[userAns-1].equals(option[answerIndex])) {
					System.out.println("Excellent !!");
				}
				else { // ��ġ���� ���� ���
					System.out.println("No !!");
				}
			}
		}
	}
}
