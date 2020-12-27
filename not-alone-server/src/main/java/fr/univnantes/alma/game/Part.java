package fr.univnantes.alma.game;

import fr.univnantes.alma.model.board.Board;
import fr.univnantes.alma.model.cards.CardInterface;
import fr.univnantes.alma.model.players.PlayerInterface;
import fr.univnantes.alma.model.pawns.Pawn;
import fr.univnantes.alma.model.tokens.Token;


import java.util.List;

public class Part {

    List<PlayerInterface> players;
    List<CardInterface> cards;
    List<Pawn> pawns;
    List<Token> tokens;
    Board board;
}
