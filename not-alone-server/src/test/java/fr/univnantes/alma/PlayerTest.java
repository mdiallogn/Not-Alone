package fr.univnantes.alma;

import fr.univnantes.alma.model.players.PlayerInterface;
import fr.univnantes.alma.model.players.Creature;
import fr.univnantes.alma.model.players.Tracked;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void palyerTest(){

        Creature creature = new Creature("CREATURE");

        assertTrue(creature.getTokens().isEmpty());
        assertTrue(creature.getHand().isEmpty());
        assertTrue(creature.getDiscards().isEmpty());

        Tracked tracked = new Tracked("TRACKED");
        assertTrue(tracked.getId()!=null);
        assertTrue(tracked.getPlayedCards().isEmpty());

        assertTrue(tracked instanceof PlayerInterface);
        assertTrue(creature instanceof PlayerInterface);
    }
}
