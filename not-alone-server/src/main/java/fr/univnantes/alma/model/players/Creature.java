package fr.univnantes.alma.model.players;

import fr.univnantes.alma.model.cards.Traque;
import fr.univnantes.alma.model.inerfaces.CardInterface;

public class Creature extends Player{

    public Creature(String name) {
        super(name);
    }

    @Override
    public void init() {

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
            boolean resist = tracked.resist();
            if(!resist){
                this.getHand().get(i).setPower(true);
                this.assimilate(tracked);
                this.getHand().remove(card);
            }
        }

    }

    public void assimilate(Tracked palyer){

    }
}
