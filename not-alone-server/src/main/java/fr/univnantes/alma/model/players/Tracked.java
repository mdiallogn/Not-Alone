package fr.univnantes.alma.model.players;

import fr.univnantes.alma.model.cards.Lieu;
import fr.univnantes.alma.model.cards.CardInterface;
import fr.univnantes.alma.model.pawns.Pawn;
import fr.univnantes.alma.model.pawns.PawnName;

import java.util.ArrayList;
import java.util.List;

public class Tracked extends Player{
    private boolean canResist;

    public Tracked(String name) {
        super(name);
        this.canResist = true;
    }

    public void setCanResist(boolean canResist) {
        this.canResist = canResist;
    }

    @Override
    public void init() {

    }

    public void drawLieu(int nbCards){

    }

    public void drawSurvie(int nbCards){

    }

    /**
     * La fonction "lâcher prise"
     * @param choice le choix du traqué
     */
    public void letGo(int choice){
        switch (choice){
            /**
             * Récupérer ses 3 pions Volonté et reprendre en main toutes ses cartes Lieu défaussées
             */
            case 1:
                this.getPawns().add(new Pawn(PawnName.VOLONTE));
                this.getPawns().add(new Pawn(PawnName.VOLONTE));
                this.getPawns().add(new Pawn(PawnName.VOLONTE));
                for(CardInterface card: this.getDiscards()){
                    if(card instanceof Lieu){
                        this.getHand().add(card);
                    }
                }
                /**
                 * Avancer le pion Assimilation d'1 case
                  */
            case 2:
               // TO DO
        }
    }

    /**
     * la fonction résister
     * @param choice le choix du traqué
     * @return true s'il peut résister et false sinon
     */
    public boolean resist(int choice){
        if(!canResist){
            return false;
        }

       List<Pawn> volontes = new ArrayList<>();
       List<Lieu> lieux = new ArrayList<>();
       boolean success = false;

        switch (choice){
            /**
             * perdre 1 pion Volonté pour choisir et reprendre en main 2 cartes Lieu de sa défausse
             */
            case 1:
            for(Pawn p : this.getPawns()){
                if(p.getName() == PawnName.VOLONTE){
                    volontes.add(p);
                }
            }
            if(volontes.size()>=1){
                Pawn p = this.getPawns().get(0);
                p.effect(p.getName());
                this.getPawns().remove(p);
                for(CardInterface card: this.getDiscards()){
                    if(card instanceof Lieu){
                        Lieu lieu = (Lieu)card;
                        lieux.add(lieu);
                    }
                }

                 if(lieux.size()>=2){
                    this.getHand().add(lieux.get(0));
                    this.getHand().add(lieux.get(1));
                    this.getDiscards().remove(lieux.get(0));
                    this.getDiscards().remove(lieux.get(1));
                    success = true;
                 }
            }
            lieux.clear();
            volontes.clear();

            case 2:
                /**
                 * perdre 2 pions Volonté pour choisir et reprendre en main 4 cartes Lieu de sa défausse
                 */
                for(Pawn p : this.getPawns()){
                    if(p.getName() == PawnName.VOLONTE){
                        volontes.add(p);
                    }
                }
                if(volontes.size()>=2){
                    Pawn p = this.getPawns().get(0);
                    Pawn p2 = this.getPawns().get(1);
                    p.effect(p.getName());
                    p2.effect(p2.getName());
                    this.getPawns().remove(p);
                    this.getPawns().remove(p2);

                    for(CardInterface card: this.getDiscards()){
                        if(card instanceof Lieu){
                            Lieu lieu = (Lieu)card;
                            lieux.add(lieu);
                        }
                    }

                    if(lieux.size()>=4){
                        this.getHand().add(lieux.get(0));
                        this.getHand().add(lieux.get(1));
                        this.getHand().add(lieux.get(2));
                        this.getHand().add(lieux.get(3));

                        this.getDiscards().remove(lieux.get(0));
                        this.getDiscards().remove(lieux.get(1));
                        this.getDiscards().remove(lieux.get(2));
                        this.getDiscards().remove(lieux.get(3));
                        success = true;
                    }
                }
                lieux.clear();
                volontes.clear();
        }

        return success;
    }

    /**
     * la fonction exécutée lorsqu'un trqué veut explorer Artemia
     * @return
     */
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
            Lieu lieu = (Lieu)card;
            lieu.setPower(true);
            this.getHand().remove(lieu);
            return true;
        }

        return false;
    }

}
