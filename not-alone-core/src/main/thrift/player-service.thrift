include "common.thrift"

namespace java fr.univnantes.alma.thrift
namespace js common

service PlayerService {
  void startGame(i32 gameId)
}
