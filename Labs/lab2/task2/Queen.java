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
		
		int deltaX = Math.abs(b.x.ordinal() - a.x.ordinal());
        int deltaY = Math.abs(b.y - a.y);
        
		return (deltaX == deltaY || deltaX == 0 || deltaY == 0);
	}
	
	public String toString() {
		return super.toString() + " [Queen]";
	}
}