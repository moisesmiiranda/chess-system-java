package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;
	//construtor da partida obtendo um tabuleiro de 8x8
	public ChessMatch() {
		board = new Board(8,8);	
		initialSetup();
	}
	//retorna a matriz das pe�as
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i<board.getRows(); i ++) {
			for (int j = 0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j);
			}
		}
		return mat;
	}
	
	//M�doto respons�vel por iniciar a partida de xadrez colocando as pe�as no tabuleiro
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE),new Position(2,1));
		board.placePiece(new King(board, Color.BLACK),new Position(0,4));
		board.placePiece(new King(board, Color.WHITE),new Position(7,4));
	}
	
	
}
