package baa.aleph.superchess.model;

public abstract class Piece {

	protected Square currentSquare;
	protected Player player;

	public void goToSquare(Square currentSqure) {
		this.currentSquare = currentSqure;
	}

	public Square getCurrentSquare() {
		return currentSquare;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public abstract boolean canPerform(Action action);
}
