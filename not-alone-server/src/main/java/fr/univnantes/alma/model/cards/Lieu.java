package fr.univnantes.alma.model.cards;

import fr.univnantes.alma.model.inerfaces.CardInterface;
import fr.univnantes.alma.model.pawns.Pawn;
import fr.univnantes.alma.model.pawns.PawnName;
import fr.univnantes.alma.model.players.Player;
import fr.univnantes.alma.model.players.Tracked;
import fr.univnantes.alma.model.utlis.LieuTitle;
import fr.univnantes.alma.model.utlis.SurvieTitle;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class Lieu extends Card{


    private UUID id;
    private boolean power;

    public Lieu(LieuTitle title) {
        super(title);
        this.id = this.generateId();
        this.power = false;

    }

    public UUID generateId(){
        UUID uniqID = UUID.randomUUID();
        return uniqID;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
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

    /**
     * L'exécution des effets des cartes Lieu
     * @param cardTitle le nom de la carte (ANTRE, ABRI etc..)-
     */
    @Override
    public void executeEffect(Object cardTitle) {
        LieuTitle value  = (LieuTitle) cardTitle;

        switch (value){
            case ABRI:
                this.abriEffect();
            case ANTRE:
                this.antreEffect(1);
            case EPAVE:
                this.epaveEffect();
            case PLAGE:
                this.plageEffect(1);
            case ROVER:
                this.roverEffect();
            case JUNGLE:
                this.jungleEffect();
            case MARAIS:
                this.maraisEffect();
            case SOURCE:
                this.sourceEffect(1);
            case RIVIERE:
                this.riviereEffect();
            case ARTEFACT:
                this.artifactEffect();
        }
    }

    /**
     * Les effets des cartes de type "ABRI"
     */
    public void abriEffect(){
        /**
         * Piochez 2 carte Survie, gardez-en une et défaussez l'autre
         */
        List<Survie> survies = new ArrayList<>();
        for(CardInterface card: this.getOwener().getDiscards()){
            if(card instanceof Survie){
                Survie survie = (Survie) card;
                survies.add(survie);
            }
        }
        if(survies.size()>=2){
            this.getOwener().getHand().add(survies.get(0));
            this.getOwener().getDiscards().add(survies.get(1));
        }
    }

    /**
     * Les effets des cartes de type "JUNGLE"
     */
    public void jungleEffect(){
        /**
         * Reprenez en main cette carte Lieu et 1 carte Lieu de votre défausse.
         */
        this.getOwener().getHand().add(new Lieu(LieuTitle.JUNGLE));
        Lieu lieu = null;
        for (CardInterface card: this.getOwener().getDiscards()){
            if(card instanceof Lieu){
                lieu = (Lieu) card;
            }
        }
        if(lieu != null){
            this.getOwener().getHand().add(lieu);
        }
    }

    /**
     * Les effets des cartes de type "RIVIERE"
     */
    public void riviereEffect(){
        /**
         * Au prochain tour, jouez 2 cartes Lieu.
         * Avant de révéler, choisissez-en une et reprenez l'autre en main.
         */
        Player tracked = (Player) this.getOwener();
        List<Lieu> lieux =  new ArrayList<>();
        for(CardInterface card: this.getOwener().getHand()){
            if(card instanceof Lieu){
                Lieu lieu = (Lieu) card;
                lieux.add(lieu);
            }
        }

        if(lieux.size()>=2){
            tracked.playCard(lieux.get(0));
            tracked.playCard(lieux.get(1));

            tracked.getDiscards().add(lieux.get(0));
            tracked.getDiscards().add(lieux.get(1));

            tracked.getHand().remove(lieux.get(0));
            tracked.getHand().remove(lieux.get(1));
        }
    }

    /**
     * Les effets des cartes de type "PLAGE"
     */
    public void plageEffect(int choice){
        switch (choice){
            case 1:

        }
    }

    /**
     * Les effets des cartes de type "ROVER"
     */
    public void roverEffect(){
        /**
         * Prenez de la réserve une carte Lieu que vous ne possédez pas et ajoutez-le à votre main.
         * (pas finie)
         */
        this.getOwener().getHand().add(new Lieu(LieuTitle.ROVER));
    }

    /**
     * Les effets des cartes de type "MARAIS"
     */
    public void maraisEffect(){
        /**
         * Reprenez en main cette carte Lieu et 2 cartes Lieu de votre défausse.
         */
        this.getOwener().getHand().add(new Lieu(LieuTitle.MARAIS));
        List<Lieu> list = new ArrayList<>();
        for (CardInterface card: this.getOwener().getDiscards()){
            if(card instanceof Lieu){
               Lieu lieu = (Lieu) card;
               list.add(lieu);
            }
        }
        if(list.size()>=2){
            this.getOwener().getHand().add(list.get(0));
            this.getOwener().getHand().add(list.get(1));
        }
    }

    /**
     * Les effets des cartes de type "ANTRE"
     */
    public void antreEffect(int choice){
        boolean succes = false;
        List<Lieu> lieux = new ArrayList<>();
        switch (choice){
            /**
             * reprenez en main les cartes Lieu de votre défausse (mais pas celui-ci),
             */
            case 1:
            for(CardInterface card: this.getOwener().getDiscards()){
                if(card instanceof Lieu && card.getName()!=LieuTitle.ANTRE){
                    Lieu lieu = (Lieu)card;
                    lieux.add(lieu);
                }
            }
            if(lieux.size()>0){
                this.getOwener().getHand().addAll(lieux);
            }

                /**
                 * copiez le pouvoir d'un Lieu où le jeton Créature se trouve,
                 */
        case 2:
            // TO DO
        }

    }

    /**
     * Les effets des cartes de type "EPAVE"
     */
    public void epaveEffect(){

    }

    /**
     * Les effets des cartes de type "SOURCE"
     */
    public void sourceEffect(int choice){
        Tracked tracked = (Tracked) this.getOwener();
        switch (choice){
            /**
             * le Traqué de votre choix (vous ou un autre joueur) récupère 1 Volonté,
             */

            case 1:

                tracked.getPawns().add(new Pawn(PawnName.VOLONTE));

                /**
                 * piochez 1 carte Survie
                  */
            case 2:
                tracked.getHand().add(new Survie(SurvieTitle.ESQUIVE));


        }

    }

    /**
     * Les effets des cartes de type "ARTIFACT"
     */
    public void artifactEffect(){

    }
}
