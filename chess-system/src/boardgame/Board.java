package boardgame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1) {
            throw new BoardException("Erro ao criar tabuleiro, a linha e culuna precisa ser maior que 0");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

    public Piece piece(int row, int column) {
        if (!positionExists(row, column)) {
            throw new BoardException("Posição não está no tabuleiro");
        }
        return pieces[row][column];
    }

    public Piece piece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Posição não está no tabuleiro");
        }
        return pieces[position.getRow()][position.getColum()];
    }

    public void placePiece(Piece piece, Position position) { // colocar peça na posição
        if (thereIsAPiece(position)) {
            throw new BoardException("Já existe uma peça nessa posição do tabuleiro " + position);
        }
        pieces[position.getRow()][position.getColum()] = piece;
        piece.position = position;
    }
    public Piece removePiece(Position position){
        if (!positionExists(position)) {
            throw new BoardException("Posição não está no tabuleiro");
        }
        if(piece(position) == null){
            return null;
        }
        Piece aux = piece(position);
        aux.position = null;
        pieces[position.getRow()][position.getColum()] = null;
        return  aux;
    }

    private boolean positionExists(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public Boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColum());
    }

    public boolean thereIsAPiece(Position position) { // há uma peça
        if (!positionExists(position)) {
            throw new BoardException("Posição não está no tabuleiro");
        }
        return piece(position) != null;
    }


}
