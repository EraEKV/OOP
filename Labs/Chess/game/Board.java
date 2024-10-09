package game;

import java.util.HashMap;

import pieces.Pawn;

public class Board {
	private HashMap<Position, Piece> pieces;
	
	public Board() {
		pieces = new HashMap<>();
	}
	
	public void setPiece(Position pos, Piece p) {
		p.position = pos;
		pieces.put(pos, p);
	}

    public Piece getPiece(Position position) {
        return pieces.get(position);
    }
    
    public void movePiece(Piece piece, Position newPosition) {
    	if(piece.isLegalMove(newPosition, this)) {
    		pieces.remove(piece.getPosition());
    		piece.position = newPosition;
    		pieces.put(newPosition, piece);
    	} else {
    		System.out.println("Invalid move");
    	}
    }
	
	public void setupDefaultPositions() {
//		Pawns
		for(Letters x : Letters.values()) {
			setPiece(new Position(x, 2), new Pawn(Color.WHITE, new Position(x, 2)));
			setPiece(new Position(x, 7), new Pawn(Color.BLACK, new Position(x, 7)));
		}
	}
	
	public boolean isSquareEmpty(Position position) {
		return !pieces.containsKey(position);
	}	
	
	public static boolean isSquareDark(Position position) {
		return ((position.x.ordinal() + 1) + position.y) % 2 == 0;
	}

	public boolean isSquareAttackedByColor(Position position, Color opposite) {
		// TODO Auto-generated method stub
		return false;
	}
}
