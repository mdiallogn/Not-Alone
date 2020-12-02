package fr.univnantes.alma.model.cards;

import fr.univnantes.alma.model.inerfaces.CardInterface;
import fr.univnantes.alma.model.utlis.Phase;


import java.util.UUID;

public abstract class Card implements CardInterface {
    private Object  title;
    private Phase phase;
    private String description;
    private UUID id;

    public Card(Object title, Phase phase) {
        this.title = title;
        this.phase = phase;
        this.description = this.addDescription(title);
        this.id = this.generateId();
    }

    public UUID generateId(){
        UUID uniqID = UUID.randomUUID();
        return uniqID;
    }

    @Override
    public UUID getId() {
        return id;
    }
    @Override
    public Object getTitle() {
        return title;
    }

    @Override
    public Phase getPhase() {
        return phase;
    }
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString(){
        return "["+this.title+"\n"+this.description+"\n"+this.phase+"]";
    }

    public abstract String addDescription(Object cardTitle);
    public abstract void effect(Object cardTitle);
}
