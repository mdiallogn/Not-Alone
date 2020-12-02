package fr.univnantes.alma.model.cards;

import fr.univnantes.alma.model.utlis.Phase;
import fr.univnantes.alma.model.utlis.SurvieTitle;

public class Survie extends Card {
    public Survie(SurvieTitle title, Phase phase) {
        super(title, phase);
    }

    @Override
    public String addDescription(Object cardTitle) {
        SurvieTitle value = (SurvieTitle)cardTitle;

        switch (value){
            case VORTEX:
                return "Description";
            case ESQUIVE:
                return "Description";
            case RIPOSTE:
                return "Description";
            case VOLTE_FACE:
                return "Description";

            default:
                return "UnKnown";
        }
    }

    @Override
    public void effect(Object cardTitle) {
        SurvieTitle value = (SurvieTitle)cardTitle;

        switch (value){
            case VORTEX:
                this.vortexEffect();
            case ESQUIVE:
                this.esquiveEffect();
            case RIPOSTE:
                this.riposteEffect();
            case VOLTE_FACE:
                this.volteFaceEffect();
        }
    }

    public void vortexEffect(){

    }

    public void esquiveEffect(){

    }

    public void riposteEffect(){

    }

    public void volteFaceEffect(){

    }
}
