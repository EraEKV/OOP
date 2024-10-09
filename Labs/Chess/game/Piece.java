package game;

import java.util.HashSet;
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
	
	public abstract boolean isValidMove(Position newPosition, Board board);
	
	
	public Position getPosition() {
		return this.position;
	}
	
	
	public String toString() {
		return "Piece[" + 
				"pos=" + position;
	}
}
