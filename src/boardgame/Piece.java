package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //por padrão java ja bota nulo
	}

	protected Board getBoard() {
		return board;
	}
	
	
	
}
