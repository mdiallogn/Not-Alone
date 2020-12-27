package fr.univnantes.alma.model.players;

import fr.univnantes.alma.model.cards.Lieu;
import fr.univnantes.alma.model.cards.Traque;
import fr.univnantes.alma.model.cards.CardInterface;
import fr.univnantes.alma.model.tokens.Token;

import java.util.ArrayList;
import java.util.List;

public class Creature extends Player{

    private List<Token> tokens;
    public Creature(String name) {
        super(name);
        this.tokens = new ArrayList<>();
    }

    @Override
    public void init() {

    }

    public List<Token> getTokens() {
        return tokens;
    }

    public void toTraque(Tracked tracked){
        CardInterface card = null;
        int i = 0;
        while (i<this.getHand().size() && card==null){
            if(this.getHand().get(i) instanceof Traque){
                card = this.getHand().get(i);
            }
            i++;
        }
        if(card != null){

            if(!tracked.resist(1) && !tracked.resist(2)){
                Lieu lieu = (Lieu) card;
                lieu.setPower(true);
                this.assimilate(tracked);
                this.getHand().remove(lieu);
            }
        }

    }

    public void assimilate(Tracked palyer){

    }

    public void placeToken(Token token){

    }

    public void drawTraque(int nbCard){

    }
}
