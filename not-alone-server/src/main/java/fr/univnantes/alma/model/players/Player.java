package fr.univnantes.alma.model.players;


import fr.univnantes.alma.model.board.Box;
import fr.univnantes.alma.model.cards.Card;
import fr.univnantes.alma.model.cards.CardInterface;
import fr.univnantes.alma.model.pawns.Pawn;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Player implements PlayerInterface {
    private List<CardInterface> hand;
    private List<CardInterface> discards;
    private List<CardInterface> playedCards;
    private List<Pawn> pawns;
    private String name;
    private UUID id;

        public Player(String name) {
            this.name = name;
            this.hand = new ArrayList<>();
            this.discards = new ArrayList<>();
            this.playedCards = new ArrayList<>();
            this.pawns = new ArrayList<>();
            this.id = this.generateId();
            this.init();
        }

        public UUID generateId(){
            UUID uniqID = UUID.randomUUID();
            return uniqID;
        }

    public List<Pawn> getPawns() {
        return pawns;
    }

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



         @Override
            public String toString(){
            return this.id+"\n"+this.name;
         }

         public abstract void init();

        public void placePawn(Pawn pawn, Box box){
                if(box.getContains()==null){
                    box.getContains().put(this, pawn);
                }else {
                    System.err.println("Unavailable box !");
                }
        }

        public void mouvePawn(Pawn pawn, Box source, Box target){
            this.placePawn(pawn, target);
            source.getContains().clear();
        }


        public void playCard(Card card){
            card.executeEffect(card.getName());
            this.playedCards.add(card);
            this.hand.remove(card);
        }


}
