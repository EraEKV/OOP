package task2;

public abstract class Piece {
	Position a;
	
	public Piece() {
		
	}
	
	public Piece(Position a) {
		this.a = a;
	}
	
	public abstract boolean isLegalMove(Position b);
	
	public int deltaX(Position b) {
		return Math.abs(b.x.ordinal() - a.x.ordinal());
	}
	public int deltaY(Position b) {
		return Math.abs(b.y - a.y);
	}
	
	public void setPosition(Position pos) {
		this.a = pos;
	}
	
	public Position getPosition() {
		return a;
	}
	
	public String toString() {
		return "Piece[" + 
				"pos=" + a;
	}
}
