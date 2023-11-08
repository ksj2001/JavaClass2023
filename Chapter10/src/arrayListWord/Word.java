package arrayListWord;

public class Word {
	private String engWord; //영어 단어
	private String korWord; //한글 단어
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
