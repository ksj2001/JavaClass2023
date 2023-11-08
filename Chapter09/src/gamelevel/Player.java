package gamelevel;

public class Player {
	private PlayerLevel level;
	
	// MainBoard���� BeginnerLevel�� �ν��Ͻ�ȭ���� �ʾ�����
	// ����� �ǹǷ� BeginnerLevel�� �����ϴ� �����ڸ� Player Ŭ������ �ۼ��Ѵ�.
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
