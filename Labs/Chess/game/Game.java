package game;

public class Game {

	public static void main(String[] args) {
		Board board = new Board();
		board.setupDefaultPositions();
		
		BoardRender game = new BoardRender();
		game.render(board);
	}
}
