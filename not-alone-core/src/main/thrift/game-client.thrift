include "common.thrift"

service GameClientService {
    bool ping() throws (1:common.InvalidOperationException e)
}
