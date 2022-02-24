package baa.aleph.superchess.model;

import java.util.List;

public class GameState {
	protected List<Rule> rules;
	protected List<Player> players;
	protected List<GameState> history;
	protected Position currentPosition;
	protected Result result;

	// just for creating history objects
	private GameState(List<Rule> rules, List<Player> players, List<GameState> history, Position currentPosition, Result result) {
		this.rules = rules;
		this.players = players;
		this.history = history;
		this.currentPosition = currentPosition;
		this.result = result;
	}

	public GameState(Position currentPosition) {
		this.currentPosition = currentPosition;
		addHistory();
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
			if (rule.isLegal(action) < 0) {
				return false;
			}
		}
		return true;
	}

	// apply the changes of the action on this GameState
	public void act(Action action) {
		action.act(this);
		addHistory();
	}

	// Previous game states dont need to have history. so we set it to null
	private void addHistory() {
		history.add(new GameState(rules, players, null, currentPosition, result));
	}
}
