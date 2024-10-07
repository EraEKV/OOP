package task2;

public class Knight extends Piece {
	public Knight() {

	}
	
	public Knight(Position a) {
		super(a);
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		if (!b.isValid()) return false;
		
		int deltaX = Math.abs(b.x.ordinal() - a.x.ordinal());
        int deltaY = Math.abs(b.y - a.y);
        
		return ((deltaX == 2 && deltaY == 1) || (deltaX == 1 && deltaY == 2));
	}
	
	public String toString() {
		return super.toString() + " [Knight]";
	}
}