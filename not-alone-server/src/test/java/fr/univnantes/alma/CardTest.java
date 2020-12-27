package fr.univnantes.alma;

import fr.univnantes.alma.model.cards.Lieu;
import fr.univnantes.alma.model.cards.CardInterface;
import fr.univnantes.alma.model.players.Tracked;
import fr.univnantes.alma.model.utlis.LieuTitle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CardTest {

    @Test
    public void cardTest(){
        Lieu lieu = new Lieu(LieuTitle.ABRI);

        assertTrue(lieu instanceof CardInterface);
        assertEquals(lieu.getDescription(), "descripiton ABRI");
        assertEquals(lieu.getOwener() , null);

        Tracked tracked = new Tracked("TRACKED 1");
        tracked.getHand().add(lieu);
        lieu.setOwener(tracked);
        assertTrue(lieu.getOwener() instanceof Tracked);

    }
}
