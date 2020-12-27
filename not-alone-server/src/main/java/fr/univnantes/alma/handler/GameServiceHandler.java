package fr.univnantes.alma.handler;

import fr.univnantes.alma.common.GameInterface;
import fr.univnantes.alma.common.GameJoinRequest;
import fr.univnantes.alma.thrift.GameService;
import fr.univnantes.alma.thrift.JoinRequest;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameServiceHandler implements GameService.Iface {

    @Autowired
    GameInterface service;

    @Override
    public int createGame(int numberOfPlayers) throws TException {
        return service.createGame(numberOfPlayers);
    }

    @Override
    public int join(int gameId, JoinRequest request) throws TException {
        //TODO: translate JoinRequest into GameJoinRequest
        return service.join(gameId, new GameJoinRequest());
    }

    @Override
    public int add(int left, int right) throws TException {
        return left + right;
    }

}
