package fr.univnantes.alma.common;

public interface GameService {

    /**
     * Creates a game for a number of players
     * @param expectedPlayers The number of expected players, between 2 and 7
     *
     * @return an int, the game identification
     */
    int createGame(int expectedPlayers);

    /**
     *
     * @param gameId
     * @param request
     * @return
     */
    int join(int gameId, GameJoinRequest request);

}
