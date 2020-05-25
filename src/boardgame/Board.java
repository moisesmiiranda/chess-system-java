package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	//Retorna uma piece a partir das coordenadas ( linha e coluna )
	public Piece piece (int row, int column) {
		return pieces[row][column];
	}
	
	//Retorna uma posição a partir de uma peça
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	//Metodo para inserir um objeto (peça) em uma posição no tabuleiro(matriz)
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	
}
