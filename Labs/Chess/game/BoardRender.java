package game;

import static java.util.Collections.emptySet;

import java.util.Set;

public class BoardRender {
	
	public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE_PIECE_COLOR = "\u001B[97m";
    public static final String ANSI_BLACK_PIECE_COLOR = "\u001B[30m";

    public static final String ANSI_WHITE_SQUARE_BACKGROUND = "\u001B[47m";

    public static final String ANSI_BLACK_SQUARE_BACKGROUND = "\u001B[0;100m";

    public static final String ANSI_HIGHLIGHTED_SQUARE_BACKGROUND = "\u001B[45m";
	
    
    
    public void render(Board board, Piece pieceToMove) { 
    	Set<Position> availableMoveSquares = emptySet();
    	if (pieceToMove != null) {
            availableMoveSquares = pieceToMove.getAvailableMoveSquares(board);
        }
    	
    	for(int y = 8; y >= 1; y--) {
			String line = "";
			for(Letters x : Letters.values()) {
				Position pos = new Position(x, y);
				boolean isHighlight = availableMoveSquares.contains(pos);
				if(board.isSquareEmpty(pos)) {
					line += this.getSpriteForEmptySquare(pos, isHighlight);
				} else {
					line += this.getPieceSprite(board.getPiece(pos), isHighlight);
				}
				System.out.println(x + String.valueOf(y));
			}
		}
    }
    
    
	public void render(Board board) {
		render(board, null);		
	}
	
	private String colorizeSprite(String sprite, Color pieceColor, boolean isSquareDark, boolean isHighlight) {
//		formar = bg color + font color + text
		
		String result = sprite;

        if (pieceColor == Color.WHITE) {
            result = ANSI_WHITE_PIECE_COLOR + result;
        } else {
            result = ANSI_BLACK_PIECE_COLOR + result;
        }

        if (isHighlight) {
            result = ANSI_HIGHLIGHTED_SQUARE_BACKGROUND + result;
        } else if (isSquareDark) {
            result = ANSI_BLACK_SQUARE_BACKGROUND + result;
        } else {
            result = ANSI_WHITE_SQUARE_BACKGROUND + result;
        }

        return result;
	}
	
	private String getSpriteForEmptySquare(Position position, boolean isHighlight) {
        return colorizeSprite("   ", Color.WHITE, Board.isSquareDark(position), isHighlight);
    }
	
	private String selectUnicodeSpriteForPiece(Piece piece) {
        switch (piece.getClass().getSimpleName()) {
            case "Pawn":
                return "♟︎";

            case "Knight":
                return "♞";

            case "Bishop":
                return "♝";

            case "Rook":
                return "♜";

            case "Queen":
                return "♛";

            case "King":
                return "♚";
        }

        return "";
    }
	
	private String getPieceSprite(Piece piece, boolean isHighlight) {
        return colorizeSprite(
                " " + selectUnicodeSpriteForPiece(piece) + " ", piece.color, Board.isSquareDark(piece.position),
                isHighlight
        );
    }
}
