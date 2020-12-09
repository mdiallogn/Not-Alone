package fr.univnantes.alma.game;


import fr.univnantes.alma.common.GameJoinRequest;
import fr.univnantes.alma.common.GameInterface;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static org.atlanmod.commons.Preconditions.checkArgument;

@Component
public class GameController implements GameInterface {

    private final AtomicInteger idCounter = new AtomicInteger(0);
    private final Map<Integer, Game> games = new HashMap<>();

    @Override
    public int createGame(int expectedPlayers) {
        checkArgument(expectedPlayers > 1 && expectedPlayers <= 7, "A game must have between 2 and 7 players");

        int newId = idCounter.incrementAndGet();
        Game newGame = new Game(expectedPlayers);
        games.put(newId, newGame);

        return newId;
    }

    @Override
    public int join(int gameId, GameJoinRequest request) {
        Game game = games.get(gameId);
        return game.join(request);
    }

}
