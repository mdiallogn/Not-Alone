package fr.univnantes.alma.model.board;

import fr.univnantes.alma.model.players.Player;

import java.util.HashMap;
import java.util.Map;

/**
 * Une case sur le plateau
 */
public class Box {

    private int x;
    private int y;
    private Map<Player, Object> contains;

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

    public Map<Player, Object> getContains() {
        return contains;
    }
}
