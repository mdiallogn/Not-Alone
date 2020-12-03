package fr.univnantes.alma.model.tokens;

public class Token {

    private TokenName name;

    public Token(TokenName name) {
        this.name = name;
    }

    public TokenName getName() {
        return name;
    }

    public void effect(TokenName name){
        switch (name){
            case CIBLE:
                this.cibleEffect();
                break;
            case ARTEMIA:
                this.artemiaEffect();
                break;
            case CREATURE:
                this.creatureEffect();

        }
    }

    public void cibleEffect(){

    }

    public void artemiaEffect(){

    }

    public void creatureEffect(){

    }

}
