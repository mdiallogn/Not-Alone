include "common.thrift"

namespace java fr.univnantes.alma.thrift
namespace js common

struct JoinRequest {
    1: string name
}

service GameService {

    i32 createGame(i32 numberOfPlayers)

    i32 join(i32 gameId, JoinRequest request) throws (1:common.GameNotFound e)
}
