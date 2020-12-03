package fr.univnantes.alma.model.players;

import fr.univnantes.alma.model.cards.Lieu;
import fr.univnantes.alma.model.cards.Survie;
import fr.univnantes.alma.model.inerfaces.CardInterface;

public class Tracked extends Player{
    public Tracked(String name) {
        super(name);
    }

    @Override
    public void init() {

    }

    /**
     * lâcher prise
     */
    public void letGo(){

    }

    /**
     * résister
     */
    public boolean resist(){
        CardInterface card = null;

        for(CardInterface cardSurvie:  this.getHand()){
            if(cardSurvie instanceof Survie){
                card = cardSurvie;
            }
        }
        if(card != null){
            this.getHand().remove(card);
            return true;
        }

        return false;
    }

    public boolean exploreArtemia(){
        CardInterface card = null;
        int i = 0;
            while (i<this.getHand().size() && card==null){
                if(this.getHand().get(i) instanceof Lieu){
                    card = this.getHand().get(i);
                }
                i++;
            }
        if(card != null){
            this.getHand().get(i).setPower(true);
            this.getHand().remove(card);
            return true;
        }

        return false;
    }
}
