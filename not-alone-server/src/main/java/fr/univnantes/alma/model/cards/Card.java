package fr.univnantes.alma.model.cards;

public class Card {
    private Object  title;
    private Phase phase;
    private String description;

    public enum Lieu {
        ANTRE, JUNGLE, RIVIERE, PLAGE, ROVER, MARAIS, ABRI, EPAVE, SOURCE, ARTEFACT
    }
    public enum Traque{
        ACHARNEMENT, CHAMPS_DE_FORCE, MUTATION, FLASHBACK
    }
    public enum Survie{
        RIPOSTE, VORTEX, ESQUIVE, VOLTE_FACE
    }
    public enum Phase {
        ONE, TWO, THREE, FOUR
    }

    public Card(Object title, Phase phase) {
        this.title = title;
        this.phase = phase;
        this.description = this.addDescription(title);
    }

    public String addDescription(Object cardTitle){
        if (Lieu.ABRI.equals(cardTitle)) {
            return "Description de la carte ABRI";
        } else if (Lieu.ANTRE.equals(cardTitle)) {
            return "Description de la carte ANTRE";
        } else if (Lieu.ARTEFACT.equals(cardTitle)) {
            return "Description de la carte ARTEFACT";
        } else if (Lieu.EPAVE.equals(cardTitle)) {
            return "Description de la carte EPAVE";
        } else if (Lieu.JUNGLE.equals(cardTitle)) {
            return "Description de la carte JUNGLE";
        } else if (Lieu.MARAIS.equals(cardTitle)) {
            return "Description de la carte MARAIS";
        } else if (Lieu.PLAGE.equals(cardTitle)) {
            return "Description de la carte PLAGE";
        } else if (Lieu.RIVIERE.equals(cardTitle)) {
            return "Description de la carte RIVIERE";
        } else if (Lieu.ROVER.equals(cardTitle)) {
            return "Description de la carte ROVER";
        } else if (Lieu.SOURCE.equals(cardTitle)) {
            return "Description de la carte SOURCE";
        }else if(Traque.ACHARNEMENT.equals(cardTitle)){
            return "Description de la carte ACHARNEMENT";
        }else if(Traque.CHAMPS_DE_FORCE.equals(cardTitle)){
            return "Description de la carte CHAMPS_DE_FORCE";
        }else if(Traque.FLASHBACK.equals(cardTitle)){
            return "Description de la carte FLASHBACK";
        }else if(Traque.MUTATION.equals(cardTitle)){
            return "Description de la carte MUTATION";
        }else if(Survie.ESQUIVE.equals(cardTitle)){
            return "Description de la carte ESQUIVE";
        }else if(Survie.RIPOSTE.equals(cardTitle)){
            return "Description de la carte RIPOSTE";
        }else if(Survie.VOLTE_FACE.equals(cardTitle)){
            return "Description de la carte VOLTE_FACE";
        }else if(Survie.VORTEX.equals(cardTitle)){
            return "Description de la carte VORTEX";
        }
        return "UnKnown";
    }


    public Object getTitle() {
        return title;
    }

    public Phase getPhase() {
        return phase;
    }

    public String getDescription() {
        return description;
    }
}
