package fr.univnantes.alma.model.pawns;

public class Pawn {

    private PawnName name;

    public Pawn(PawnName pawnName) {
        this.name = pawnName;
    }

    public PawnName getName() {
        return name;
    }

    public void effect(PawnName name){
        switch (name){
            case BALISE:
                this.baliseEffect();
                break;
            case SECOURS:
                this.secoursEffect();
                break;
            case VOLONTE:
                this.volonteEffect();
                break;
            case ASSIMILATION:
                this.assimilationEffect();
        }
    }

    public void baliseEffect(){

    }

    public void secoursEffect(){

    }

    public void volonteEffect(){

    }

    public void assimilationEffect(){

    }
}
