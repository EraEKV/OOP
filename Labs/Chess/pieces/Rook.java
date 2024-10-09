package pieces;

import game.Board;
import game.Color;
import game.Piece;
import game.Position;

public class Rook extends Piece {
	
	public Rook(Color color, Position position) {
		super(color, position);
	}

	@Override
	public boolean isLegalMove(Position newPosition, Board board) {
        int x1 = position.x.ordinal() + 1, y1 = position.y;
        int x2 = newPosition.x.ordinal() + 1, y2 = newPosition.y;

        // Проверка движения по прямой линии
        if (x1 != x2 && y1 != y2) return false;

        // Проверка препятствий на пути
        if (x1 == x2) {
            int minY = Math.min(y1, y2) + 1;
            int maxY = Math.max(y1, y2);
            for (int y = minY; y < maxY; y++) {
                if (board.getPiece(new Position(x1, y)) != null) return false;
            }
        } else {
            int minX = Math.min(x1, x2) + 1;
            int maxX = Math.max(x1, x2);
            for (int x = minX; x < maxX; x++) {
                if (board.getPiece(new Position(x, y1)) != null) return false;
            }
        }

        // Проверка конечной позиции (если там фигура того же типа)
        Piece target = board.getPiece(newPosition);
        return target == null || target.getClass() != this.getClass();
    }

        Piece targetPiece = board.getPiece(newPosition);
        if (targetPiece != null && targetPiece.getClass() == this.getClass()) {
            return false;
        }

        return true; // Ход допустим
    }
}
