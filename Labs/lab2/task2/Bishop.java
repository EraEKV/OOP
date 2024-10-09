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
		
		int deltaX = this.deltaX(b);
		int deltaY = this.deltaY(b);
        
		return (deltaX == deltaY);
	}
	
	public String toString() {
		return super.toString() + " [Bishop]";
	}
}