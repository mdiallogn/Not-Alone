package fr.univnantes.alma.model.cards;

import fr.univnantes.alma.model.utlis.Phase;
import fr.univnantes.alma.model.utlis.TraqueTitle;

public class Traque extends Card{
    public Traque(TraqueTitle title, Phase phase) {
        super(title, phase);
    }

    @Override
    public String addDescription(Object cardTitle) {
        TraqueTitle value = (TraqueTitle)cardTitle;

        switch (value){
            case MUTATION:
                return "Description";
            case FLASHBACK:
                return "Description";
            case ACHARNEMENT:
                return "Description";
            case CHAMPS_DE_FORCE:
                return "Description";

            default:
                return "UnKnown";
        }
    }

    @Override
    public void effect(Object cardTitle) {
        TraqueTitle value = (TraqueTitle)cardTitle;
        switch (value){
            case MUTATION:
                this.mutationEffect();
            case FLASHBACK:
                this.flashBackEffect();
            case ACHARNEMENT:
                this.acharnementEffect();
            case CHAMPS_DE_FORCE:
                this.champsDeForceEffect();
        }
    }

    public void mutationEffect(){

    }

    public void flashBackEffect(){

    }

    public void acharnementEffect(){

    }

    public void champsDeForceEffect(){

    }
}
