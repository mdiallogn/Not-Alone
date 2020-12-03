package fr.univnantes.alma.model.board;

/**
 * Une case sur le plateau
 */
public class Box {

    private int line;
    private int column;

    public Box(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }
}
