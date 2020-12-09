package fr.univnantes.alma.model.cards;

import fr.univnantes.alma.model.utlis.Phase;
import fr.univnantes.alma.model.utlis.SurvieTitle;

public class Survie extends Card {

    private Phase phase;
    public Survie(SurvieTitle title) {
        super(title);
        this.addPhase(title);
    }

    public Phase getPhase() {
        return phase;
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
                return "OTHER";
        }
    }

    @Override
    public void executeEffect(Object cardTitle) {
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
                /**
                 * ....... TO DO
                  */
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

    private void addPhase(SurvieTitle title){
        switch (title){
            case DRONE:
                this.phase = Phase.THREE;
            case ADRENALINE:
                this.phase = Phase.ONE;
            case ALERTE:
                this.phase = Phase.THREE;
            case AMPLIFICATEUR:
                this.phase = Phase.FOUR;
            case BROUILLAGE:
                this.phase = Phase.ONE;
            case CAVALE:
                this.phase = Phase.ONE;
            case DETECTEUR:
                this.phase = Phase.THREE;
            case ENTRAVE:
                this.phase = Phase.ONE;
            case EQUIPEMENT:
                this.phase = Phase.FOUR;
            case ESQUIVE:
                this.phase = Phase.THREE;
            case FAUSSE_PISTE:
                this.phase = Phase.THREE;
            case HOLOGRAMME:
                this.phase = Phase.THREE;
            case LEURRE:
                this.phase = Phase.THREE;
            case MIMETISME:
                this.phase = Phase.ONE;
            case NAVETTE:
                this.phase = Phase.FOUR;
            case PLANQUES:
                this.phase = Phase.FOUR;
            case PORTAIL:
                this.phase = Phase.THREE;
            case RALLIMENT:
                this.phase = Phase.FOUR;
            case REFUSE:
                this.phase = Phase.ONE;
            case REGENERATION:
                this.phase = Phase.THREE;
            case RESISTANCE:
                this.phase = Phase.THREE;
            case RETRAITE:
                this.phase = Phase.THREE;
            case RIPOSTE:
                this.phase = Phase.ONE;
            case SACRIFICE:
                this.phase = Phase.ONE;
            case SECOND_SOUFLE:
                this.phase = Phase.ONE;
            case SIXIEME_SENS:
                this.phase = Phase.ONE;
            case SYSTEME_D:
                this.phase = Phase.ONE;
            case TENACITE:
                this.phase = Phase.ONE;
            case VACCIN:
                this.phase = Phase.ONE;
            case VOLTE_FACE:
                this.phase = Phase.FOUR;
            case VORTEX:
                this.phase = Phase.TWO;
        }
    }

}
