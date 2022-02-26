package baa.aleph.superchess.model;

import java.util.List;


public abstract class Result {
	protected List<Pair> playerScores;

	public int getPlayerScore(Player player) throws Exception {
		for (Pair p : playerScores) {
			if (p.getPlayer().equals(player)) {
				return p.getScore();
			}
		}
		// TODO define a special exception for this situation
		throw new Exception("Player not found");
	}

	public void addPlayerScore(Player p, int score) {
		playerScores.add(new Pair(p, score));
	}

	public abstract boolean isGameFinished(GameState game);

	private class Pair {
		private Player player;
		private int score;

		public Pair(Player player, int score) {
			this.player = player;
			this.score = score;
		}

		public Player getPlayer() {
			return player;
		}

		public void setPlayer(Player player) {
			this.player = player;
		}

		public int getScore() {
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}
	}
}
