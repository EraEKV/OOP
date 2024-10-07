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
		
		int deltaX = Math.abs(b.x.ordinal() - a.x.ordinal());
        int deltaY = Math.abs(b.y - a.y);
        
		return (deltaX <= 1 && deltaY <= 1);
	}
	
	public String toString() {
		return super.toString() + " [Rook]";
	}
}