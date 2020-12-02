package fr.univnantes.alma;


import fr.univnantes.alma.model.cards.Lieu;
import fr.univnantes.alma.model.inerfaces.CardInterface;
import fr.univnantes.alma.model.utlis.LieuTitle;
import fr.univnantes.alma.model.utlis.Phase;

import org.junit.jupiter.api.Test;

public class CardTest {
    @Test
    public void createCardTest(){
        CardInterface card = new Lieu(LieuTitle.ABRI, Phase.ONE);
        System.out.println(card.toString());
        //assertEquals (card.getPhase(), Phase.ONE);

    }
}
