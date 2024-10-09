package task2;

public class King extends Piece {
	public King() {

	}
	
	public King(Position a) {
		super(a);
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		if (!b.isValid()) return false;
		
		int deltaX = this.deltaX(b);
		int deltaY = this.deltaY(b);
        
		return (deltaX <= 1 && deltaY <= 1);
	}
	
	public String toString() {
		return super.toString() + " [Rook]";
	}
}