package baa.aleph.superchess.model;

import java.util.ArrayList;

public abstract class Position {
	private Square[][] squares;
	// Out of the board peices will be in bowl
	private ArrayList<Peice> pocket;

	public Position(int x, int y) {
		this.squares = new Square[x][y];
	}

	public void addToPocket(Peice peice) {
		pocket.add(peice);
	}

	public Peice pickFromPocket(Peice p) {
		for (Peice peice : pocket) {
			if (peice.getName().equals(p.getName()) && peice.getPlayer().equals(p.getPlayer())) {
				pocket.remove(peice);
				return peice;
			}
		}
		return null;
	}
}
