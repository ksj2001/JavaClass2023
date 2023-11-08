package chapter_06_Prob05;

public class Smartphone extends Telephone{
	private String game;

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}
	
	public Smartphone() {}
	public Smartphone(String owner, String game) {
		super.owner = owner;
		this.game = game;
	}
	
	public void playGame() {
		System.out.println(owner+"가 "+game+" 게임을 하는 중이다.");
	}
}
