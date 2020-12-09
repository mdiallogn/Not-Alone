package fr.univnantes.alma.game;

import fr.univnantes.alma.model.cards.Lieu;
import fr.univnantes.alma.model.cards.Survie;
import fr.univnantes.alma.model.cards.Traque;
import fr.univnantes.alma.model.players.Creature;
import fr.univnantes.alma.model.players.Tracked;
import fr.univnantes.alma.model.utlis.LieuTitle;
import fr.univnantes.alma.model.utlis.SurvieTitle;
import fr.univnantes.alma.model.utlis.TraqueTitle;

import java.util.ArrayList;
import java.util.List;

public class InitData {

    public static List<Lieu> generateLieucards(int numbersOfCardsForEachType){
        List<Lieu> lieux = new ArrayList<>();
        for(int i=0; i<numbersOfCardsForEachType; i++){
            for(LieuTitle lieuTitle: LieuTitle.values()){
                lieux.add(new Lieu(lieuTitle));
            }
        }
        return lieux;
    }

    public static List<Survie> generateSurvieCards(int numbersOfCardsForEachType){
        List<Survie> survies = new ArrayList<>();
        for(int i=0; i<numbersOfCardsForEachType; i++){
            for(SurvieTitle title: SurvieTitle.values()){
                survies.add(new Survie(title));
            }
        }
        return survies;
    }

    public static List<Traque> generateTraqueCards(int numbersOfCardsForEachType){
        List<Traque> traques = new ArrayList<>();
        for(int i=0; i<numbersOfCardsForEachType; i++){
            for(TraqueTitle title: TraqueTitle.values()){
                traques.add(new Traque(title));
            }
        }
        return traques;
    }

    public static List<Tracked> createTrackedPlayers(int numbersOfTracked){
        List<Tracked> trackeds = new ArrayList<>();
        for(int i=0; i<numbersOfTracked; i++){
            trackeds.add(new Tracked("TRACKED_"+i));
        }
        return trackeds;
    }

    public static Creature createCreature(){
        return new Creature("CREATURE");
    }
}
