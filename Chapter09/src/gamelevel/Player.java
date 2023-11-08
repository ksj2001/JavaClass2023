package gamelevel;

public class Player {
	private PlayerLevel level;
	
	// MainBoard에서 BeginnerLevel을 인스턴스화하지 않았으나
	// 출력이 되므로 BeginnerLevel을 생성하는 생성자를 Player 클래스에 작성한다.
	public Player() {
		level = new BeginnerLevel();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
	}
	
	public void play(int cnt) {
		level.go(cnt);
	}

}
