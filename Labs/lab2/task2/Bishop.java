package task2;

public class Bishop extends Piece {
	public Bishop() {

	}
	
	public Bishop(Position a) {
		super(a);
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		if (!b.isValid()) return false;
		
		int deltaX = Math.abs(b.x.ordinal() - a.x.ordinal());
        int deltaY = Math.abs(b.y - a.y);
        
		return (deltaX == deltaY);
	}
	
	public String toString() {
		return super.toString() + " [Bishop]";
	}
}