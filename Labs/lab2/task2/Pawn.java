package task2;
// Без учета противников. Соответственно пока не может ходить по диагонали на 1 клетку.

public class Pawn extends Piece {
	public Pawn() {

	}
	
	public Pawn(Position a) {
		super(a);
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		if (!b.isValid()) return false;
		
		int deltaX = b.x.ordinal() - a.x.ordinal();
        int deltaY = b.y - a.y;
        if(deltaX == 0) {
        	if(deltaY == 2 && a.y == 1) {
        		return true;
        	}
        	if(deltaY == 1) {
        		return true;
        	}
        }
		return false;
	}
	
	public String toString() {
		return super.toString() + " [Pawn]";
	}
}