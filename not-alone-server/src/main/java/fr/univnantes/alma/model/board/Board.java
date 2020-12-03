package fr.univnantes.alma.model.board;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private int nbLines;
    private int nbColumns;
    private List<Box> boxes;

    public Board(int nbLines, int nbColumns) {
        this.nbLines = nbLines;
        this.nbColumns = nbColumns;
        boxes = new ArrayList<>();
        this.initBoard();
    }

    public int getNbLines() {
        return nbLines;
    }

    public int getNbColumns() {
        return nbColumns;
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    public void initBoard(){
        for (int i = 0; i<this.nbLines; i++){
            for(int j=0; j<this.nbColumns; j++){
                Box box = new Box(i, j);
                this.boxes.add(box);
            }
        }
    }
}
