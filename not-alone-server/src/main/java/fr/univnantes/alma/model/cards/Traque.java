package fr.univnantes.alma.model.cards;

import fr.univnantes.alma.model.pawns.Pawn;
import fr.univnantes.alma.model.pawns.PawnName;
import fr.univnantes.alma.model.players.Tracked;
import fr.univnantes.alma.model.utlis.Phase;
import fr.univnantes.alma.model.utlis.Symbole;
import fr.univnantes.alma.model.utlis.TraqueTitle;

public class Traque extends Card{

    private Phase phase;
    private Symbole symbole;
    Tracked tracked = (Tracked) this.getOwener();

    public Traque(TraqueTitle title) {
        super(title);
        this.addPhaseAndSymbole(title);
    }

    public Traque(TraqueTitle title, Symbole symbole){
        this(title);
        this.symbole = symbole;
    }

    public Symbole getSymbole() {
        return symbole;
    }

    public Phase getPhase() {
        return phase;
    }

    public void addPhaseAndSymbole(TraqueTitle title){
        switch (title){
            case ACHARNEMENT:
                this.phase = Phase.TWO;
            case ANGOISSE:
                this.phase = Phase.ONE;
            case ANTICIPATION:
                this.phase = Phase.TWO;
            case CATACLYSME:
                this.phase = Phase.THREE;
            case CHAMPS_DE_FORCE:
                this.phase = Phase.THREE;
            case CLONE:
                this.phase = Phase.TWO;
            case DEPLOIEMENT:
                this.phase = Phase.THREE;
            case DESESPOIR:
                this.phase = Phase.ONE;
            case DETOUR:
                this.phase = Phase.THREE;
            case DOMINATION:
                this.phase = Phase.TWO;
            case EFFROI:
                this.phase = Phase.ONE;
            case EMPRISE:
                this.phase = Phase.TWO;
            case EPIDEMIE:
                this.phase = Phase.TWO;
            case FAILLE_TEMPORELLE:
                this.phase = Phase.TWO;
            case FLASHBACK:
                this.phase = Phase.TWO;
            case GARGANTUA:
                this.phase = Phase.TWO;
            case HARCELEMENTS:
                this.phase = Phase.TWO;
            case HURLEMENT:
                this.phase = Phase.TWO;
            case INERTIE:
                this.phase = Phase.TWO;
            case INTERFERENCES:
                this.phase = Phase.TWO;
            case INTUITION:
                this.phase = Phase.ONE;
            case MAGNETISME:
                this.phase = Phase.TWO;
            case MIRAGE:
                this.phase = Phase.TWO;
            case MUTATION:
                this.phase = Phase.TWO;
            case PSYCHOSE:
                this.phase = Phase.TWO;
            case REMINISCENCE:
                this.phase = Phase.TWO;
            case REPERAGE:
                this.phase = Phase.FOUR;
            case SABLES_MOUVANTS:
                this.phase = Phase.TWO;
            case SOIF_DE_SANG:
                this.phase = Phase.TWO;
            case STASE:
                this.phase = Phase.FOUR;
            case TELEPATHIE:
                this.phase = Phase.TWO;
            case TORNADE:
                this.phase = Phase.TWO;
            case TOXINE:
                this.phase = Phase.TWO;
            case UBIQUITE:
                this.phase = Phase.TWO;
            case VIRUS:
                this.phase = Phase.TWO;
            case ZONE_INTERDITE:
                this.phase = Phase.TWO;

            default:
                return;
        }
    }

    @Override
    public String addDescription(Object cardTitle) {
        TraqueTitle value = (TraqueTitle)cardTitle;

        switch (value){
            case MUTATION:
                return "Description MUTAION";
            case FLASHBACK:
                return "Description FLASHBACK";
            case ACHARNEMENT:
                return "Description ACHARNEMENT";
            case CHAMPS_DE_FORCE:
                return "Description CHAMPS_DE_FORCE";
            default:
                return "UnKnown";
        }
    }

