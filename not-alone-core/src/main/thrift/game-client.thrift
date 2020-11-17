include "common.thrift"

namespace java fr.univnantes.alma.thrift

service GameClientService {
    bool ping() throws (1:common.InvalidOperationException e)
}
