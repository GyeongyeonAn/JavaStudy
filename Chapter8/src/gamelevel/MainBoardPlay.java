package gamelevel;

public class MainBoardPlay {

	public static void main(String[] args) {

		Player player = new Player();
		player.play(1);
		
		PlayerLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		PlayerLevel slevel = new SuperLevel();
		player.upgradeLevel(slevel);
		player.play(3);
	}

}
