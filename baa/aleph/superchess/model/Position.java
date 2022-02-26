package baa.aleph.superchess.model;

import java.util.List;

public class Position {

	protected List<Square> squares;

	public List<Square> getSquares() {
		return squares;
	}

	public void addSquare(Square square) {
		squares.add(square);
	}
}
