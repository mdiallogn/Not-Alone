package fr.univnantes.alma.model.cards;

import fr.univnantes.alma.model.utlis.LieuTitle;

import java.util.UUID;


public class Lieu extends Card{


    private UUID id;

    public Lieu(LieuTitle title) {
        super(title);
        this.id = this.generateId();

    }

    public UUID generateId(){
        UUID uniqID = UUID.randomUUID();
        return uniqID;
    }


    public UUID getId() {
        return id;
    }


    @Override
    public String addDescription(Object object){
        LieuTitle value = (LieuTitle)object;
        switch (value){
            case ABRI:
                return "descripiton ABRI";
            case ANTRE:
                return "descripiton ANTRE";
            case EPAVE:
                return "descripiton EPAVE";
            case PLAGE:
                return "descripiton PLAGE";
            case ROVER:
                return "descripiton ROVER";
            case JUNGLE:
                return "descripiton JUNGLE";
            case MARAIS:
                return "descripiton MARAIS";
            case SOURCE:
                return "descripiton SOURCE";
            case RIVIERE:
                return "descripiton RIVIERE";
            case ARTEFACT:
                return "descripiton ARTEFACT";

            default:
                return "unKonwn";
        }
    }

    @Override
    public void effect(Object cardTitle) {
        LieuTitle value  = (LieuTitle) cardTitle;

        switch (value){
            case ABRI:
                this.abriEffect();
            case ANTRE:
                this.antreEffect();
            case EPAVE:
                this.epaveEffect();
            case PLAGE:
                this.plageEffect();
            case ROVER:
                this.roverEffect();
            case JUNGLE:
                this.jungleEffect();
            case MARAIS:
                this.maraisEffect();
            case SOURCE:
                this.sourceEffect();
            case RIVIERE:
                this.riviereEffect();
            case ARTEFACT:
                this.artifactEffect();
        }
    }

    public void abriEffect(){

    }

    public void jungleEffect(){

    }

    public void riviereEffect(){

    }

    public void plageEffect(){

    }

    public void roverEffect(){

    }

    public void maraisEffect(){

    }

    public void antreEffect(){

    }

    public void epaveEffect(){

    }

    public void sourceEffect(){

    }

    public void artifactEffect(){

    }
}
