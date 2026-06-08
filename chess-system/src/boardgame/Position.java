package boardgame;

public class Position {

    private int row;
    private int colum;

    public Position() {
    }

    public Position(int colum, int row) {
        this.colum = colum;
        this.row = row;
    }

    public int getColum() {
        return colum;
    }

    public void setColum(int colum) {
        this.colum = colum;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setValues(int row, int column) {
        this.row = row;
        this.colum = column;
    }

    @Override
    public String toString() {
        return row + "," + colum;
    }
}
