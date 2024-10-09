package task2;

public class Rook extends Piece {
	public Rook() {

	}
	
	public Rook(Position a) {
		super(a);
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		if (!b.isValid()) return false;
		
		int deltaX = this.deltaX(b);
		int deltaY = this.deltaY(b);
		
		return a.x == b.x || a.y.equals(b.y);
	}
	
	public String toString() {
		return super.toString() + " [Rook]";
	}
}