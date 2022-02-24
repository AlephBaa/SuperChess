package baa.aleph.superchess.model;

import java.util.List;

public abstract class GameState {
	private List<Rule> rules;
	private List<Player> players;
	private List<Position> history;
	private Position currentPosition;
	private Result result;

	public GameState(Position currentPosition) {
		this.currentPosition = currentPosition;
	}

	public Result getResult() {
		return result;
	}

	public void addRule(Rule rule) {
		rules.add(rule);
	}

	public void addPlayer(Player player) {
		players.add(player);
	}

	public boolean isLegal(Action action) {
		for (Rule rule : rules) {
			if (rule.isLegal(action) >= 0) {
				return false;
			}
		}
		return true;
	}

	// apply the changes of the GameState
	public abstract void act(Action action);
}
