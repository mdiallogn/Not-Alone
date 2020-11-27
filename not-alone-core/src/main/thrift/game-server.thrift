include "common.thrift"

namespace java fr.univnantes.alma.thrift

struct JoinRequest {
    1: string name
}

service GameServerService {

    i32 createGame(i32 numberOfPlayers)

    i32 join(i32 gameId, JoinRequest request) throws (1:common.GameNotFound e)
}
