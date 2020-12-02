package fr.univnantes.alma.model.inerfaces;

import fr.univnantes.alma.model.utlis.Phase;

import java.util.UUID;

public interface CardInterface {
    public UUID getId();
    public Phase getPhase();
    public String getDescription();
    public Object getTitle();
}
