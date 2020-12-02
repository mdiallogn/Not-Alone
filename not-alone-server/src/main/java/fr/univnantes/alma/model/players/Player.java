package fr.univnantes.alma.model.players;

import fr.univnantes.alma.model.inerfaces.CardInterface;
import fr.univnantes.alma.model.inerfaces.PlayerInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Player implements PlayerInterface {
    private List<CardInterface> hand;
    private List<CardInterface> discards;
    private List<CardInterface> playedCards;
    private String name;
    private UUID id;

        public Player(String name) {
            this.name = name;
            this.hand = new ArrayList<>();
            this.discards = new ArrayList<>();
            this.playedCards = new ArrayList<>();
            this.id = this.generateId();
            this.initialize();
        }

        public UUID generateId(){
            UUID uniqID = UUID.randomUUID();
            return uniqID;
        }

        public abstract void initialize();

        @Override
        public List<CardInterface> getHand() {
            return hand;
        }

        @Override
        public List<CardInterface> getDiscards() {
            return discards;
        }

        @Override
        public List<CardInterface> getPlayedCards() {
            return playedCards;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
         public UUID getId() {
            return id;
         }

         // Piocher
         public void draw(int nbOfCards){
            if(this.discards.size()<nbOfCards){
                System.err.println("il n'y a pas assez de cartes, veuillez diminuer le nombre");
            }else {
                for(int i = 0; i<nbOfCards; i++){
                    CardInterface card = this.discards.get(i);
                    this.hand.add(card);
                    this.discards.remove(card);
                }
            }
         }

         @Override
            public String toString(){
            return this.id+"\n"+this.name;
         }
}
