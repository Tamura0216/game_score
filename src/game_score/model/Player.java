package game_score.model;

public class Player {
	private String playerName;
	private int score;
	
	public Player(String playerName, int score) {
		this.playerName = playerName;
		this.score = score;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return 	"--Player Ranking--"
				+ System.lineSeparator()
				+ "Player Name：" + playerName 
				+ "/Score：" + score;
	}
}
