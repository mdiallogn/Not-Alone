package fr.univnantes.alma.model.board;

import java.util.HashMap;
import java.util.Map;

/**
 * Une case sur le plateau
 */
public class Box {

    private int x;
    private int y;
    private Map<Object, Object> contains;

    public Box(int line, int column) {
        this.x = line;
        this.y = column;
        this.contains = new HashMap<>();
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Map<Object, Object> getContains() {
        return contains;
    }
}
