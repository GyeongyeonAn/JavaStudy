package gamelevel;

public class Player {

	// Beginner, Advanced, Super level player들이 모두 나타낼 수 있도록
	private PlayerLevel level;
	
	// 플레이어 처음 생성 
	public Player()	{
		level = new BeginnerLevel();
		level.showLevelMessage();
	}

	public PlayerLevel getLevel() {
		return level;
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
	
}
