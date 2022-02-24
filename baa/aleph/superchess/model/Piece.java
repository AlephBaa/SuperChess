package baa.aleph.superchess.model;

public class Piece {

	protected Boolean active;
	protected Boolean hide;
	protected Square currentSqure;
	protected Player player;

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isHide() {
		return hide;
	}

	public void setHide(boolean hide) {
		this.hide = hide;
	}

	public void goToSquare(Square currentSqure) {
		this.currentSqure = currentSqure;
	}

	public Square getCurrentSqure() {
		return currentSqure;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
}
