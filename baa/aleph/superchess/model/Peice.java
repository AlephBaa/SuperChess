package baa.aleph.superchess.model;

public abstract class Peice {
	private String name;
	private boolean active;
	private boolean hide;
	private Square currentSqure;
	private Player player;

	public Peice(String name, boolean active, boolean hide, Square currentSqure, Player player) {
		this.name = name;
		this.active = active;
		this.hide = hide;
		this.currentSqure = currentSqure;
		this.player = player;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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
