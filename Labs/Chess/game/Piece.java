package game;

import static java.util.Collections.emptySet;

import java.util.Set;

public abstract class Piece {
	public Position position;
	public final Color color;
	
	public Piece() {
		this.color = null;
	}
	
	public Piece(Color color, Position position) {
		this.position = position;
		this.color = color;
	}
	
	public abstract boolean isLegalMove(Position newPosition, Board board);
	
	
	public Set<Position> getAvailableMoveSquares(Board board) {
		Set<Position> availableMoveSquares = emptySet();
		
		return availableMoveSquares;
	}
	
	public Position getPosition() {
		return this.position;
	}
	
	
	public String toString() {
		return "Piece[" + 
				"pos=" + position;
	}
}
