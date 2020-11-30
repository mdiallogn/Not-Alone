package fr.univnantes.alma.handler;

import fr.univnantes.alma.common.GameJoinRequest;
import fr.univnantes.alma.core.InvalidOperationException;
import fr.univnantes.alma.thrift.GameNotFound;
import fr.univnantes.alma.thrift.GameServerService;
import fr.univnantes.alma.thrift.JoinRequest;
import fr.univnantes.alma.common.GameService;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameServiceHandler implements GameServerService.Iface {

    @Autowired
    GameService service;

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
    public CrossPlatformResource get(int id) throws InvalidOperationException, TException {
        return null;
    }

    @Override
    public List<CrossPlatformResource> getList() throws InvalidOperationException, TException {
        return null;
    }

    @Override
    public boolean ping() throws InvalidOperationException, TException {
        return false;
    }

    @Override
    public void save(CrossPlatformResource resource) throws InvalidOperationException, TException {

    }
}