    @Override
    public void executeEffect(Object cardTitle) {
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
            case CLONE:
                cloneEffect();
            case STASE:
                staseEffect();
            case VIRUS:
                virusEffect();
            case DETOUR:
                detourEffect();
            case EFFROI:
                effroiEffect();
            case MIRAGE:
                mirageEffect();
            case TOXINE:
                toxineEffect();
            case EMPRISE:
                empriseEffect();
            case TORNADE:
                tornadeEffect();
            case ANGOISSE:
                angoisseEffect();
            case EPIDEMIE:
                epidemieEffect();
            case PSYCHOSE:
                psychoseEffect();
            case REPERAGE:
                reperageEffect();
            case UBIQUITE:
                ubiquiteEffect();
            case HURLEMENT:
                hurlementEffect();
            case DESESPOIR:
                desespoirEffect();
            case GARGANTUA:
                gargantuaEffect();
            case INTUITION:
                intuitionEffect();
            case CATACLYSME:
                cataclysmeEffect();
            case DOMINATION:
                dominationEffect();
            case MAGNETISME:
                magnetismeEffect();
            case TELEPATHIE:
                telepathieEffect();
            case DEPLOIEMENT:
                deploiementEffect();
            case ANTICIPATION:
                anticipationEffect();
            case HARCELEMENTS:
                harcelementEffect();
            case REMINISCENCE:
                reminiscenceEffect();
            case SOIF_DE_SANG:
                soifDeSangEffect();
            case ZONE_INTERDITE:
                zoneInterditeEffect();
            case SABLES_MOUVANTS:
                sablesMouvantsEffect();
            case INERTIE:
                this.inertieEffect();
            case INTERFERENCES:
                interferencesEffect();
            case FAILLE_TEMPORELLE:
                failleTemporelleEffect();

            default:
                return;

        }
    }


    public void mutationEffect(){

    }

    public void flashBackEffect(){

    }

    public void acharnementEffect(){
        /**
         * Le jeton Créature fait perdre 1 Volonté supplémentaire
         */

        Pawn pawn = null;
        for(Pawn p: tracked.getPawns()){
            if(p.getName() == PawnName.VOLONTE){
                pawn = p;
            }
        }
        if(pawn != null){
            tracked.getPawns().remove(pawn);
        }

    }

    public void champsDeForceEffect(){

    }

    public void angoisseEffect(){
        /**
         * Les traqués ne peuvent pas Résister
         */
        tracked.setCanResist(false);
    }
    public void anticipationEffect(){
        /**
         * TO DO
         */
    }
    public void cataclysmeEffect(){

    }
    public void cloneEffect(){

    }
    public void deploiementEffect(){

    }
    public void desespoirEffect(){

    }
    public void detourEffect(){

    }
    public void dominationEffect(){

    }
    public void effroiEffect(){

    }
    public void empriseEffect(){

    }
    public void epidemieEffect(){

    }
    public void failleTemporelleEffect(){

    }
    public void gargantuaEffect(){

    }
    public void harcelementEffect(){

    }
    public void hurlementEffect(){

    }
    public void inertieEffect(){

    }
    public void interferencesEffect(){

    }
    public void intuitionEffect(){

    }
    public void magnetismeEffect(){

    }
    public void mirageEffect(){

    }
    public void psychoseEffect(){

    }
    public void reminiscenceEffect(){

    }
    public void reperageEffect(){

    }
    public void sablesMouvantsEffect(){

    }
    public void soifDeSangEffect(){

    }
    public void staseEffect(){

    }
    public void telepathieEffect(){

    }
    public void tornadeEffect(){

    }
    public void toxineEffect(){

    }
    public void ubiquiteEffect(){

    }
    public void virusEffect(){

    }
    public void zoneInterditeEffect(){

    }
}
