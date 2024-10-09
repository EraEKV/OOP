package task2;

public class Queen extends Piece {
	public Queen() {

	}
	
	public Queen(Position a) {
		super(a);
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		if (!b.isValid()) return false;
		
		int deltaX = this.deltaX(b);
		int deltaY = this.deltaY(b);
        
		return new Rook(this.a).isLegalMove(b) || new Bishop(this.a).isLegalMove(b);
	}
	
	public String toString() {
		return super.toString() + " [Queen]";
	}
}