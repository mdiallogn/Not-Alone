namespace java fr.univnantes.alma.thrift
namespace js core

exception InvalidOperationException {
    1: i32 code,
    2: string description
}

exception GameNotFound {
    1: i32 code,
    2: string description
}
