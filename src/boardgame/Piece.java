package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	//método para retornar os movimentos possíveis de cada peça
	public abstract boolean [][] possibleMoves();	
	
	
	//rook method - método gancho, puxa os objetos da subclasse 
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean mat[][] = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if( mat[i][j]) {
					return true;//existe movimento possível
				}
			}
		}
		return false;//não há movimentos possíveis
	}
	
	
	
}
