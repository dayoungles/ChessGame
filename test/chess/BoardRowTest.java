package chess;

import junit.framework.TestCase;
import piece.Piece;

public class BoardRowTest extends TestCase {
	public void testCreate() throws Exception {
		BoardRow boardRow = new BoardRow();
		boardRow.rowAddBlank();
		boolean result = boardRow.boardPieceRow.contains(boardRow.initialPawn);
		assertTrue(result);
	}
	
	public void testAddBlackPiece() throws Exception {
		BoardRow boardRow = new BoardRow();
		boardRow.rowAddPieces(Piece.B);
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			stringBuilder.append(boardRow.boardPieceRow.get(i).getName());
		}
		String result = stringBuilder.toString();
		assertEquals("RNBQKBNR", result);
	}
	
	public void testAddWhitePiece() throws Exception {
		BoardRow boardRow = new BoardRow();
		boardRow.rowAddPieces(Piece.W);
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			stringBuilder.append(boardRow.boardPieceRow.get(i).getName());
		}
		String result = stringBuilder.toString();
		assertEquals("rnbqkbnr", result);
	}
	
	public void testAddWhitePawn() throws Exception {
		BoardRow boardRow = new BoardRow();
		boardRow.rowAddPawn(Piece.W);
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			stringBuilder.append(boardRow.boardPieceRow.get(i).getName());
		}
		String result = stringBuilder.toString();
		assertEquals("pppppppp", result);
	}
}