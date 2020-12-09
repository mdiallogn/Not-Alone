package fr.univnantes.alma.model.inerfaces;

import java.util.List;
import java.util.UUID;

public interface PlayerInterface {
    public List<CardInterface> getHand();
    public List<CardInterface> getDiscards();
    public List<CardInterface> getPlayedCards();
    public String getName();
    public UUID getId();
}
