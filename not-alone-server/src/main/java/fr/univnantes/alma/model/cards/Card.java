package fr.univnantes.alma.model.cards;

import fr.univnantes.alma.model.inerfaces.CardInterface;
import fr.univnantes.alma.model.utlis.Phase;


import java.util.UUID;

public abstract class Card implements CardInterface {
    private Object name;
    private String description;
    private boolean power;

    public Card(Object title) {
        this.name = title;
        this.power = false;
        this.description = this.addDescription(title);
        //this.id = this.generateId();
    }


    @Override
    public boolean getPower(){
        return this.power;
    }
    @Override
    public void setPower(boolean power){
        this.power = power;
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
    public abstract void effect(Object cardTitle);
}
