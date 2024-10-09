package pieces;

import game.Board;
import game.Color;
import game.Piece;
import game.Position;
import game.PositionShift;

import java.util.HashSet;
import java.util.Set;

public class King extends Piece {
    public King(Color color, Position position) {
        super(color, position);
    }

    @Override
    protected Set<PositionShift> getPieceMoves() {
        Set<PositionShift> result = new HashSet<>();

        for (int xShift = -1; xShift <= 1; xShift++) {
            for (int yShift = -1; yShift <= 1; yShift++) {
                if ((xShift == 0) && (yShift == 0)) {
                    continue;
                }

                result.add(new PositionShift(xShift, yShift));
            }
        }

        return result;
    }

    @Override
    protected boolean isSquareAvailableForMove(Position position, Board board) {
        boolean result = super.isSquareAvailableForMove(position, board);

        if (result) {
            return !board.isSquareAttackedByColor(position, color.opposite());
        }

        return false;
    }
}