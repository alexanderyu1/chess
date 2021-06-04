public interface ChessPiece {
    int GetRow();
    int getColumn();
    String getColor();
    boolean canMove(int row, int col);
    boolean canKill(ChessPiece piece);
}
