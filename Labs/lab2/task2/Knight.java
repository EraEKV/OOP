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
		
		int deltaX = this.deltaX(b);
		int deltaY = this.deltaY(b);
        
		return ((deltaX == 2 && deltaY == 1) || (deltaX == 1 && deltaY == 2));
	}
	
	public String toString() {
		return super.toString() + " [Knight]";
	}
}