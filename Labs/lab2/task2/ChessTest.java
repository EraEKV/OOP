package task2;

public class ChessTest {

    public static void main(String[] args) {
        King king = new King(new Position(Letters.D, 3));
        Queen queen = new Queen(new Position(Letters.E, 3));
        Rook rook = new Rook(new Position(Letters.A, 1));
        Bishop bishop = new Bishop(new Position(Letters.C, 1));
        Pawn pawn = new Pawn(new Position(Letters.B, 2));
        Knight knight = new Knight(new Position(Letters.G, 1));

//        legal moves
        System.out.println("legal moves: \n");
        System.out.println("King can move to D4: " + king.isLegalMove(new Position(Letters.D, 4)));
        System.out.println("Queen can move to E5: " + queen.isLegalMove(new Position(Letters.E, 5)));
        System.out.println("Rook can move to A3: " + rook.isLegalMove(new Position(Letters.A, 3)));
        System.out.println("Bishop can move to E3: " + bishop.isLegalMove(new Position(Letters.E, 3)));
        System.out.println("Pawn can move to B3: " + pawn.isLegalMove(new Position(Letters.B, 3)));
        System.out.println("Knight can move to E2: " + knight.isLegalMove(new Position(Letters.E, 2))); 

//        illegal moves
        System.out.println("\nIllegal moves: \n");
        System.out.println("King can move to D5: " + king.isLegalMove(new Position(Letters.D, 5)));
        System.out.println("Queen can move to C2: " + queen.isLegalMove(new Position(Letters.C, 2)));
        System.out.println("Rook can move to A2: " + rook.isLegalMove(new Position(Letters.B, 2)));
        System.out.println("Bishop can move to D3: " + bishop.isLegalMove(new Position(Letters.D, 3)));
        System.out.println("Pawn can move to B4: " + pawn.isLegalMove(new Position(Letters.B, 4)));
        System.out.println("Knight can move to G3: " + knight.isLegalMove(new Position(Letters.G, 3)));
    }
}
