include "common.thrift"

struct CrossPlatformResource {
    1: i32 id,
    2: string name,
    3: optional string salutation
}

service GameServerService {

    CrossPlatformResource get(1:i32 id) throws (1:common.InvalidOperationException e),

    void save(1:CrossPlatformResource resource) throws (1:common.InvalidOperationException e),

    list <CrossPlatformResource> getList() throws (1:common.InvalidOperationException e),

    bool ping() throws (1:common.InvalidOperationException e)
}
