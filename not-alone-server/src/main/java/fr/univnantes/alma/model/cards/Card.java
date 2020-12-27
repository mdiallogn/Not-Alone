package fr.univnantes.alma.model.cards;

import fr.univnantes.alma.model.players.PlayerInterface;

public abstract class Card implements CardInterface {
    private Object name;
    private String description;
    private PlayerInterface owener;

    public Card(Object name) {
        this.name = name;
        this.description = this.addDescription(name);
        this.owener = null;
    }

    public PlayerInterface getOwener() {
        return owener;
    }


    public void setOwener(PlayerInterface owener) {
        this.owener = owener;
    }

    @Override
    public Object getName() {
        return name;
    }


    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString(){
        return "["+this.name +"\n"+this.description+"]";
    }

    public abstract String addDescription(Object cardTitle);
    public abstract void executeEffect(Object cardTitle);
}
