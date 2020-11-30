package fr.univnantes.alma.model.players;

import fr.univnantes.alma.model.cards.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Player {
    private List<Card> hand;
    private List<Card> discard;
    private List<Card> playedCards;
    private String name;
    private UUID id;

        public Player(String name) {
            this.name = name;
            this.hand = new ArrayList<>();
            this.discard = new ArrayList<>();
            this.playedCards = new ArrayList<>();
            this.id = this.generateId();

        }

        public UUID generateId(){
            UUID uniqID = UUID.randomUUID();
            return uniqID;
        }

        public void initialize(){

        }

        public List<Card> getHand() {
            return hand;
        }

        public List<Card> getDiscard() {
            return discard;
        }

        public List<Card> getPlayedCards() {
            return playedCards;
        }

        public String getName() {
            return name;
        }

         public UUID getId() {
            return id;
         }

         // Piocher
         public void draw(int nbOfCards){
            if(this.discard.size()<nbOfCards){
                System.err.println("il n'y a pas assez de cartes, veuillez diminuer le nombre");
            }else {
                for(int i = 0; i<nbOfCards; i++){
                    Card card = this.discard.get(i);
                    this.hand.add(card);
                    this.discard.remove(card);
                }
            }
         }
}
