package arrayListWord;

public class Word {
	private String engWord; //���� �ܾ�
	private String korWord; //�ѱ� �ܾ�
	public String getEngWord() {
		return engWord;
	}
	public void setEngWord(String engWord) {
		this.engWord = engWord;
	}
	public String getKorWord() {
		return korWord;
	}
	public void setKorWord(String korWord) {
		this.korWord = korWord;
	}
	
	public Word() {}
	public Word(String engWord, String korWord) {
		this.engWord = engWord;
		this.korWord = korWord;
	}
}
